package com.kgitbank.megakgcoffee.Controller.Cart;

import com.kgitbank.megakgcoffee.Model.DTO.Cart.CartDTO;
import com.kgitbank.megakgcoffee.Model.DTO.OrderDetail.OrderDataSingleton;
import com.kgitbank.megakgcoffee.Opener.Opener;
import com.kgitbank.megakgcoffee.Service.Cart.CartService;
import com.kgitbank.megakgcoffee.Service.Cart.CartServiceFactory;
import com.kgitbank.megakgcoffee.Service.OrderCheck.OrderCheckServiceFactory;
import com.kgitbank.megakgcoffee.Service.OrderCheck.OrderCheckService;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class CartController implements Initializable {

    OrderDataSingleton orderDataSingleton = OrderDataSingleton.getInstance();
    private CartService cartService;
    private OrderCheckService orderCheckService;

    @FXML public TableView<CartDTO> cart_table;

    @FXML public TableColumn<CartDTO, Integer> order_number;
    @FXML public TableColumn<CartDTO, String> menu_name;
    @FXML public TableColumn<CartDTO, Integer> total_items;
    @FXML public TableColumn<CartDTO, Integer> price;
    @FXML public TableColumn<CartDTO, Button> delete;
    @FXML public TableColumn order;

    private Opener opener;

    public void setOpener(Opener opener) {
        this.opener = opener;
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        cartService = CartServiceFactory.getCartService();
        orderCheckService = OrderCheckServiceFactory.getOrderCheckService();
        setTableViewColumExceptedButton();
        setTableViewDeleteButton();
        cart_table.setItems(cartService.findAllCartItems(1)); // todo :: 회원번호 1번 테스트
    }

    public void setTableViewColumExceptedButton() {
        order_number.setCellValueFactory(new PropertyValueFactory<CartDTO, Integer>("check_seq"));
        order_number.setStyle("-fx-alignment: CENTER;");
        menu_name.setCellValueFactory(new PropertyValueFactory<CartDTO, String>("menu_name"));
        menu_name.setStyle("-fx-alignment: CENTER;");
        total_items.setCellValueFactory(new PropertyValueFactory<CartDTO, Integer>("item_count"));
        total_items.setStyle("-fx-alignment: CENTER;");
        price.setCellValueFactory(new PropertyValueFactory<CartDTO, Integer>("item_price"));
        price.setStyle("-fx-alignment: CENTER;");
    }

    public void setTableViewDeleteButton() {
        delete.setCellFactory(col -> new TableCell<>(){
            @Override
            public void updateItem(Button item, boolean empty) {
                super.updateItem(item, empty);
                setText(null);
                setGraphic(null);
                if (!empty) {
                    Button button = new Button("Delete");
                    // Todo :: 버튼 이벤트
                    button.setOnAction(actionEvent -> {
                        int row = this.getTableRow().getIndex();
                        CartDTO cart = cart_table.getItems().get(row);
                        // Todo :: 취소 시 주문체크 테이블 checkOrder Col 3 으로 변경
                        orderCheckService.deleteOrderCheck(cart.getCheck_seq());
                        this.getTableView().getItems().remove(row);
                    });
                    setText(null);
                    setGraphic(button);
                }
            }
        });
        delete.setStyle("-fx-alignment: CENTER;");
    }


    public void go_to_order_cart(MouseEvent mouseEvent) {
        Stage stage = (Stage) cart_table.getScene().getWindow();
        Opener opener = new Opener();
        opener.BackToOrderPage(stage);
    }
}
