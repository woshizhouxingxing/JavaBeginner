package com.woshizhouxingxing.utils;

import org.sqlite.SQLiteDataSource;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Westeros {
    public static void main(String[] args) {
        String url = "jdbc:sqlite:westeros";

        SQLiteDataSource dataSource = new SQLiteDataSource();
        dataSource.setUrl(url);

        try (Connection con = dataSource.getConnection()) {
            // Statement creation
            try (Statement statement = con.createStatement()) {
                // Statement execution
                statement.executeUpdate("CREATE TABLE IF NOT EXISTS HOUSES(" +
                        "id INTEGER PRIMARY KEY," +
                        "name TEXT NOT NULL," +
                        "words TEXT NOT NULL)");
                int i = statement.executeUpdate("INSERT INTO HOUSES (id,name,words)VALUES (3, 'Stark of Winterfell', 'Summer is Coming')");
//                        "(1, 'Targaryen of King''s Landing', 'Fire and Blood')," +
//                        "," +
//                        "(3, 'Lannister of Casterly Rock', 'Hear Me Roar!')");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
