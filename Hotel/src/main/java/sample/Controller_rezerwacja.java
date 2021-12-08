package sample;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import org.json.JSONObject;

import java.io.IOException;
import java.sql.SQLException;

public class Controller_rezerwacja {
    @FXML private Button button;
    @FXML private TextField nazwisko;
    @FXML private TextField mail;
    @FXML private TextField telefon;
    @FXML private ChoiceBox pokoj;
    @FXML private DatePicker od;
    @FXML private DatePicker do2;
    private JSONObject dodaj = new JSONObject();

    public Controller_rezerwacja() throws SQLException {
    }

    @FXML
    public void rezerwuj() throws IOException, SQLException {
        if(nazwisko.getLength() == 0 || mail.getLength() == 0 || telefon.getLength() == 0 || pokoj.getSelectionModel().getSelectedItem().toString().equals(" ") || od.getValue().isAfter(do2.getValue())){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText("Błąd rezerwacji");
            alert.setContentText("Wprowadź poprawne dane!");
            alert.showAndWait();
            return;
        }
        dodaj.put("nazwisko", nazwisko.getCharacters());
        dodaj.put("nr_pokoju",pokoj.getSelectionModel().getSelectedItem().toString());
        dodaj.put("data_od",od.getValue());
        dodaj.put("data_do",do2.getValue());
        dodaj.put("mail",mail.getCharacters());
        dodaj.put("telefon",telefon.getCharacters());
        JSONObject wyslij = new JSONObject();
        wyslij.put("dodaj",dodaj);
        Serwer_pol wyslanie = new Serwer_pol(wyslij);

        JSONObject odbierz = wyslanie.wysylanie();
        if(odbierz.has("zajety")){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText("Pokój zajęty!");
            alert.setContentText(" Proszę wybrać inny pokój lub termin!");
            alert.showAndWait();
        }
        else{
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setHeaderText("Złożono rezerwację!");
            alert.showAndWait();
        }
    }

}
