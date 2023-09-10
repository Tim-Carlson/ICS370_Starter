package com.example.demo;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;


public class SecondView implements Initializable {

    @FXML
    private Label displayLabel;

    @FXML
    private Button returnButton;

    @FXML
    private ListView<String> listView;

    private final ObservableList<String> listData = FXCollections.observableArrayList();

    public void returnButtonClicked() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);

        ((Stage)returnButton.getScene().getWindow()).setScene(scene);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        listData.add("First");
        listData.add("Second");
        listData.add("Third");

        listView.setItems(listData);

        listView.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observableValue, String s, String t1) {
                if(t1 != null) {
                    displayLabel.setText(t1);
                }
            }
        });

    }
}
