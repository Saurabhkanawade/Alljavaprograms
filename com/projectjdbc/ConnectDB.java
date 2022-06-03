package com.projectjdbc;

import java.sql.*;

public class ConnectDB {

    public static void main(String[] args) {

        Connection connection = null;

        try {

            Class.forName("org.postgresql.Driver");
            connection=DriverManager.getConnection("jdbc:postgresql://localhost:5432/saurabh","postgres","omsairam");

            if(connection !=null){
                System.out.println("Connected to the Database sucessfully");
            }
            else{
                System.out.println("Connection is failed");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
