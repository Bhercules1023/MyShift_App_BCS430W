package com.example.myshiftapp_new;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.control.PasswordField;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginScreenController {
    @FXML
    private TextField usernameField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private Button loginButton;

    @FXML
    private void handleLogin() throws IOException {

        String username = usernameField.getText().trim();
        String password = passwordField.getText().trim();


        Stage stage = (Stage) loginButton.getScene().getWindow();
        MyShiftApplication.switchScene(stage, "EmployeeMainScreen.fxml");
    }
}