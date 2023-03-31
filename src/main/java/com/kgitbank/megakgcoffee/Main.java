package com.kgitbank.megakgcoffee;

import com.kgitbank.megakgcoffee.Controller.Orders.OrdersController;
import com.kgitbank.megakgcoffee.Opener.Opener;
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

//        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Test.fxml"));
//        Scene scene = new Scene(fxmlLoader.load(),500,500);
//        stage.setScene(scene);
//        stage.setTitle("Connection Test");
//        stage.show();


        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Fxml/Orders.fxml"));
        Parent orderForm = fxmlLoader.load();

        Opener opener = new Opener();
        opener.setPrimaryStage(stage);

        OrdersController ordersController = fxmlLoader.getController();
        ordersController.setOpener(opener);

        Scene scene = new Scene(orderForm);
        stage.setTitle("Order Page");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
