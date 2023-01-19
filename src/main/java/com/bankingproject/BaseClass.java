package com.bankingproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","D:\\Selenium file\\chromedriver.exe");
		
		WebDriver driver = new 	ChromeDriver();
		driver.get("https://demo.guru99.com/V1/index.php");
	}
}
