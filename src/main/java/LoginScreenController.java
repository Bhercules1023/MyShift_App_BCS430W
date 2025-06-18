package com.example.myshiftapp_new;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.control.PasswordField;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
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
    private Label loginFail;

    @FXML
    private void handleLogin() throws IOException {

        String username = usernameField.getText();
        String password = passwordField.getText();

        String adminUsername = usernameField.getText();
        String adminPassword = passwordField.getText();

        if (username.isEmpty() || password.isEmpty()){
            loginFail.setText("Please Enter a Username and Password!");
            return;
        }

        if (adminUsername.isEmpty() || adminPassword.isEmpty()){
            loginFail.setText("Please Enter a Username and Password!");
            return;
        }

        boolean validEmployee = UserAuthentication.verifyEmployee(username, password);
        boolean validAdmin = UserAuthentication.verifyAdmin(adminUsername, adminPassword);

        if (validEmployee){
            Stage stage = (Stage) loginButton.getScene().getWindow();
            MyShiftApplication.switchScene(stage, "EmployeeMainScreen.fxml");
        }
        else if (validAdmin){
            Stage stage = (Stage) loginButton.getScene().getWindow();
            MyShiftApplication.switchScene(stage, "AdminMainScreen.fxml");
        }
        else{
            loginFail.setText("Invalid Username or Password!");
        }

    }
}
