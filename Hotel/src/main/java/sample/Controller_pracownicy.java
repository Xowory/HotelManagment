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

public class Controller_pracownicy {
    @FXML TableView<Pracownicy> tab;
    @FXML TableColumn<Pracownicy,String> nazwisko;
    @FXML TableColumn<Pracownicy,String> login;
    @FXML TableColumn<Pracownicy,String> haslo;
    private ObservableList<Pracownicy> pracownicy = FXCollections.observableArrayList();
    public void initialize() throws IOException {
        JSONObject wyslij = new JSONObject("{lista_pracownikow:lista_pracownikow}");
        Serwer_pol wyslanie = new Serwer_pol(wyslij);

        JSONObject odbierz = wyslanie.wysylanie();
        JSONArray array = odbierz.getJSONArray("lista_pracownikow");

        nazwisko.setCellValueFactory(new PropertyValueFactory<>("nazwisko"));
        login.setCellValueFactory(new PropertyValueFactory<>("login"));
        haslo.setCellValueFactory(new PropertyValueFactory<>("haslo"));

        for (int i = 0; i < array.length(); i++) {
            JSONObject rezerwacja = (JSONObject) array.get(i);
            String nazwisko = rezerwacja.getString("nazwisko");
            String login = rezerwacja.getString("login");
            String haslo = rezerwacja.getString("haslo");
            pracownicy.add(new Pracownicy(nazwisko,login,haslo));
        }

        tab.setItems(pracownicy);
    }
}
