package org.text;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FbLocator {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Workspace\\Selenium\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	
	driver.findElement(By.xpath("//a{@id='u_0_0_Y0'}ancestor::div{@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']//preceding-sibling::div//child::a{id='u_0_5_2a']"));
	
	
}
	
}
