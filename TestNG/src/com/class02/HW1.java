package com.class02;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.utils.PageInitializer;

public class HW1 extends PageInitializer{

	//1) As an Admin I should be able to create login credentials while adding employee
	
	//2) As an admin while adding employee if I leave required fields empty I should see “Required” message
	//   Note: first name and last name are required fields
	
	@Test(priority=1)
	public void loginCred() {
		login.username.sendKeys("Admin");
		login.password.sendKeys("Hum@nhrm123");
		click(login.loginBtn);
		wait(2);
		click(driver.findElement(By.linkText("PIM")));
		wait(1);
		click(driver.findElement(By.linkText("Add Employee")));
		sendText(driver.findElement(By.id("firstName")), "John");
		sendText(driver.findElement(By.id("lastName")),"Smith");
		click(driver.findElement(By.id("chkLogin")));
		sendText(driver.findElement(By.id("user_name")),"JohnSmith4");
		sendText(driver.findElement(By.id("user_password")),"10293847Qazwsx!!");
		sendText(driver.findElement(By.id("re_password")),"10293847Qazwsx!!");
		
		click(driver.findElement(By.xpath("//input[@value='Save']")));
		Assert.assertTrue(driver.findElement(By.id("empPic")).isDisplayed(),"Employee login credentials weren't created");
		wait(10);
		}
	@Test(priority=2)
	public void requiredFields() {
		login.login("Admin","Hum@nhrm123");
		wait(2);
		click(driver.findElement(By.linkText("PIM")));
		wait(1);
		click(driver.findElement(By.linkText("Add Employee")));
		click(driver.findElement(By.xpath("//input[@value='Save']")));
		Assert.assertTrue(driver.findElement(By.xpath("//span[@for='firstName']")).isDisplayed(), "First Name required didn't show up");
		Assert.assertTrue(driver.findElement(By.xpath("//span[@for='lastName']")).isDisplayed(), "Last Name required didn't show up");
	}
}
