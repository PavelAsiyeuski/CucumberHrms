package com.class03;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.utils.ExcelUtility;
import com.utils.PageInitializer;

public class HW extends PageInitializer{
	
	@Test(dataProvider="userDataFromExcel")
	public void loginTest(String firstName,String lastName,String username,String pass) throws IOException {
	login.login("Admin","Hum@nhrm123");
	wait(2);
	click(driver.findElement(By.linkText("PIM")));
	wait(1);
	click(driver.findElement(By.linkText("Add Employee")));
	wait(2);
	sendText(addEmp.firstName, firstName);
	sendText(addEmp.lastName,lastName);
	click(addEmp.loginCheckbox);
	sendText(addEmp.username,username);
	sendText(addEmp.password,pass);
	sendText(addEmp.passConfirm,pass);
	click(addEmp.saveBtn);
	wait(3);
	TakesScreenshot ts=(TakesScreenshot)driver;
	File sourceFile=ts.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(sourceFile, new File("screenshots/HRMS/"+username+".png"));
		
	}
	
	@DataProvider
	public Object [][] employee(){
		Object[][] data= {
				{"Paul","Walker","PaulG","10293847Qazwsx!!"},
				{"Magie","Hop","MaggieH","10293847Qazwsx!!"},
				{"Justin","Timberlake","JustinT","10293847Qazwsx!!"},
				{"Robbie","Mar","RobbieM","10293847Qazwsx!!"},
				{"John","Smith","JohnSMM","10293847Qazwsx!!"}
		};
		return data;
	}
	
	@DataProvider(name="userDataFromExcel")
	public Object [][] getData(){
		return  ExcelUtility.excelToArray(System.getProperty("user.dir")+"/testdata/excel.xlsx","Sheet1");
		
	}
}
