package com.projectjdbc;

import java.sql.*;

public class PrintData {

    public static void main(String[] args) {

        Connection connection=null;

        try {
            Class.forName("org.postgresql.Driver");
            connection=DriverManager.getConnection("jdbc:postgresql://localhost:5432/saurabh","postgres","omsairam");

            Statement statement=connection.createStatement();
            ResultSet resultSet=statement.executeQuery("select * from game_instance ");

            while(resultSet.next()){
                System.out.println(resultSet.getInt(1)+" | "+resultSet.getString(2));
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
