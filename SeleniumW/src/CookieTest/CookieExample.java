package CookieTest;

import java.util.Set;

import org.apache.poi.ss.formula.functions.Code;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class CookieExample {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		Set<Cookie> cookies= driver.manage().getCookies(); //capture all the cookies from the browser
		System.out.println("Size of cookies:" +cookies.size());
		
		
		/*for(Cookie cookie:cookies) //read and print all the cookies
		{
			System.out.println(cookie.getName()+ ": " + cookie.getValue()); // print name & value of the cookies
		}*/
		
		// getting only specific cookie using name
		//System.out.println(driver.manage().getCookieNamed("session-id-time"));  // cookie name : session-id-time
		
		// adding a new cookie to the browser
		Cookie cookieobj= new Cookie("Mycookie1234", "1234567890");
		driver.manage().addCookie(cookieobj);
		
		// after an update cookie needs to be captured for getting listed
		cookies=driver.manage().getCookies(); 
		System.out.println("Size of cookies after adding a new cookie :" +cookies.size());
		
		for(Cookie cookie:cookies) //read and print all the cookies
		{
			System.out.println(cookie.getName()+ ": " + cookie.getValue()); // print name & value of the cookies
		}
		
		//deleting the cookie
		driver.manage().deleteCookie(cookieobj);
		
		cookies=driver.manage().getCookies();
		System.out.println("Size of cookies after deleting the cookie :" +cookies.size());
		
		driver.manage().deleteAllCookies();
		cookies=driver.manage().getCookies();
		System.out.println("Size of cookies after deleting all the cookies :" +cookies.size());
		
		driver.quit();
	}
		

}
