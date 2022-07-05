package org.example;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;

import java.io.IOException;

public class LoginPageController {
    App app = new App();
    @FXML
    private Button loginbtn;

    @FXML
    private PasswordField passwordfield;

    @FXML
    private TextField usernamefield;

    @FXML
    private void switchToMain() throws IOException {
        App.setRoot("MainPage");
    }

    @FXML
    void loginbtnpressed(MouseEvent event) throws IOException {
        app.loginPageAppData.setUsername(getUsername());
        app.loginPageAppData.setPassword(getPassword());
        if (app.loginPageAppData.verifyUsername() == true && app.loginPageAppData.verifyPassword() == true) {
            switchToMain();
        } else System.out.println(false);
    }

    @FXML
    void passwordpressed(KeyEvent event) throws IOException {
        if (event.getCode().equals(KeyCode.ENTER)) {
            app.loginPageAppData.setUsername(getUsername());
            app.loginPageAppData.setPassword(getPassword());
            if (app.loginPageAppData.verifyUsername() == true && app.loginPageAppData.verifyPassword() == true) {
                switchToMain();
            } else System.out.println(false);
        }
    }

    @FXML
    void usernamepressed(KeyEvent event) throws IOException {
        if (event.getCode().equals(KeyCode.ENTER)) {
            app.loginPageAppData.setUsername(getUsername());
            app.loginPageAppData.setPassword(getPassword());
            if (app.loginPageAppData.verifyUsername() == true && app.loginPageAppData.verifyPassword() == true) {
                switchToMain();
            } else System.out.println(false);
        }
    }

    public String getUsername() {
        return usernamefield.getText().toString();
    }

    public String getPassword() {
        return passwordfield.getText().toString();
    }

}
