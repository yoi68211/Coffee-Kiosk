package com.kgitbank.megakgcoffee.Service.OrderDetailService;

import com.kgitbank.megakgcoffee.Model.DAO.OrderDetail.OrderDetailDAO;
import com.kgitbank.megakgcoffee.Model.DAO.OrderDetail.OrderDetailFactory;
import com.kgitbank.megakgcoffee.Model.DTO.OrderDetail.OrderDetailDTO;
import javafx.scene.control.Label;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Circle;

public class IOrderDetailService implements OrderDetailService{

    OrderDetailDAO orderDetailDAO = OrderDetailFactory.getOrderDetailDAO();

    @Override
    public int selectedOrder(String menu_seq, Circle circle, Label[] label) {

        System.out.println(menu_seq);

        OrderDetailDTO orderDetailDTO = orderDetailDAO.selectedMenu(Integer.parseInt(menu_seq));

        Image img = new Image(orderDetailDTO.getMenuImg());
        circle.setFill(new ImagePattern(img));
        circle.setEffect(new DropShadow(+25d, 0d, +2d, Color.YELLOW));

        label[0].setText(orderDetailDTO.getMenuName());
        label[1].setText(orderDetailDTO.getMenuDesc());
        label[2].setText(String.valueOf(orderDetailDTO.getMenuPrice()));

        return orderDetailDTO.getMenuPrice();

    }
}
