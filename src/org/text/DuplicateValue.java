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

public class DuplicateValue {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Workspace\\Selenium\\driver\\chromedriver.exe");	
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://omrbranch.com/apitestingtraininginchennaiomr");
		driver.manage().window().maximize();
		WebElement element=driver.findElement(By.id("country-list"));   
		
		Select select =new Select(element);
		List<String> listoptions=new ArrayList<String>();
		Set<String>  setValues=new LinkedHashSet<String>();
		Set <String> SetDuplicateValue=new LinkedHashSet<String>();
		List<WebElement> options=select.getOptions();
		for (WebElement element2:options) {
			String text=element2.getText();
			listoptions.add(text);
			boolean addAll=setValues.addAll(listoptions);
			if(addAll==false) {
				SetDuplicateValue.addAll(listoptions);
				
			}
			
		}
		System.out.print("Duplicate Values"+SetDuplicateValue);	
		
		}

	}