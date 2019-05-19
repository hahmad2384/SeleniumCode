package com.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ContainsAndStartsWith {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "/Users/imanahmad/Selenium/chromedriver");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.saucedemo.com/");
		Thread.sleep(2000);
//		driver.findElement(By.xpath("//input[contains(@id,'user-name')]")).sendKeys("problem_user");
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//input[contains(@data-test,'pass')]")).sendKeys("secret_sauce");
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//input[contains(@value,'LO')]")).click();
		driver.findElement(By.xpath("//input[starts-with(@id,'user-name')]")).sendKeys("problem_user");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[starts-with(@id,'pass')]")).sendKeys("secret_sauce");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[starts-with(@type,'submit')]")).click();
	}

}
