package Jdbc;

import java.sql.*;

public class Print_data {

	public static void main(String[] args) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/saurabh", "saurabh", "omsairam");

		Statement smt = con.createStatement();

		ResultSet rs = smt.executeQuery("Select * from student");

		System.out.println("Query is Executed ");

		System.out.println();

		while (rs.next()) {

			System.out.printf("%-10d | %-20s | %-10s | %-10d | %-10s | %n", rs.getInt(1), rs.getString(2),
					rs.getString(3), rs.getInt(4), rs.getString(5));

		}
		con.close();

	}
}
