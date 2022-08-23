package com.example.arena;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class Connection {
    public static void main(String[] args) {
        java.sql.Connection conn = null;
        Statement statement = null;

        try {
            ArrayList<ArrayList<String>> outer = new ArrayList<ArrayList<String>>();
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost/arena", "root", "");
            statement = (Statement) conn.createStatement();
            String sql;
            sql = "SELECT * FROM foodmodel";
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                ArrayList<String> inner = new ArrayList<String>();
                inner.add(resultSet.getString("name"));
                outer.add(inner);
            }
            System.out.println("The name are as follows:");
            for (int i = 0; i < outer.size(); i++) {
                System.out.println(outer.get(i));
            }
        } catch (Exception error) {
            error.printStackTrace();
        }
    }
}
