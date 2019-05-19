package com.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/imanahmad/Selenium/chromedriver");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.instagram.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@name,'emailO')]")).sendKeys("qatester492@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[name^='full']")).sendKeys("John Smith");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[name='username']")).sendKeys("hahm2384");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[starts-with(@name,'pass')]")).sendKeys("john123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(text(),'Sig')]")).click();
	}

}
