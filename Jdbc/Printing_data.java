package Jdbc;

import java.sql.*;

public class Printing_data {

	public static void main(String[] args) {

		try {

			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/saurabh", "root", "omsairam");

			Statement st = con.createStatement();

			ResultSet rs = st.executeQuery("select * from student");

			//System.out.println("Query Executed");

			while (rs.next()) {

				System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getInt(4)
						+ " " + rs.getString(5));

			}
		}

		catch (Exception e) {

			e.printStackTrace();
		}

	}

}
