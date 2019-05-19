package com.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolsQaCSS {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "/Users/imanahmad/Selenium/chromedriver");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.toolsqa.com/automation-practice-form/");
		
		driver.findElement(By.cssSelector("input[name^='first']")).sendKeys("John");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[name*='last']")).sendKeys("Smith");

	}

}
