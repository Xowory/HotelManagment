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

public class Controller_wyszukaj {
    public String nazwisko2;
    @FXML TableView<Rezerwacje> tab;
    @FXML TableColumn<Rezerwacje,String> nr_pokoju;
    @FXML TableColumn<Rezerwacje, String> data_od;
    @FXML TableColumn<Rezerwacje,String> data_do;
    @FXML TableColumn<Rezerwacje,String> nazwisko;
    private ObservableList<Rezerwacje> rezerwacje = FXCollections.observableArrayList();
    private JSONObject object = new JSONObject();
    public void initialize(String s) throws IOException {
        object.put("nazwisko",s);
        JSONObject wyslij = new JSONObject();
        wyslij.put("wyszukaj_rezerwacje",object);
        Serwer_pol wyslanie = new Serwer_pol(wyslij);

        JSONObject odbierz = wyslanie.wysylanie();
        JSONArray array = odbierz.getJSONArray("wyszukaj_rezerwacje");

        nr_pokoju.setCellValueFactory(new PropertyValueFactory<>("nr_pokoju"));
        data_od.setCellValueFactory(new PropertyValueFactory<>("data_od"));
        data_do.setCellValueFactory(new PropertyValueFactory<>("data_do"));
        nazwisko.setCellValueFactory(new PropertyValueFactory<>("nazwisko"));

        for (int i = 0; i < array.length(); i++) {
            JSONObject rezerwacja = (JSONObject) array.get(i);
            int nr_pokoju = rezerwacja.getInt("nr_pokoju");
            String data_od = rezerwacja.getString("data_od").substring(0,10);
            String data_do = rezerwacja.getString("data_do").substring(0,10);
            String nazwisko = rezerwacja.getString("nazwisko");
            rezerwacje.add(new Rezerwacje(nr_pokoju, data_od, data_do, nazwisko));
        }

        tab.setItems(rezerwacje);
    }
}
