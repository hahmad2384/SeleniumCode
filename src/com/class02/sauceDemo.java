package com.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sauceDemo {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "/Users/imanahmad/Selenium/chromedriver");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys("aliahmad4573@yahoo.com");
		Thread.sleep(2000);
		driver.findElement(By.id("pass")).sendKeys("Baidu2468@@");
		Thread.sleep(2000);

		driver.findElement(By.id("u_0_2")).click();
		//driver.close();
	}

}
