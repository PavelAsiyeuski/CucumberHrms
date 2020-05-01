package com.class04;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonLinks {
public static void main(String[] args) {
	String url = "http://amazon.com";
	System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get(url);
	int count=0;
	List <WebElement> linksList = driver.findElements(By.tagName("a"));
	int size=linksList.size();
	for (WebElement link:linksList) {
		String a=link.getText();
		System.out.println(a);
		if (!a.isEmpty()) {
	System.out.println(a);
	count++;
		}
	
		
	}
	System.out.println(count);
	driver.quit();
	


}
}
