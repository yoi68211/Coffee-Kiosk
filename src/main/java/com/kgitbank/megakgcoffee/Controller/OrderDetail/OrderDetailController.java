package com.kgitbank.megakgcoffee.Controller.OrderDetail;

import com.kgitbank.megakgcoffee.Model.DTO.OrderDetail.OrderDataSingleton;
import com.kgitbank.megakgcoffee.Service.OrderDetailService.OrderDetailService;
import com.kgitbank.megakgcoffee.Service.OrderDetailService.OrderDetailServiceFactory;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class OrderDetailController implements Initializable {

    OrderDataSingleton orderDataSingleton = OrderDataSingleton.getInstance();
    private OrderDetailService orderDetailService;

    @FXML public Circle menu_detail;
    @FXML public Label menu_name;
    @FXML public Label menu_desc;
    @FXML public Label menu_count;
    @FXML public Label menu_price;

    Label[] labels;

    int cnt = 1;
    int price = 0;
    int total_price = 0;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        orderDetailService = OrderDetailServiceFactory.getOrderDetailService();
        initializeLabel();
        menu_count.setText(String.valueOf(cnt));
        price = orderDetailService.selectedOrder(orderDataSingleton.getMenu_seq(), menu_detail, labels);
    }

    public void initializeLabel() {
        labels = new Label[3];
        labels[0] = menu_name;
        labels[1] = menu_desc;
        labels[2] = menu_price;
    }

    public void plus_count_button(MouseEvent mouseEvent) {
        cnt++; menu_count.setText(String.valueOf(cnt));
        menu_price.setText(String.valueOf(price*cnt));
        total_price = price*cnt;
        System.out.println(total_price);
    }

    public void minus_count_button(MouseEvent mouseEvent) {
        if (cnt <= 1) {
            if (mouseEvent.getClickCount() >= 10) {
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("INFORMATION");
                alert.setHeaderText("정보");
                alert.setContentText("주문 상품의 개수는 1 이하로 내려가지 않습니다.");
                alert.showAndWait();
            }
        } else {
            cnt--; menu_count.setText(String.valueOf(cnt));
            menu_price.setText(String.valueOf(total_price-price));
            total_price = total_price-price;
            System.out.println(total_price);
        }
    }
}
