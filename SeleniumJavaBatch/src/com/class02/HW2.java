package com.class02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW2 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.zillow.com");
	driver.get("https://www.google.com");
	driver.navigate().back();
	driver.navigate().refresh();
	String url=driver.getCurrentUrl();
	if (url.contains("zillow")) {
		System.out.println("This is Zillow");
	}else {
		System.out.println("This is not Zillow");
	}
	
}
}
