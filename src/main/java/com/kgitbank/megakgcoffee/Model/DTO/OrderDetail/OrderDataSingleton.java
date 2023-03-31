package com.kgitbank.megakgcoffee.Model.DTO.OrderDetail;

public class OrderDataSingleton {

    private static final OrderDataSingleton instance = new OrderDataSingleton();

    private String menu_seq;

    private OrderDataSingleton(){}

    public static OrderDataSingleton getInstance(){
        return instance;
    }

    public String getMenu_seq() {
        return menu_seq;
    }

    public void setMenu_seq(String menu_seq) {
        this.menu_seq = menu_seq;
    }
}
