package com.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test {

	public static void main(String[] args) {
 //1. launch chrome:
		System.setProperty("webdriver.gecko.driver", "/Users/imanahmad/Selenium/geckodriver");
		WebDriver driver = new FirefoxDriver();
		//2 enter url:
		driver.get("http://syntaxtechs.com");
		
	//3 get the title:
		
		String title = driver.getTitle();
		System.out.println("actual title of the page is "+title);
		
		//validate the title:
		
		if(title.equals("Google")) {
			System.out.println("correct title");
		}else {
			System.out.println("incorrect title");
		}
		//close browser:
		driver.quit();
		
	
		
	}

}
