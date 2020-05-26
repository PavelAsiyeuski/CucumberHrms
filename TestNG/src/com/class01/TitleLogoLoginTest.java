package com.class01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.utils.CommonMethods;

public class TitleLogoLoginTest extends CommonMethods{

	@BeforeMethod
	public void openBrowser() {
		setUp();
		wait(1);
	}
	
	@AfterMethod
	public void closeBrowser() {
		tearDown();
	}
	
	@Test
	public void titleValidation() {
		String expectedTitle="Human Management System";
		String actualTitle=driver.getTitle();
		if (actualTitle.equals(expectedTitle)) {
			System.out.println("Test case passed!");
		}else {
			System.out.println("Test case failed!");
		}
	}

	@Test 
	public void logoValidation() {
		WebElement logo=driver.findElement(By.xpath("//img"));
		if (logo.isDisplayed()) {
			System.out.println("Test case passed");
		}else {
			System.out.println("Test case failed");
		}
	}

	@Test 
	public void validLogin() {
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("Hum@nhrm123");
		driver.findElement(By.id("btnLogin")).click();
		WebElement welcome=driver.findElement(By.xpath("//a[text()='Welcome Admin']"));
		waitForVisibility(welcome);
		if (welcome.isDisplayed()) {
			System.out.println("Test case passed");
		}else {
			System.out.println("Test case failed");
		}
	}
	
}
