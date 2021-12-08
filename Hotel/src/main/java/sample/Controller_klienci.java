package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;

public class Controller_klienci {
    @FXML TableView<Klient> tab;
    @FXML TableColumn<Klient,String> nazwisko;
    @FXML TableColumn<Klient,String> mail;
    @FXML TableColumn<Klient,String> telefon;
    private ObservableList<Klient> klienci = FXCollections.observableArrayList();
    public void initialize() throws IOException {
        JSONObject wyslij = new JSONObject("{lista_klientow:lista_klientow}");
        Serwer_pol wyslanie = new Serwer_pol(wyslij);

        JSONObject odbierz = wyslanie.wysylanie();
        JSONArray array = odbierz.getJSONArray("lista_klientow");

        nazwisko.setCellValueFactory(new PropertyValueFactory<>("nazwisko"));
        mail.setCellValueFactory(new PropertyValueFactory<>("mail"));
        telefon.setCellValueFactory(new PropertyValueFactory<>("telefon"));

        for (int i = 0; i < array.length(); i++) {
            JSONObject rezerwacja = (JSONObject) array.get(i);
            String nazwisko = rezerwacja.getString("nazwisko");
            String mail = rezerwacja.getString("mail");
            String telefon = rezerwacja.getString("telefon");
            klienci.add(new Klient(nazwisko,mail,telefon));
        }

        tab.setItems(klienci);
    }
}
