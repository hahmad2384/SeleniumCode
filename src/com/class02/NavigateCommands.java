package com.class02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateCommands {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "/Users/imanahmad/Selenium/chromedriver");

		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("http://walmart.com");
		
		Thread.sleep(1000);
		 
		driver.navigate().to("http://google.com");
		Thread.sleep(1000);

		driver.navigate().back();
		Thread.sleep(1000);

		driver.navigate().forward();
		driver.navigate().refresh();
		
		driver.close();
	}

}
