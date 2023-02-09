package com.example.demo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    private Slider sliderValue;

    @FXML
    private Button nextButton;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Slider set to " +  ((int)sliderValue.getValue()));
    }

    public void onResetButtonClick() {
        sliderValue.setValue(0);
    }

    public void onNextButtonClick(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("second-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);

        ((Stage)nextButton.getScene().getWindow()).setScene(scene);

    }
}