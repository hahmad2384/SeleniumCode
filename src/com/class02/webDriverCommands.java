package com.class02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webDriverCommands {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "/Users/imanahmad/Selenium/chromedriver");

		WebDriver driver = new ChromeDriver();

		driver.get("http://facebook.com");
		System.out.println(driver.getTitle());
		
		
		String title = driver.getTitle();
		if(title.equalsIgnoreCase("facebook - log in or sign up")) {
			System.out.println("Correct Title");
		}else {
			System.out.println("Incorrect Title");
		}
		driver.close();
		
		
	}

}
