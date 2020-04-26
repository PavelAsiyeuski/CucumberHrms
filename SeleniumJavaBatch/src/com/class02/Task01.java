package com.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task01 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://newtours.demoaut.com/");
	driver.findElement(By.linkText("REGISTER")).click();
	driver.findElement(By.name("firstName")).sendKeys("Pavel");
	driver.findElement(By.name("lastName")).sendKeys("Asiyeuski");
	driver.findElement(By.name("phone")).sendKeys("123543134");
	driver.findElement(By.name("userName")).sendKeys("arfs@gmail.com");
	driver.findElement(By.name("address1")).sendKeys("1844 Main St.");
	driver.findElement(By.name("city")).sendKeys("Brooklyn");
	driver.findElement(By.name("state")).sendKeys("NY");
	driver.findElement(By.name("postalCode")).sendKeys("12411");
	driver.findElement(By.name("country")).sendKeys("UNITED STATES");
	driver.findElement(By.name("email")).sendKeys("arfs@gmail.com");
	driver.findElement(By.name("password")).sendKeys("12345678");
	driver.findElement(By.name("confirmPassword")).sendKeys("12345678");
	driver.findElement(By.name("register")).click();
}
}
