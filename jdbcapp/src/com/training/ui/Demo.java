package com.training.ui;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Demo {

    public static void main(String[] args) {
        try {
            Connection conn = DriverManager.getConnection("","","");

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
