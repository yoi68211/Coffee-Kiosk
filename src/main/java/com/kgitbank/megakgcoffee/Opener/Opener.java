package com.kgitbank.megakgcoffee.Opener;

import com.kgitbank.megakgcoffee.Controller.OrderDetail.OrderDetailController;
import com.kgitbank.megakgcoffee.Model.DTO.OrderDetail.OrderDataSingleton;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.File;
import java.net.URL;

public class Opener {

    private Stage primaryStage;

    OrderDataSingleton data = OrderDataSingleton.getInstance();

    // opener 가 생성할 화면 구성
    public void setPrimaryStage(Stage primaryStage) {
        this.primaryStage = primaryStage;
    }

    // 주문 페이지 화면 실행
    public void OrderPageOpen() {

    }

    // 주문 상세 페이지 화면 실행
    public void OrderDetailPageOpen(String menu_seq) {

        //System.out.println(menu_seq);

        data.setMenu_seq(menu_seq);

        try {
            URL fxmlPath = new File("src/main/resources/com/kgitbank/megakgcoffee/Fxml/OrderDetail.fxml").toURI().toURL();
            FXMLLoader loader = new FXMLLoader(fxmlPath);
            Parent orderDetailForm = null;
            orderDetailForm = loader.load();
//            OrderDetailController controller = loader.getController();
//            controller.setMenu_seq(menu_seq);
            Scene scene = new Scene(orderDetailForm);
            primaryStage.setTitle("Order Detail");
            primaryStage.setScene(scene);
            primaryStage.show();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
