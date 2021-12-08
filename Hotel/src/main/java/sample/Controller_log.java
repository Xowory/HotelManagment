package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import org.json.JSONObject;

import java.io.IOException;

public class Controller_log {
    @FXML private TextField login;
    @FXML private TextField nazwisko;
    @FXML private PasswordField haslo;
    @FXML private Button btn;
    @FXML
    protected void pracownik() throws Exception{
        JSONObject wyslij = new JSONObject("{logowanie:logowanie}");
        wyslij.put("login",login.getText());
        wyslij.put("haslo",haslo.getText());
        Serwer_pol wyslanie = new Serwer_pol(wyslij);

        JSONObject odbierz = wyslanie.wysylanie();
        String login2 = null;
        String haslo2 = null;
        if(!odbierz.isEmpty()) {
            login2 = odbierz.getString("login");
            haslo2 = odbierz.getString("haslo");
        }
        if(login.getText().equals(login2) && haslo.getText().equals(haslo2)) {
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("/pracownik.fxml"));
            Parent parent = fxmlLoader.load();

            Scene scene2 = new Scene(parent, 350, 160);
            Stage window = new Stage();
            window.setTitle("Panel pracownika");
            window.setScene(scene2);
            window.show();
            Stage dialogStage = (Stage) btn.getScene().getWindow();
            dialogStage.close();
        }
        else if(login.getText().equals("admin") && haslo.getText().equals("admin")){
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("/admin.fxml"));
            Parent parent = fxmlLoader.load();

            Scene scene2 = new Scene(parent, 350, 160);
            Stage window = new Stage();
            window.setTitle("Panel administratora");
            window.setScene(scene2);
            window.show();
            Stage dialogStage = (Stage) btn.getScene().getWindow();
            dialogStage.close();
        }
        else{
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText("Błąd logowania!");
            alert.setContentText("Błędny login lub hasło.");
            alert.showAndWait();
            return;
        }
    }
    @FXML
    protected void wyswietl_rezerwacje() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("/wyswietl_rezerwacje.fxml"));
        Parent parent = fxmlLoader.load();

        Scene scene2 = new Scene(parent, 495, 400);
        Stage window = new Stage();
        window.setTitle("Rezerwacje");
        window.setScene(scene2);
        window.show();
    }

    @FXML
    protected void szukaj_rezerwacji() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("/znalezione_rezerwacje.fxml"));
        Parent parent = fxmlLoader.load();
        Controller_wyszukaj controller = fxmlLoader.getController();
        controller.initialize(nazwisko.getText());

        Scene scene2 = new Scene(parent, 495, 400);
        Stage window = new Stage();
        window.setTitle("Rezerwacje");
        window.setScene(scene2);
        window.show();
    }

    @FXML
    protected void wyszukaj_rezerwacje() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("/wyszukaj_rezerwacje.fxml"));
        Parent parent = fxmlLoader.load();

        Scene scene2 = new Scene(parent, 350, 100);
        Stage window = new Stage();
        window.setTitle("Szukaj rezerwacji");
        window.setScene(scene2);
        window.show();
    }

    @FXML
    protected void usun_rezerwacje() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("/usun_rezerwacje.fxml"));
        Parent parent = fxmlLoader.load();

        Scene scene2 = new Scene(parent, 350, 260);
        Stage window = new Stage();
        window.setTitle("Usuń rezerwację");
        window.setScene(scene2);
        window.show();
    }

    @FXML
    protected void lista_klientow() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("/lista_klientow.fxml"));
        Parent parent = fxmlLoader.load();

        Scene scene2 = new Scene(parent, 420, 400);
        Stage window = new Stage();
        window.setTitle("Lista klientów");
        window.setScene(scene2);
        window.show();
    }

    @FXML
    protected void lista_pracownikow() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("/lista_pracownikow.fxml"));
        Parent parent = fxmlLoader.load();

        Scene scene2 = new Scene(parent, 420, 400);
        Stage window = new Stage();
        window.setTitle("Lista pracowników");
        window.setScene(scene2);
        window.show();
    }

    @FXML
    protected void dodaj_pracownika() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("/dodaj_pracownika.fxml"));
        Parent parent = fxmlLoader.load();

        Scene scene2 = new Scene(parent, 350, 150);
        Stage window = new Stage();
        window.setTitle("Dodaj pracownika");
        window.setScene(scene2);
        window.show();
    }

    @FXML
    protected void usun_pracownika() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("/usun_pracownika.fxml"));
        Parent parent = fxmlLoader.load();

        Scene scene2 = new Scene(parent, 350, 100);
        Stage window = new Stage();
        window.setTitle("Usuń pracownika");
        window.setScene(scene2);
        window.show();
    }
}
