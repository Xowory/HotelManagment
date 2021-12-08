package sample;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    @FXML TableColumn<Days, String> nrPokoju;
    @FXML TableColumn<Days, String> k1;
    @FXML TableColumn<Days, String> k2;
    @FXML TableColumn<Days, String> k3;
    @FXML TableColumn<Days, String> k4;
    @FXML TableColumn<Days, String> k5;
    @FXML TableColumn<Days, String> k6;
    @FXML TableColumn<Days, String> k7;
    @FXML TableColumn<Days, String> k8;
    @FXML TableColumn<Days, String> k9;
    @FXML TableColumn<Days, String> k10;
    @FXML TableColumn<Days, String> k11;
    @FXML TableColumn<Days, String> k12;
    @FXML TableColumn<Days, String> k13;
    @FXML TableColumn<Days, String> k14;
    @FXML TableColumn<Days, String> k15;
    @FXML TableColumn<Days, String> k16;
    @FXML TableColumn<Days, String> k17;
    @FXML TableColumn<Days, String> k18;
    @FXML TableColumn<Days, String> k19;
    @FXML TableColumn<Days, String> k20;
    @FXML TableColumn<Days, String> k21;
    @FXML TableColumn<Days, String> k22;
    @FXML TableColumn<Days, String> k23;
    @FXML TableColumn<Days, String> k24;
    @FXML TableColumn<Days, String> k25;
    @FXML TableColumn<Days, String> k26;
    @FXML TableColumn<Days, String> k27;
    @FXML TableColumn<Days, String> k28;
    @FXML TableColumn<Days, String> k29;
    @FXML TableColumn<Days, String> k30;
    @FXML TableColumn<Days, String> k31;
    @FXML ComboBox comboBox;
    @FXML ComboBox comboBox_rok;
    @FXML TableView<Days> tab;
    @FXML AnchorPane pane;
    @FXML
    public void initialize(URL location, ResourceBundle resources) {
        comboBox.valueProperty().addListener(new ChangeListener() {
            @Override
            public void changed(ObservableValue observableValue, Object o, Object t1) {
                if(comboBox.getValue().equals("Styczeń") || comboBox.getValue().equals("Luty") || comboBox.getValue().equals("Marzec") || comboBox.getValue().equals("Kwiecień") || comboBox.getValue().equals("Maj") || comboBox.getValue().equals("Czerwiec") || comboBox.getValue().equals("Lipiec") || comboBox.getValue().equals("Sierpień") || comboBox.getValue().equals("Wrzesień") || comboBox.getValue().equals("Październik") || comboBox.getValue().equals("Listopad") || comboBox.getValue().equals("Grudzień")) {
                    try {
                        tab.setItems(parseList());
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        comboBox_rok.valueProperty().addListener(new ChangeListener() {
            @Override
            public void changed(ObservableValue observableValue, Object o, Object t1) {
                if(comboBox_rok.getValue().equals("2020") || comboBox_rok.getValue().equals("2021") || comboBox_rok.getValue().equals("2022") || comboBox_rok.getValue().equals("2023") || comboBox_rok.getValue().equals("2024")) {
                    try {
                        tab.setItems(parseList());
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        nrPokoju.setCellValueFactory(new PropertyValueFactory<Days,String>("nrPokoju"));
        k1.setCellValueFactory(new PropertyValueFactory<Days,String>("k1"));
        k2.setCellValueFactory(new PropertyValueFactory<Days,String>("k2"));
        k3.setCellValueFactory(new PropertyValueFactory<Days,String>("k3"));
        k4.setCellValueFactory(new PropertyValueFactory<Days,String>("k4"));
        k5.setCellValueFactory(new PropertyValueFactory<Days,String>("k5"));
        k6.setCellValueFactory(new PropertyValueFactory<Days,String>("k6"));
        k7.setCellValueFactory(new PropertyValueFactory<Days,String>("k7"));
        k8.setCellValueFactory(new PropertyValueFactory<Days,String>("k8"));
        k9.setCellValueFactory(new PropertyValueFactory<Days,String>("k9"));
        k10.setCellValueFactory(new PropertyValueFactory<Days,String>("k10"));
        k11.setCellValueFactory(new PropertyValueFactory<Days,String>("k11"));
        k12.setCellValueFactory(new PropertyValueFactory<Days,String>("k12"));
        k13.setCellValueFactory(new PropertyValueFactory<Days,String>("k13"));
        k14.setCellValueFactory(new PropertyValueFactory<Days,String>("k14"));
        k15.setCellValueFactory(new PropertyValueFactory<Days,String>("k15"));
        k16.setCellValueFactory(new PropertyValueFactory<Days,String>("k16"));
        k17.setCellValueFactory(new PropertyValueFactory<Days,String>("k17"));
        k18.setCellValueFactory(new PropertyValueFactory<Days,String>("k18"));
        k19.setCellValueFactory(new PropertyValueFactory<Days,String>("k19"));
        k20.setCellValueFactory(new PropertyValueFactory<Days,String>("k20"));
        k21.setCellValueFactory(new PropertyValueFactory<Days,String>("k21"));
        k22.setCellValueFactory(new PropertyValueFactory<Days,String>("k22"));
        k23.setCellValueFactory(new PropertyValueFactory<Days,String>("k23"));
        k24.setCellValueFactory(new PropertyValueFactory<Days,String>("k24"));
        k25.setCellValueFactory(new PropertyValueFactory<Days,String>("k25"));
        k26.setCellValueFactory(new PropertyValueFactory<Days,String>("k26"));
        k27.setCellValueFactory(new PropertyValueFactory<Days,String>("k27"));
        k28.setCellValueFactory(new PropertyValueFactory<Days,String>("k28"));
        k29.setCellValueFactory(new PropertyValueFactory<Days,String>("k29"));
        k30.setCellValueFactory(new PropertyValueFactory<Days,String>("k30"));
        k31.setCellValueFactory(new PropertyValueFactory<Days,String>("k31"));
        k1.setCellFactory(column -> {
            return new TableCell<Days, String>(){
                @Override
                protected void updateItem(String item, boolean empty){
                    super.updateItem(item,empty);

                    if(item == null || empty){
                        setText(null);
                        setStyle("");
                    }
                    else{
                        if(item == "1"){
                            setStyle("-fx-background-color: springgreen");
                        }
                        else if(item == "0"){
                            setStyle("-fx-background-color: #E09F7D");
                        }
                    }
                }
            };
        });
        k2.setCellFactory(column -> {
            return new TableCell<Days, String>(){
                @Override
                protected void updateItem(String item, boolean empty){
                    super.updateItem(item,empty);

                    if(item == null || empty){
                        setText(null);
                        setStyle("");
                    }
                    else{
                        if(item == "1"){
                            setStyle("-fx-background-color: springgreen");
                        }
                        else if(item == "0"){
                            setStyle("-fx-background-color: #E09F7D");
                        }
                    }
                }
            };
        });
        k3.setCellFactory(column -> {
            return new TableCell<Days, String>(){
                @Override
                protected void updateItem(String item, boolean empty){
                    super.updateItem(item,empty);

                    if(item == null || empty){
                        setText(null);
                        setStyle("");
                    }
                    else{
                        if(item == "1"){
                            setStyle("-fx-background-color: springgreen");
                        }
                        else if(item == "0"){
                            setStyle("-fx-background-color: #E09F7D");
                        }
                    }
                }
            };
        });
        k4.setCellFactory(column -> {
            return new TableCell<Days, String>(){
                @Override
                protected void updateItem(String item, boolean empty){
                    super.updateItem(item,empty);

                    if(item == null || empty){
                        setText(null);
                        setStyle("");
                    }
                    else{
                        if(item == "1"){
                            setStyle("-fx-background-color: springgreen");
                        }
                        else if(item == "0"){
                            setStyle("-fx-background-color: #E09F7D");
                        }
                    }
                }
            };
        });
        k5.setCellFactory(column -> {
            return new TableCell<Days, String>(){
                @Override
                protected void updateItem(String item, boolean empty){
                    super.updateItem(item,empty);

                    if(item == null || empty){
                        setText(null);
                        setStyle("");
                    }
                    else{
                        if(item == "1"){
                            setStyle("-fx-background-color: springgreen");
                        }
                        else if(item == "0"){
                            setStyle("-fx-background-color: #E09F7D");
                        }
                    }
                }
            };
        });
        k6.setCellFactory(column -> {
            return new TableCell<Days, String>(){
                @Override
                protected void updateItem(String item, boolean empty){
                    super.updateItem(item,empty);

                    if(item == null || empty){
                        setText(null);
                        setStyle("");
                    }
                    else{
                        if(item == "1"){
                            setStyle("-fx-background-color: springgreen");
                        }
                        else if(item == "0"){
                            setStyle("-fx-background-color: #E09F7D");
                        }
                    }
                }
            };
        });
        k7.setCellFactory(column -> {
            return new TableCell<Days, String>(){
                @Override
                protected void updateItem(String item, boolean empty){
                    super.updateItem(item,empty);

                    if(item == null || empty){
                        setText(null);
                        setStyle("");
                    }
                    else{
                        if(item == "1"){
                            setStyle("-fx-background-color: springgreen");
                        }
                        else if(item == "0"){
                            setStyle("-fx-background-color: #E09F7D");
                        }
                    }
                }
            };
        });
        k8.setCellFactory(column -> {
            return new TableCell<Days, String>(){
                @Override
                protected void updateItem(String item, boolean empty){
                    super.updateItem(item,empty);

                    if(item == null || empty){
                        setText(null);
                        setStyle("");
                    }
                    else{
                        if(item == "1"){
                            setStyle("-fx-background-color: springgreen");
                        }
                        else if(item == "0"){
                            setStyle("-fx-background-color: #E09F7D");
                        }
                    }
                }
            };
        });
        k9.setCellFactory(column -> {
            return new TableCell<Days, String>(){
                @Override
                protected void updateItem(String item, boolean empty){
                    super.updateItem(item,empty);

                    if(item == null || empty){
                        setText(null);
                        setStyle("");
                    }
                    else{
                        if(item == "1"){
                            setStyle("-fx-background-color: springgreen");
                        }
                        else if(item == "0"){
                            setStyle("-fx-background-color: #E09F7D");
                        }
                    }
                }
            };
        });
        k10.setCellFactory(column -> {
            return new TableCell<Days, String>(){
                @Override
                protected void updateItem(String item, boolean empty){
                    super.updateItem(item,empty);

                    if(item == null || empty){
                        setText(null);
                        setStyle("");
                    }
                    else{
                        if(item == "1"){
                            setStyle("-fx-background-color: springgreen");
                        }
                        else if(item == "0"){
                            setStyle("-fx-background-color: #E09F7D");
                        }
                    }
                }
            };
        });
        k11.setCellFactory(column -> {
            return new TableCell<Days, String>(){
                @Override
                protected void updateItem(String item, boolean empty){
                    super.updateItem(item,empty);

                    if(item == null || empty){
                        setText(null);
                        setStyle("");
                    }
                    else{
                        if(item == "1"){
                            setStyle("-fx-background-color: springgreen");
                        }
                        else if(item == "0"){
                            setStyle("-fx-background-color: #E09F7D");
                        }
                    }
                }
            };
        });
        k12.setCellFactory(column -> {
            return new TableCell<Days, String>(){
                @Override
                protected void updateItem(String item, boolean empty){
                    super.updateItem(item,empty);

                    if(item == null || empty){
                        setText(null);
                        setStyle("");
                    }
                    else{
                        if(item == "1"){
                            setStyle("-fx-background-color: springgreen");
                        }
                        else if(item == "0"){
                            setStyle("-fx-background-color: #E09F7D");
                        }
                    }
                }
            };
        });
        k13.setCellFactory(column -> {
            return new TableCell<Days, String>(){
                @Override
                protected void updateItem(String item, boolean empty){
                    super.updateItem(item,empty);

                    if(item == null || empty){
                        setText(null);
                        setStyle("");
                    }
                    else{
                        if(item == "1"){
                            setStyle("-fx-background-color: springgreen");
                        }
                        else if(item == "0"){
                            setStyle("-fx-background-color: #E09F7D");
                        }
                    }
                }
            };
        });
        k14.setCellFactory(column -> {
            return new TableCell<Days, String>(){
                @Override
                protected void updateItem(String item, boolean empty){
                    super.updateItem(item,empty);

                    if(item == null || empty){
                        setText(null);
                        setStyle("");
                    }
                    else{
                        if(item == "1"){
                            setStyle("-fx-background-color: springgreen");
                        }
                        else if(item == "0"){
                            setStyle("-fx-background-color: #E09F7D");
                        }
                    }
                }
            };
        });
        k15.setCellFactory(column -> {
            return new TableCell<Days, String>(){
                @Override
                protected void updateItem(String item, boolean empty){
                    super.updateItem(item,empty);

                    if(item == null || empty){
                        setText(null);
                        setStyle("");
                    }
                    else{
                        if(item == "1"){
                            setStyle("-fx-background-color: springgreen");
                        }
                        else if(item == "0"){
                            setStyle("-fx-background-color: #E09F7D");
                        }
                    }
                }
            };
        });
        k16.setCellFactory(column -> {
            return new TableCell<Days, String>(){
                @Override
                protected void updateItem(String item, boolean empty){
                    super.updateItem(item,empty);

                    if(item == null || empty){
                        setText(null);
                        setStyle("");
                    }
                    else{
                        if(item == "1"){
                            setStyle("-fx-background-color: springgreen");
                        }
                        else if(item == "0"){
                            setStyle("-fx-background-color: #E09F7D");
                        }
                    }
                }
            };
        });
        k17.setCellFactory(column -> {
            return new TableCell<Days, String>(){
                @Override
                protected void updateItem(String item, boolean empty){
                    super.updateItem(item,empty);

                    if(item == null || empty){
                        setText(null);
                        setStyle("");
                    }
                    else{
                        if(item == "1"){
                            setStyle("-fx-background-color: springgreen");
                        }
                        else if(item == "0"){
                            setStyle("-fx-background-color: #E09F7D");
                        }
                    }
                }
            };
        });
        k18.setCellFactory(column -> {
            return new TableCell<Days, String>(){
                @Override
                protected void updateItem(String item, boolean empty){
                    super.updateItem(item,empty);

                    if(item == null || empty){
                        setText(null);
                        setStyle("");
                    }
                    else{
                        if(item == "1"){
                            setStyle("-fx-background-color: springgreen");
                        }
                        else if(item == "0"){
                            setStyle("-fx-background-color: #E09F7D");
                        }
                    }
                }
            };
        });
        k19.setCellFactory(column -> {
            return new TableCell<Days, String>(){
                @Override
                protected void updateItem(String item, boolean empty){
                    super.updateItem(item,empty);

                    if(item == null || empty){
                        setText(null);
                        setStyle("");
                    }
                    else{
                        if(item == "1"){
                            setStyle("-fx-background-color: springgreen");
                        }
                        else if(item == "0"){
                            setStyle("-fx-background-color: #E09F7D");
                        }
                    }
                }
            };
        });
        k20.setCellFactory(column -> {
            return new TableCell<Days, String>(){
                @Override
                protected void updateItem(String item, boolean empty){
                    super.updateItem(item,empty);

                    if(item == null || empty){
                        setText(null);
                        setStyle("");
                    }
                    else{
                        if(item == "1"){
                            setStyle("-fx-background-color: springgreen");
                        }
                        else if(item == "0"){
                            setStyle("-fx-background-color: #E09F7D");
                        }
                    }
                }
            };
        });
        k21.setCellFactory(column -> {
            return new TableCell<Days, String>(){
                @Override
                protected void updateItem(String item, boolean empty){
                    super.updateItem(item,empty);

                    if(item == null || empty){
                        setText(null);
                        setStyle("");
                    }
                    else{
                        if(item == "1"){
                            setStyle("-fx-background-color: springgreen");
                        }
                        else if(item == "0"){
                            setStyle("-fx-background-color: #E09F7D");
                        }
                    }
                }
            };
        });
        k22.setCellFactory(column -> {
            return new TableCell<Days, String>(){
                @Override
                protected void updateItem(String item, boolean empty){
                    super.updateItem(item,empty);

                    if(item == null || empty){
                        setText(null);
                        setStyle("");
                    }
                    else{
                        if(item == "1"){
                            setStyle("-fx-background-color: springgreen");
                        }
                        else if(item == "0"){
                            setStyle("-fx-background-color: #E09F7D");
                        }
                    }
                }
            };
        });
        k23.setCellFactory(column -> {
            return new TableCell<Days, String>(){
                @Override
                protected void updateItem(String item, boolean empty){
                    super.updateItem(item,empty);

                    if(item == null || empty){
                        setText(null);
                        setStyle("");
                    }
                    else{
                        if(item == "1"){
                            setStyle("-fx-background-color: springgreen");
                        }
                        else if(item == "0"){
                            setStyle("-fx-background-color: #E09F7D");
                        }
                    }
                }
            };
        });
        k24.setCellFactory(column -> {
            return new TableCell<Days, String>(){
                @Override
                protected void updateItem(String item, boolean empty){
                    super.updateItem(item,empty);

                    if(item == null || empty){
                        setText(null);
                        setStyle("");
                    }
                    else{
                        if(item == "1"){
                            setStyle("-fx-background-color: springgreen");
                        }
                        else if(item == "0"){
                            setStyle("-fx-background-color: #E09F7D");
                        }
                    }
                }
            };
        });
        k25.setCellFactory(column -> {
            return new TableCell<Days, String>(){
                @Override
                protected void updateItem(String item, boolean empty){
                    super.updateItem(item,empty);

                    if(item == null || empty){
                        setText(null);
                        setStyle("");
                    }
                    else{
                        if(item == "1"){
                            setStyle("-fx-background-color: springgreen");
                        }
                        else if(item == "0"){
                            setStyle("-fx-background-color: #E09F7D");
                        }
                    }
                }
            };
        });
        k26.setCellFactory(column -> {
            return new TableCell<Days, String>(){
                @Override
                protected void updateItem(String item, boolean empty){
                    super.updateItem(item,empty);

                    if(item == null || empty){
                        setText(null);
                        setStyle("");
                    }
                    else{
                        if(item == "1"){
                            setStyle("-fx-background-color: springgreen");
                        }
                        else if(item == "0"){
                            setStyle("-fx-background-color: #E09F7D");
                        }
                    }
                }
            };
        });
        k27.setCellFactory(column -> {
            return new TableCell<Days, String>(){
                @Override
                protected void updateItem(String item, boolean empty){
                    super.updateItem(item,empty);

                    if(item == null || empty){
                        setText(null);
                        setStyle("");
                    }
                    else{
                        if(item == "1"){
                            setStyle("-fx-background-color: springgreen");
                        }
                        else if(item == "0"){
                            setStyle("-fx-background-color: #E09F7D");
                        }
                    }
                }
            };
        });
        k28.setCellFactory(column -> {
            return new TableCell<Days, String>(){
                @Override
                protected void updateItem(String item, boolean empty){
                    super.updateItem(item,empty);

                    if(item == null || empty){
                        setText(null);
                        setStyle("");
                    }
                    else{
                        if(item == "1"){
                            setStyle("-fx-background-color: springgreen");
                        }
                        else if(item == "0"){
                            setStyle("-fx-background-color: #E09F7D");
                        }
                    }
                }
            };
        });
        k29.setCellFactory(column -> {
            return new TableCell<Days, String>(){
                @Override
                protected void updateItem(String item, boolean empty){
                    super.updateItem(item,empty);

                    if(item == null || empty){
                        setText(null);
                        setStyle("");
                    }
                    else{
                        if(item == "1"){
                            setStyle("-fx-background-color: springgreen");
                        }
                        else if(item == "0"){
                            setStyle("-fx-background-color: #E09F7D");
                        }
                    }
                }
            };
        });
        k30.setCellFactory(column -> {
            return new TableCell<Days, String>(){
                @Override
                protected void updateItem(String item, boolean empty){
                    super.updateItem(item,empty);

                    if(item == null || empty){
                        setText(null);
                        setStyle("");
                    }
                    else{
                        if(item == "1"){
                            setStyle("-fx-background-color: springgreen");
                        }
                        else if(item == "0"){
                            setStyle("-fx-background-color: #E09F7D");
                        }
                    }
                }
            };
        });
        k31.setCellFactory(column -> {
            return new TableCell<Days, String>(){
                @Override
                protected void updateItem(String item, boolean empty){
                    super.updateItem(item,empty);

                    if(item == null || empty){
                        setText(null);
                        setStyle("");
                    }
                    else{
                        if(item == "1") {
                            setStyle("-fx-background-color: springgreen");
                        }
                        else if(item == "0"){
                            setStyle("-fx-background-color: #E09F7D");
                        }
                    }
                }
            };
        });
        tab.setEditable(false);
        try {
            tab.setItems(parseList());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private ObservableList<Days> parseList() throws IOException {
        final ObservableList<Days> lista3 = FXCollections.observableArrayList();
        int miesiac = 0;
        int rok = 0;
        if (comboBox.getValue().equals("Styczeń")) miesiac = 1;
        else if(comboBox.getValue().equals("Luty")) miesiac = 2;
        else if(comboBox.getValue().equals("Marzec")) miesiac = 3;
        else if(comboBox.getValue().equals("Kwiecieć")) miesiac = 4;
        else if(comboBox.getValue().equals("Maj")) miesiac = 5;
        else if(comboBox.getValue().equals("Czerwiec")) miesiac = 6;
        else if(comboBox.getValue().equals("Lipiec")) miesiac = 7;
        else if(comboBox.getValue().equals("Sierpień")) miesiac = 8;
        else if(comboBox.getValue().equals("Wrzesień")) miesiac = 9;
        else if(comboBox.getValue().equals("Październik")) miesiac = 10;
        else if(comboBox.getValue().equals("Listopad")) miesiac = 11;
        else if(comboBox.getValue().equals("Grudzień")) miesiac = 12;

        if(comboBox_rok.getValue().equals("2020")) rok = 2020;
        else if (comboBox_rok.getValue().equals("2021")) rok = 2021;
        else if (comboBox_rok.getValue().equals("2022")) rok = 2022;
        else if (comboBox_rok.getValue().equals("2023")) rok = 2023;
        else if (comboBox_rok.getValue().equals("2024")) rok = 2024;

        JSONObject json = new JSONObject("{wyswietl:wyswietl}");
        json.put("miesiac_od",miesiac);
        json.put("miesiac_do",miesiac);
        json.put("rok",rok);
        Serwer_pol polaczenie = new Serwer_pol(json);
        JSONObject wyjscie = polaczenie.wysylanie();
        JSONArray array = wyjscie.getJSONArray("wyswietl");
        for(int i = 101; i <= 120; ++i){
            if(miesiac % 2 == 1) {
                lista3.add(new Days(String.valueOf(i),"1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1"));
                k29.setVisible(true);
                k30.setVisible(true);
                k31.setVisible(true);
                tab.setPrefWidth(1045);
                pane.setPrefWidth(1045);
            }
            else if(miesiac % 2 == 0 && miesiac != 2) {
                lista3.add(new Days(String.valueOf(i), "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1"));
                k29.setVisible(true);
                k30.setVisible(true);
                k31.setVisible(false);
                tab.setPrefWidth(1015);
                pane.setPrefWidth(1015);
            }
            else if(miesiac == 2 && rok % 4 == 0 && rok % 100 != 0){
                lista3.add(new Days(String.valueOf(i), "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1","1"));
                k29.setVisible(true);
                k30.setVisible(false);
                k31.setVisible(false);
                tab.setPrefWidth(985);
                pane.setPrefWidth(985);
            }
            else if(miesiac == 2) {
                lista3.add(new Days(String.valueOf(i), "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1"));
                k29.setVisible(false);
                k30.setVisible(false);
                k31.setVisible(false);
                tab.setPrefWidth(955);
                pane.setPrefWidth(955);
            }
        }
        int licznik = 0;
        for(int j = 0; j < array.length(); ++j){
            JSONObject rezer = (JSONObject) ((JSONArray) array).get(j);
            String nr_pokoju = String.valueOf(rezer.getInt("nr_pokoju"));
            String data_od = rezer.getString("data_od");
            String data_do = rezer.getString("data_do");
            int od = Integer.parseInt(data_od.substring(8, 10));
            int mies = Integer.parseInt(data_od.substring(5, 7));
            int do2 = Integer.parseInt(data_do.substring(8, 10));
            int mies2 = Integer.parseInt(data_do.substring(5, 7));
            if(od > do2 && mies == miesiac){
                if(miesiac % 2 == 0 && miesiac != 2) do2 = 30;
                else if(miesiac % 2 == 1) do2 = 31;
                else if(miesiac == 2 && rok % 4 == 0 && rok % 100 != 0) do2 = 29;
                else if(miesiac == 2) do2 = 28;
            }
            else if(do2 < od && miesiac == mies2) od = 1;
            if(nr_pokoju.equals("101")) licznik = 0;
            else if(nr_pokoju.equals("102")) licznik = 1;
            else if(nr_pokoju.equals("103")) licznik = 2;
            else if(nr_pokoju.equals("104")) licznik = 3;
            else if(nr_pokoju.equals("105")) licznik = 4;
            else if(nr_pokoju.equals("106")) licznik = 5;
            else if(nr_pokoju.equals("107")) licznik = 6;
            else if(nr_pokoju.equals("108")) licznik = 7;
            else if(nr_pokoju.equals("109")) licznik = 8;
            else if(nr_pokoju.equals("110")) licznik = 9;
            else if(nr_pokoju.equals("111")) licznik = 10;
            else if(nr_pokoju.equals("112")) licznik = 11;
            else if(nr_pokoju.equals("113")) licznik = 12;
            else if(nr_pokoju.equals("114")) licznik = 13;
            else if(nr_pokoju.equals("115")) licznik = 14;
            else if(nr_pokoju.equals("116")) licznik = 15;
            else if(nr_pokoju.equals("117")) licznik = 16;
            else if(nr_pokoju.equals("118")) licznik = 17;
            else if(nr_pokoju.equals("119")) licznik = 18;
            else if(nr_pokoju.equals("120")) licznik = 19;
            for(int i = od; i <= do2; ++i){
                if(i == 1) lista3.get(licznik).setK1("0");
                else if(i == 2) lista3.get(licznik).setK2("0");
                else if(i == 3) lista3.get(licznik).setK3("0");
                else if(i == 4) lista3.get(licznik).setK4("0");
                else if(i == 5) lista3.get(licznik).setK5("0");
                else if(i == 6) lista3.get(licznik).setK6("0");
                else if(i == 7) lista3.get(licznik).setK7("0");
                else if(i == 8) lista3.get(licznik).setK8("0");
                else if(i == 9) lista3.get(licznik).setK9("0");
                else if(i == 10) lista3.get(licznik).setK10("0");
                else if(i == 11) lista3.get(licznik).setK11("0");
                else if(i == 12) lista3.get(licznik).setK13("0");
                else if(i == 13) lista3.get(licznik).setK13("0");
                else if(i == 14) lista3.get(licznik).setK14("0");
                else if(i == 15) lista3.get(licznik).setK15("0");
                else if(i == 16) lista3.get(licznik).setK16("0");
                else if(i == 17) lista3.get(licznik).setK17("0");
                else if(i == 18) lista3.get(licznik).setK18("0");
                else if(i == 19) lista3.get(licznik).setK19("0");
                else if(i == 20) lista3.get(licznik).setK20("0");
                else if(i == 21) lista3.get(licznik).setK21("0");
                else if(i == 22) lista3.get(licznik).setK22("0");
                else if(i == 23) lista3.get(licznik).setK23("0");
                else if(i == 24) lista3.get(licznik).setK24("0");
                else if(i == 25) lista3.get(licznik).setK25("0");
                else if(i == 26) lista3.get(licznik).setK26("0");
                else if(i == 27) lista3.get(licznik).setK27("0");
                else if(i == 28) lista3.get(licznik).setK28("0");
                else if(i == 29) lista3.get(licznik).setK29("0");
                else if(i == 30) lista3.get(licznik).setK30("0");
                else if(i == 31) lista3.get(licznik).setK31("0");
            }
        }
        return lista3;
    }
    @FXML
    protected void zaloguj() throws Exception{
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("/log.fxml"));
        Parent parent = fxmlLoader.load();
        Scene scene2 = new Scene(parent,350,160);
        Stage window = new Stage();
        window.setTitle("Zaloguj się");
        window.setScene(scene2);
        window.show();
    }
    @FXML
    protected void rezerwacjaa() throws Exception{
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("/rezerwacja.fxml"));
        Parent parent = fxmlLoader.load();
        Scene scene2 = new Scene(parent,350,260);
        Stage window = new Stage();
        window.setTitle("Rezerwacja");
        window.setScene(scene2);
        window.show();
    }
}
