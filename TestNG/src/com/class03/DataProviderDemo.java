package com.class03;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.utils.PageInitializer;

public class DataProviderDemo extends PageInitializer{
	
	@Test(dataProvider="getData")
	public void login(String username, String password) {	
	sendText(login.username,username);
	sendText(login.password,password);
	click(login.loginBtn);
	
	boolean isDisplayed=dashboard.welcome.isDisplayed();
	Assert.assertTrue(isDisplayed,"Welcome msg is not displayed");
	}
	
	@DataProvider
	public Object[][] getData(){
	//1st way
		Object [][] data= { {"Admin","Hum@nhrm123"},{"Syntax","Syntax123!"},{"SyntaxUser","Syntax123!"}};
		
	//2nd way	
		Object [][] data2= new Object [3][3];
		data2[0][0]="Admin";
		data2[0][1]="Hum@nhrm123";
		data2[1][2]=15;
		
		data2[1][0]="Syntax";
		data2[1][1]="Syntax123!";
		data2[1][2]=32;
		
		data2[2][0]="SyntaxH";
		data2[2][1]="Syntax123!!";
		data2[2][2]=155;
		
		return data;
	}
}
