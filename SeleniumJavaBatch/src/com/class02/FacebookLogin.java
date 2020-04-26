package com.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://facebook.com");
		driver.findElement(By.id("email")).sendKeys("mr.pipiska@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("234343434343");
		
		
	}
}
