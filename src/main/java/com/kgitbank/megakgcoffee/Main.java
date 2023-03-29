package com.kgitbank.megakgcoffee;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void init() {

    }

    @Override
    public void start(Stage stage) throws Exception {

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("HomeView_main.fxml"));
        Scene scene = new Scene(fxmlLoader.load(),250,400);
        stage.setScene(scene);
        stage.setTitle("Connection Test");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
