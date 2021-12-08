package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import org.json.JSONObject;

import java.io.IOException;

public class Controller_dodaj_pracownika {
    @FXML TextField nazwisko;
    @FXML TextField login;
    @FXML TextField haslo;
    @FXML Button button;
    private JSONObject dodaj = new JSONObject();
    private JSONObject usun = new JSONObject();
    @FXML
    protected void dodaj_pracownika() throws IOException {
        if(nazwisko.getLength() == 0 || login.getLength() == 0 || haslo.getLength() == 0){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText("Błąd");
            alert.setContentText("Wprowadź poprawne dane!");
            alert.showAndWait();
            return;
        }
        dodaj.put("nazwisko",nazwisko.getCharacters());
        dodaj.put("login",login.getCharacters());
        dodaj.put("haslo",haslo.getCharacters());
        JSONObject wyslij = new JSONObject();
        wyslij.put("dodaj_pracownika",dodaj);
        Serwer_pol wyslanie = new Serwer_pol(wyslij);

        JSONObject odbierz = wyslanie.wysylanie();
        if(odbierz.has("zajety")){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText("Login zajęty!");
            alert.setContentText("Proszę wybrać inny login!");
            alert.showAndWait();
        }
        else{
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setHeaderText("Dodano dane pracownika!");
            alert.showAndWait();
            Stage dialogStage = (Stage) button.getScene().getWindow();
            dialogStage.close();
        }
    }

    @FXML
    protected void usun_pracownika() throws IOException {
        if(login.getLength() == 0){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText("Błąd!");
            alert.setContentText("Wprowadź poprawne dane!");
            alert.showAndWait();
            return;
        }
        usun.put("login",login.getCharacters());
        JSONObject wyslij = new JSONObject();
        wyslij.put("usun_pracownika",usun);
        Serwer_pol wyslanie = new Serwer_pol(wyslij);

        JSONObject odbierz = wyslanie.wysylanie();
        if(odbierz.has("usunieto")){
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setHeaderText("Usunięto dane pracownika!");
            alert.showAndWait();
            Stage dialogStage = (Stage) button.getScene().getWindow();
            dialogStage.close();
        }
        else{
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText("Błąd!");
            alert.setContentText("Pracownik o podanym loginie nie istnieje!");
            alert.showAndWait();
        }
    }
}
