package org.text;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectCountry {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://omrbranch.com/apitestingtraininginchennaiomr");
		WebElement element = driver.findElement(By.id("country-list"));
		Select s = new Select(element);

		List<WebElement> options = s.getOptions();
		List<Integer>	li = new ArrayList<Integer>();
	
	System.out.println("1st five country");	
	for (int i = 0; i <=5; i++) {
		WebElement element1 = options.get(i);
		String text = element1.getText();
		System.out.println(text);
		
	}
	System.out.println();
	System.out.println("last five country");
	
for (int i = options.size()-5; i< options.size(); i++) {
WebElement element2 = options.get(i);
String text2 = element2.getText();

System.out.println(text2);

}
 System.out.println();
System.out.println("mid country");
WebElement element3 = options.get(options.size()/2);
String text3 = element3.getText();
System.out.println(text3);
}

}