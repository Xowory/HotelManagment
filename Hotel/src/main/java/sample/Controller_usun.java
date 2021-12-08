package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import org.json.JSONObject;

import java.io.IOException;

public class Controller_usun {
    @FXML DatePicker od;
    @FXML DatePicker do2;
    @FXML TextField nr_pokoju;
    @FXML TextField nazwisko;
    private JSONObject usun = new JSONObject();
    public  void anuluj() throws IOException{
        if(nazwisko.getLength() == 0 || od.getValue().isAfter(do2.getValue()) || nr_pokoju.getLength() == 0){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText("Błąd!");
            alert.setContentText("Wprowadź poprawne dane!");
            alert.showAndWait();
            return;
        }
        usun.put("nr_pokoju",nr_pokoju.getCharacters());
        usun.put("nazwisko",nazwisko.getCharacters());
        usun.put("data_od",od.getValue());
        usun.put("data_do",do2.getValue());
        JSONObject wyslij = new JSONObject();
        wyslij.put("anuluj_rezerwacje",usun);
        Serwer_pol wyslanie = new Serwer_pol(wyslij);

        JSONObject odbierz = wyslanie.wysylanie();
        if(odbierz.has("blad")){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText("Błąd!");
            alert.setContentText("Rezerwacja nie istnieje!");
            alert.showAndWait();
        }
        else{
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setHeaderText("Usunięto rezerwację!");
            alert.showAndWait();
        }
        }
}
