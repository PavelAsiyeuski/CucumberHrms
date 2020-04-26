package com.class02;

import org.openqa.selenium.chrome.ChromeDriver;

public class TestWebDriver {
public static void main(String[] args) throws InterruptedException {
	SWebDriver driver = new SChromeDriver();
	
	driver.get("https://google.com");
	Thread.sleep(1000);
	driver.close();
	
}
}
