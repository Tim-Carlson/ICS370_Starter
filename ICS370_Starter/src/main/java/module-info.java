module com.example.ics370_starter {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.ics370_starter to javafx.fxml;
    exports com.example.ics370_starter;
}