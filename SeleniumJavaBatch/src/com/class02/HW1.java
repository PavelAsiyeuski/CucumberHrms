package com.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW1 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://facebook.com");
	driver.findElement(By.name("firstname")).sendKeys("Paul");
	driver.findElement(By.name("lastname")).sendKeys("Smith");
	driver.findElement(By.id("u_0_r")).sendKeys("1325464567");
	driver.findElement(By.id("u_0_13")).click();
	
	
	
}
}
