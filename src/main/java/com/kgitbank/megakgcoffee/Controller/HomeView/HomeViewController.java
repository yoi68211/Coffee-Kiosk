package com.kgitbank.megakgcoffee.Controller.HomeView;

import com.kgitbank.megakgcoffee.HomeView.HomeView;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class HomeViewController implements Initializable {

    @FXML
    Button homeview_login;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        homeview_login.setOnMouseClicked(e -> {
            System.out.println("hi");
        });
    }

    public void loginProc() {
        Stage loginStage = new Stage();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Logintest.fxml"));

        Parent loginForm = null;
        try {
            loginForm = loader.load();
        }catch (Exception e){
            e.printStackTrace();
        }

        HomeView logCon = loader.getController();
        logCon.setLoginForm(loginForm);


        Scene scene = new Scene(loginForm);
        loginStage.setTitle("회원가입 화면");
        loginStage.setScene(scene);
        loginStage.show();
    }
}
