package com.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeXpath {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/imanahmad/Selenium/chromedriver");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.saucedemo.com/");

		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("standard_user"); //Relative Xpath --> represented by //---specify location of locator
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce"); //Relative Xpath
		Thread.sleep(2000);

		driver.findElement(By.xpath("html/body/div/div/div/div/form/input[@type='submit']")).click(); //Absolute Xpath ---> represented by /---- specify html/body and then specify location of locator
	}

}
