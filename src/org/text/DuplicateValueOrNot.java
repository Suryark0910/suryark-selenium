package org.text;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DuplicateValueOrNot {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://omrbranch.com/apitestingtraininginchennaiomr");
		driver.manage().window().maximize();
		 
		
		//To find Locator
		WebElement element=driver.findElement(By.id("country-list"));  
		//Create List
		List<String>listoptions=new ArrayList<String>();
		//use Select method to get dropdown options
		Select select=new Select(element);
		
		//Get All options As Text
		List<WebElement> options=select.getOptions();
		for(WebElement webElement:options) {
			String text=webElement.getText();
			listoptions.add(text);
		}
		//copy the Set
		Set<String> setOptions=new LinkedHashSet<>();
		setOptions.addAll(listoptions);
		//3.get Size
		int  listsize=listoptions.size();
		int setsize=setOptions.size();
		
		//condition duplicate present or not
		if(listsize==setsize) {
			System.out.println("No duplicate");
		}
		else {
			System.out.println("Duplicate");
			
		
		
			
		}
		
	}



	}

	