package org.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.TreeView;
import javafx.scene.layout.HBox;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class MainPageController implements Initializable {

    @FXML
    private Label accountNameLabel;

    @FXML
    private Button addAccountBtn;

    @FXML
    private Button logoutBtn;

    @FXML
    private TextField searchBar;

    @FXML
    private TreeView<?> treeViewPanel;

    @FXML
    private HBox HboxPane;

    @FXML
    private void switchToLogin() throws IOException {
        App.setRoot("Login");

    }

    @FXML
    void addAccount(ActionEvent event) {

    }

    @FXML
    void logoutOnClick(ActionEvent event) throws IOException {
        switchToLogin();
    }

    @FXML
    void searchBarOnClicked(ActionEvent event) {

    }

    /**
     * Called to initialize a controller after its root element has been
     * completely processed.
     *
     * @param location  The location used to resolve relative paths for the root object, or
     *                  {@code null} if the location is not known.
     * @param resources The resources used to localize the root object, or {@code null} if
     */
    @Override
    public void initialize(URL location, ResourceBundle resources) {
    }
}
