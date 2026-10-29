package DatabaseTesting;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCExample1 {

	public static void main(String[] args) throws SQLException {
		//https://www.youtube.com/watch?v=Sw3eqsKvfCM&list=PLUDwpEzHYYLs6G9WOfFxiH5zMfgNxgmSV&index=35
		//Need to have database for this testing
		//Step1
		Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/pdborcl", "hr", "hr");
		
		//Step2
		Statement stmt=con.createStatement();
		
		//Step3 --> execute sql statement
		//String s="insert into users values(102, 'BCDE', 'kas')"; // insert data
		//String s= "update users set uname='mer2' where userid=102"; // Update data 
		String s= "delete users where userid=102"; // Delete data
		
		stmt.executeQuery(s);
		
		//step4
		con.close();
		
		System.out.println("Program is executed");
		

	}

}
