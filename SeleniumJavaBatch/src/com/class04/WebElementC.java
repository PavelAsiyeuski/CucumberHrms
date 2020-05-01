package com.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementC {
public static void main(String[] args) throws InterruptedException {
	String url="http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx";
	System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get(url);
	
	WebElement userName=driver.findElement(By.xpath("//input[contains(@id,'username')]"));
	
	userName.sendKeys("Tester");
	Thread.sleep(3000);
	userName.clear();
	WebElement pass=driver.findElement(By.cssSelector("input[name*='$password']"));
	pass.clear();
	Thread.sleep(3000);
	pass.sendKeys("test");
	WebElement loginBtn=driver.findElement(By.cssSelector("input[value='Login']"));
	
	boolean logoIsDisplayed=driver.findElement(By.xpath("//h1[text()='Web Orders']")).isDisplayed();
	
	if(logoIsDisplayed) {
		System.out.println("Logo is Displayed, Test Case passed");
	}else {
		System.out.println("Logo is NOT Displayed, Test Case faild");

	}
	WebElement loginInfo=driver.findElement(By.xpath("//div[@class='login_info']"));
	String text=loginInfo.getText();//Used to retrieve the inner text of a web element.
	
	if(text.contains("Tester")) {
		System.out.println("User Successfully logged in, Test Case passed");
	}else {
		System.out.println("User is NOT logged in, Test Case Faild");

	}
}
}
