package com.class02;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.pages.LoginPageElements;
import com.utils.CommonMethods;

public class AssertionDemo extends CommonMethods{

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
		//1st way
		//Assert.assertEquals(actualTitle, expectedTitle);
		//2nd way with message
		Assert.assertEquals(actualTitle, expectedTitle, "Title does not match");
		System.out.println("Text after assertion");
	}
	
	@Test (priority=2, dependsOnMethods= { "titleValidation" })
	public void logoValidation() {
		LoginPageElements login=new LoginPageElements();
		boolean logoIsDisplayed=login.logo.isDisplayed();
		logoIsDisplayed=false;
		SoftAssert soft=new SoftAssert();
	
		soft.assertTrue(logoIsDisplayed,"Logo is not displayed");
		soft.assertAll();
	}
	
	@Test (priority=3)
	public void welcome() {
		LoginPageElements login=new LoginPageElements();
		login.username.sendKeys("Admin");
		login.password.sendKeys("Hum@nhrm123");
		login.loginBtn.click();
		String welcome=driver.findElement(By.xpath("//a[text()='Welcome Admin']")).getText();
		String expectWelcome="Welcome Admin";
		wait(2); 
		Assert.assertEquals(welcome,expectWelcome,"Text is not displayed");
		
	}
}
