package Java_database_connection;

import java.sql.*;

public class Demo1 {

	public static void main(String[] args) throws Exception {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/saurabh", "root", "omsairam");

			Statement smt = con.createStatement();
			ResultSet rs = smt.executeQuery("select * from student");
	
			while (rs.next()) {

				System.out.printf(" %d -20 , %s-25 ,%s -39, %d -20 , %s -30/n",rs.getInt(1) , rs.getString(2) , rs.getString(3) , rs.getInt(4) , rs.getString(5));
			}

			//con.close();
			
		} catch (Exception e) {

			e.printStackTrace();
		}
	}

}
