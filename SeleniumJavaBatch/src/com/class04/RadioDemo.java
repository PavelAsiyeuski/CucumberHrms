package com.class04;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioDemo {
public static void main(String[] args) {
	String url="https://demoqa.com/automation-practice-form/";
	System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get(url);
	WebElement maleRadioB = driver.findElement(By.xpath("//input[@id='sex-0']"));
	System.out.println(maleRadioB.isDisplayed()); //true
	System.out.println(maleRadioB.isEnabled());//true
	System.out.println("Radio Button is selected : "+maleRadioB.isSelected());//false
	System.out.println("*********************");
	//first way to click on radio button
	maleRadioB.click();
	System.out.println("Radio button is selected : "+maleRadioB.isSelected());
	
	//second way to click on radio button
	List<WebElement> listRadio = driver.findElements(By.xpath("//input[@name='profession']"));
	int listSize=listRadio.size();
	System.out.println(listSize);
	String valueToBeSelected="Manual Tester";
	for (WebElement profession:listRadio) {
		if (profession.isEnabled()) {
			String value=profession.getAttribute("valu e");
			System.out.println(value);
			if(value.equals(valueToBeSelected)) {
				profession.click();
				break;
			}
		}
	}
}
}
