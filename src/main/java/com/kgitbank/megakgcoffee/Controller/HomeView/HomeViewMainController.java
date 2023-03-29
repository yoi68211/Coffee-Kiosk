package com.kgitbank.megakgcoffee.Controller.HomeView;

import com.kgitbank.megakgcoffee.HomeView.HomeView_Home;
import com.kgitbank.megakgcoffee.HomeView.HomeView_Main;
import com.kgitbank.megakgcoffee.Service.HomeView.HomeViewService;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class HomeViewMainController implements Initializable {

    @FXML
    Button homeview_login;
    private HomeViewService service;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        homeview_login.setOnMouseClicked(e -> {
            service = new HomeViewService();
        });
    }

    public void loginProc() {
//        HomeView_Home

//        Stage loginStage = new Stage();
//        FXMLLoader loader = new FXMLLoader(getClass().getResource("HomeView_home.fxml"));
//
//        Parent loginForm = null;
//        try {
//            loginForm = loader.load();
//        }catch (Exception e){
//            e.printStackTrace();
//        }
//
//        HomeView_Main logCon = loader.getController();
//        logCon.setLoginForm(loginForm);
//
//
//        Scene scene = new Scene(loginForm);
//        loginStage.setTitle("회원가입 화면");
//        loginStage.setScene(scene);
//        loginStage.show();
    }
}
