package com.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewToursContainsAndStartsWith {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/imanahmad/Selenium/chromedriver");

		WebDriver driver = new ChromeDriver();

		driver.navigate().to("http://newtours.demoaut.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'SIGN')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[starts-with(@name,'userName')]")).sendKeys("jhon95");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@name,'pass')]")).sendKeys("john123");
		Thread.sleep(2000);
driver.findElement(By.xpath("//input[contains(@name,'lo')]")).click();

	}

}
