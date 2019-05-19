package com.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HelloWorld {

	public static void main(String[] args) {
		
//		System.setProperty("webdriver.chrome.driver", "/Users/imanahmad/Selenium/chromedriver");
//
//		WebDriver driver = new ChromeDriver();
//		
//		driver.get("http://facebook.com");
//		driver.manage().window().maximize();
//		driver.get("http://amazon.com");
//		driver.get("http://google.com");
	
		System.setProperty("webdriver.gecko.driver", "/Users/imanahmad/Selenium/geckodriver");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://google.com");
		String title = driver.getTitle();
		if(title.equals("Google")) {
			System.out.println("Correct Title");
		}else {
			System.out.println("Incorrect Title");
		}
		driver.quit();
		
		
	}

}
