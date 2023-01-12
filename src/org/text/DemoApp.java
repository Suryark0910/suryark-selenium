package org.text;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoApp{
	public static void main(String[] args) {
    System.setProperty("webdriver.chrome.driver", "C:\\Workspace\\Selenium\\driver\\chromedriver.exe");
    WebDriver driver =new  ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://www.facebook.com/");
    
    //to find the total no of links
    List<WebElement> links = driver.findElements(By.name("email"));
    System.out.println(links.size());
 
    
		
	} 
	

}
