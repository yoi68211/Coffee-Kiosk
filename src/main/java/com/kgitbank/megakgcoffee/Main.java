package com.kgitbank.megakgcoffee;

import com.kgitbank.megakgcoffee.Controller.HomeView.HomeViewMainController;
import com.kgitbank.megakgcoffee.Model.DAO.HomeView.HomeViewOpenerFactory;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void init() {

    }

    @Override
    public void start(Stage stage) throws Exception {

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("HomeView_main.fxml"));
        Parent mainForm = fxmlLoader.load();

        HomeViewOpenerFactory openerFactory = new HomeViewOpenerFactory();
        openerFactory.setPrimayStage(stage);

        HomeViewMainController mainController = fxmlLoader.getController();
        mainController.setFactory(openerFactory);

        Scene scene = new Scene(mainForm);
        stage.setScene(scene);
        stage.setTitle("Connection Test");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
