package com.example.loginformjavafx;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.*;
public class JDBC {
    public static void main(String[] args) {
        String url = ""; //url para enlazar a la base de datos
        String username = "davidgomez";
        String password= "dgomez2405";

        try{
            Connection connection = DriverManager.getConnection(url, username, password);
            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery("SELECT * FROM CLIENTES");

            while (resultSet.next()){
                System.out.println(resultSet.getString("id") + "" + resultSet.getString("nombres")+ "" + resultSet.getString("apellidos"));
            }

            connection.close();
            statement.close();
            resultSet.close();

        }catch (SQLException e){
          e.printStackTrace();
        }


    }
}
