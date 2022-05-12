package com.example.lab3;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


public class HelloController {
    public TextField txtLicznik;
    public CheckBox typeA;
    public TextField expField;
    public CheckBox typeB;
    public TextField heightField;
    public TextField radiusField;
    public TextField sizeField;
    public TextField weightField;

    public Button btnMain;

    int counter = 0;
    float radius = 0;
    float heigtht = 0;
    float size = 0;
    double m = 7.85;
    double area = 0;

    double price = 0;
    double weight = 0;
    boolean type = false;
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        radius = Float.parseFloat(radiusField.getText());
        heigtht = Float.parseFloat(heightField.getText());
        size = Float.parseFloat(sizeField.getText());

        System.out.println(""+ heigtht+ " "+ radius + " " + size);


        if (typeA.isSelected()) {
            area = (2*Math.PI)*radius*heigtht;
            System.out.println(area);
            weight = size * m;
            price = (area/100)*5;
            weightField.setText(weight + " kg");
            expField.setText(price + " PLN");

        } else if(typeB.isSelected()) {
            area = (2*Math.PI)*radius*heigtht;
            System.out.println(area);
            weight = size * m;
            price = (area/100)*10;
            weightField.setText(weight + " kg");
            expField.setText(price + " PLN");
        }
    }
}