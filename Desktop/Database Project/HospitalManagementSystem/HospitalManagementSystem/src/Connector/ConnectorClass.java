/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Connector;
package net.codejava.sql;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;
/**
 *
 * @author Mahin
 */
public class ConnectorClass {
    
   public static Connection getcon (){
        String url = "jdbc:sqlserver://m4h1n\\SQLEXPRESS:1433;databaseName=hospital_management";
        String user = "sa";
        String password = "123456";   
        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            return connection;
        } catch (Exception e) {
           return null;
        }
    
    }
}
