package DatabaseTesting;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JDBCSelectClass {

	public static void main(String[] args) throws SQLException {
		//https://www.youtube.com/watch?v=Sw3eqsKvfCM&list=PLUDwpEzHYYLs6G9WOfFxiH5zMfgNxgmSV&index=35
		//Need to have database for this testing
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/newtours/");
		//Step1
			Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/pdborcl", "hr", "hr");
				
		//Step2
			Statement stmt=con.createStatement();
				
		//Step3 --> execute sql statement
			String s="select uname,passwrd from users"; //
		
		//Step4 
			ResultSet rs=stmt.executeQuery(s); //this is the additional step for select for storing the data
				
		while(rs.next())
		{
			String username=rs.getString("uname");
			String password=rs.getString("passwrd");
			
			driver.findElement(By.name("userName")).sendKeys(username);
			driver.findElement(By.name("password")).sendKeys(password);
			driver.findElement(By.name("login")).click();
			
			if(driver.getTitle().equals("Find a Flight: Mercury Tours:")) 
			{
				System.out.println("Test case Passed");
			}
			else 
			{
				System.out.println("Test case Failed");
			}
			
			driver.findElement(By.linkText("Home")).click(); // for going to homepage for next iteration
		}
		//step5
			con.close();
				
			System.out.println("Program is executed");
				

	}

}
