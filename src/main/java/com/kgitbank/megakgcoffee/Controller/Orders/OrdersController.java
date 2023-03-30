package com.kgitbank.megakgcoffee.Controller.Orders;

import com.kgitbank.megakgcoffee.Service.Orders.OrderServiceFactory;
import com.kgitbank.megakgcoffee.Service.Orders.OrdersService;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.ResourceBundle;

public class OrdersController implements Initializable {

    public Button back_to_main;
    public Text order_text;
    public String category_menu = "coffee";

    @FXML public Button category_coffee_selected;
    @FXML public Button category_smoothie_selected;
    @FXML public Button category_ade_selected;
    @FXML public Button category_Dessert_selected;
    @FXML public Circle category_circle_one;
    @FXML public Circle category_circle_two;
    @FXML public Circle category_circle_three;
    public Button[] arrayButtons;
    public Circle[] arrayCircles;

    private OrdersService ordersService;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        ordersService = OrderServiceFactory.getOrderService();
        initializeButtonArray();
        initializeCircleArray();
        ordersService.searchMenu(category_menu, arrayCircles);

//        Image img = new Image("https://img.79plus.co.kr/megahp/manager/upload/menu/20220630153107_1656570667406_prmnWqNIw2.jpg");
//        category_circle_one.setFill(new ImagePattern(img));
//        category_circle_one.setEffect(new DropShadow(+25d, 0d, +2d, Color.YELLOW));

    }

    public void initializeButtonArray() {
        arrayButtons = new Button[4];
        arrayButtons[0] = category_coffee_selected;
        arrayButtons[1] = category_smoothie_selected;
        arrayButtons[2] = category_ade_selected;
        arrayButtons[3] = category_Dessert_selected;
    }

    public void initializeCircleArray() {
        arrayCircles= new Circle[3];
        arrayCircles[0] = category_circle_one;
        arrayCircles[1] = category_circle_two;
        arrayCircles[2] = category_circle_three;
    }

    @FXML
    public void categoryPressed(ActionEvent event) {
        for (Button button : arrayButtons) {
            button.setStyle("-fx-background-color: white;\n");

        }
        for (Button arrayButton : arrayButtons) {
            if (event.getSource().equals(arrayButton)) {
                arrayButton.setStyle("-fx-background-radius: 15px;\n" +
                        "    -fx-background-color: black;\n" +
                        "    -fx-text-fill: white;");
                category_menu = arrayButton.getText().toLowerCase();
                ordersService.searchMenu(category_menu, arrayCircles);
            }
        }

    }
}
