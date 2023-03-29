package com.kgitbank.megakgcoffee.Controller.Payment;

import com.kgitbank.megakgcoffee.Service.Payment.PaymentService;
import com.kgitbank.megakgcoffee.Service.Payment.PaymentServiceFactory;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.util.ResourceBundle;

public class PaymentController implements Initializable {

    @FXML PaymentField test_id;
    @FXML PaymentField test_password;
    @FXML Button test_button;

    private PaymentService paymentService;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        paymentService = PaymentServiceFactory.getPaymentService();
    }


    @FXML
    public void testMouseClicked(MouseEvent event) {
        testService.register(test_id.getText(), test_password.getText());
    }
}
