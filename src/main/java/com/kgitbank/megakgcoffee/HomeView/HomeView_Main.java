package com.kgitbank.megakgcoffee.HomeView;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class HomeView_Main implements Initializable {

@FXML Label login;

private Parent loginForm;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

//        login.setOnMouseClicked(e -> {
//            loginProc();
//        });
    }

    public Label getLogin() {
        return login;
    }

    public Parent getLoginForm() {
        return loginForm;
    }

    public void setLoginForm(Parent loginForm) {
        this.loginForm = loginForm;
    }


}
