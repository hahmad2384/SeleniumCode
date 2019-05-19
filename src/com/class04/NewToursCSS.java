package com.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewToursCSS {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "/Users/imanahmad/Selenium/chromedriver");

		WebDriver driver = new ChromeDriver();

		driver.navigate().to("http://newtours.demoaut.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='REGISTER']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input#email")).sendKeys("alex95");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("test123");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[name^='conf']")).sendKeys("test123");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[name$='ter']")).click();
	}

}
