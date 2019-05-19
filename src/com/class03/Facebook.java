package com.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "/Users/imanahmad/Selenium/chromedriver");

		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/");

		driver.findElement(By.xpath("//*[@id=\'email\']")).sendKeys("imhussainahmad74@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.name("pass")).sendKeys("mike12345");

		Thread.sleep(3000);

		driver.findElement(By.partialLinkText("Forgot")).click();

		Thread.sleep(3000);
		driver.navigate().back();

		Thread.sleep(3000);
		driver.findElement(By.name("pass")).sendKeys("mike12345");

		Thread.sleep(2000);

		driver.findElement(By.id("loginbutton")).click();
	}

}
