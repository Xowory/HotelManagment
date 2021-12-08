module sample {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires java.json;
    requires org.json;

    opens sample to javafx.fxml;
    exports sample;
}