package com.kgitbank.megakgcoffee.Register.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
public class RegisterDAO implements IRegisterdao {
    private Connection con;

    public RegisterDAO() {
        String user = "DOUZONE";
        String password = "oracle";
        String url = "jdbc:oracle:thin:@lacalhost:1521:xe";

        try {
            Class.forName("oracle.jdbc.OracleDriver");
            con = DriverManager.getConnection(url, user, password);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
