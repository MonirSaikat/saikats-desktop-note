package com.example.javafxfirst;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.fxml.FXMLLoader;

import java.io.IOException;

public class LogIn {
    public LogIn() {}

    @FXML
    private Button loginButton;
    @FXML
    private Text wrongLoginCredLabel;
    @FXML
    private TextField username;
    @FXML
    private  PasswordField passwordField;

    public void handleLoginClick()  throws  IOException{
        checkLogin();
    }

    private void checkLogin() throws IOException {
        HelloApplication m = new HelloApplication();
        if(username.getText().toString().equals("saikat") && passwordField.getText().toString().equals("saikat")) {
            wrongLoginCredLabel.setText("Success");
            m.changeScene("afterLogin.fxml");
        } else {
            wrongLoginCredLabel.setText("Invalid credentials");
        }
    }
}

