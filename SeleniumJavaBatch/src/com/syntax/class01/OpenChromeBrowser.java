package com.syntax.class01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenChromeBrowser {

	public static void main(String[] args) throws InterruptedException, IOException {
		String filePath="C:\\Users\\Paul\\Desktop\\Java\\SeleniumJavaBatch\\config\\Login.properties";
		FileInputStream file = new FileInputStream(filePath);
		Properties prop=new Properties();
		prop.load(file);
		System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://facebook.com");
		String email=prop.getProperty("email");
		String pass=prop.getProperty("pass");
		
		driver.findElement(By.id("email")).sendKeys(email);
		driver.findElement(By.id("pass")).sendKeys(pass);
	}

}
