package JSDemo;

import javax.swing.text.Document;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptUtil {

	public static void flash(WebElement element, WebDriver driver) {
		String bgcolor =element.getCssValue("backgroundcolor");
		
		/*for(int i=0; i<100; i++) {
			changecolor()*/
		}
	//For drawing the border
	public static void drawBorder(WebElement element, WebDriver driver) {
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].style.border ='5px solid red' ", element); }
	
	//For getting the title of the page
	public static String getTitleByJS(WebDriver driver) {
		JavascriptExecutor js= ((JavascriptExecutor)driver);
		String title= js.executeScript("return document.title;").toString();
		return title;
	}
	
	public static void ClickElementByJS(WebElement element, WebDriver driver) {
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", element); // for clicking on particular element
	}

	public static void generateAlert(WebDriver driver, String message) {
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("alert('" + message + "')"); // for creating user defined alerts
	}
	public static void refreshBrowserPage(WebDriver driver) {
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("history.go(0)"); // this method is for refreshing the page
	}
	
	public static void ScrollIntoVIew(WebElement element, WebDriver driver) {
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);", element); //
	}
	
	public static void ScrollPageDown(WebDriver driver) {
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	}
	
	public static void ScrollPageUp(WebDriver driver) {
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0, -document.body.scrollHeight)");
	}
	
	public static void ZoomPageByJS(WebDriver driver) {
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("document.body.style.zoom='50%'"); 
	}
}
