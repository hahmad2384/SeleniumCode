package com.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToursXpath {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "/Users/imanahmad/Selenium/chromedriver");

		WebDriver driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		Thread.sleep(2000);

		driver.findElement(By.linkText("REGISTER")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Jhon");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Smith");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("2403743568");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("jhon95@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='address1']")).sendKeys("9746 All Saints Road");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='address2']")).sendKeys("Apt K");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='city']")).sendKeys("Laurel");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='state']")).sendKeys("MD");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='postalCode']")).sendKeys("20723");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//select[@name='country']")).click();
		Select country = new Select(driver.findElement(By.xpath("//select[@name='country']")));
		country.selectByVisibleText("RUSSIA");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("jhon95");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("jhon1234");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys("jhon1234");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='register']")).click();
		Thread.sleep(2000);

		
	}

}
