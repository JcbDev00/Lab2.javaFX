package com.example.lab3;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    public TextField txtLicznik;
    int counter = 0;
    public Button btnMain;

    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        ++counter;
        System.out.println(counter);
        txtLicznik.setText("" + counter);
    }
}