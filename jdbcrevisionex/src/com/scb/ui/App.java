package com.scb.ui;

import com.scb.util.DBConnectionUtil;

import java.sql.Connection;

public class App {
    public static void main(String[] args) {
        Connection conn =DBConnectionUtil.getDBConnection();

    }
}
