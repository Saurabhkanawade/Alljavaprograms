package Jdbc;

import java.sql.*;

public class Demo {

	public static void main(String[] args) throws Exception {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/saurabh", "root", "omsairam");

			Statement smt = con.createStatement();
			ResultSet rs = smt.executeQuery("select * from student");
	
			while (rs.next()) {

				System.out.println(rs.getInt(1) + " | " + rs.getString(2) + " | " + rs.getString(3) + " | "
						+ rs.getInt(4) + " | " + rs.getString(5));
			}

			//con.close();
			
		} catch (Exception e) {

			e.printStackTrace();
		}
	}

}
