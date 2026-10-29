package DropdownTests;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class VerifyDropDownSortedOptions {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://seleniumpractise.blogspot.com/");
		
		driver.manage().window().maximize();
		WebElement element= driver.findElement(By.xpath("//select[@id='tools1']"));
		Select se=new Select(element);
		
		List OL= new ArrayList(); // for creating the arrylist
		List templist= new ArrayList();
		
		List <WebElement> options =se.getOptions();
		
		for( WebElement e:options) 
		{
			OL.add(e.getText());
			templist.add(e.getText());
		}
		
		System.out.println("Before sorting" + OL);
		System.out.println("Before sorting: " + templist);
		
		//List templist=new ArrayList();
		//templist=OL;  // here on sorting this will sort the original list as well.
		//System.out.println("This is Before Sorting templist:" +  templist);
		
		Collections.sort(templist);
		System.out.println("This is After Sorting templist:" +  templist);
		
		if(OL==templist)
		{
			System.out.println("dropdown is sorted");
		}
		else
		{
			System.out.println("dropdown is not sorted");
		}
		System.out.println("OriginalList:" + OL);
	}

}
