package com.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParaBank {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/imanahmad/Selenium/chromedriver");

		WebDriver driver = new ChromeDriver();
		driver.get(
				"https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
		Thread.sleep(2000);
		driver.findElement(By.id("customer.firstName")).sendKeys("John");
		Thread.sleep(2000);

		driver.findElement(By.id("customer.lastName")).sendKeys("Smith");
		Thread.sleep(2000);

		driver.findElement(By.name("customer.address.street")).sendKeys("9261 All Saints Road");
		Thread.sleep(2000);

		driver.findElement(By.id("customer.address.city")).sendKeys("Laurel");
		Thread.sleep(2000);

		driver.findElement(By.id("customer.address.state")).sendKeys("MD");
		Thread.sleep(2000);

		driver.findElement(By.id("customer.address.zipCode")).sendKeys("20723");
		Thread.sleep(2000);

		driver.findElement(By.id("customer.phoneNumber")).sendKeys("2403743476");
		Thread.sleep(2000);

		driver.findElement(By.id("customer.ssn")).sendKeys("542543486");
		Thread.sleep(2000);

		driver.findElement(By.id("customer.username")).sendKeys("hahmad2384");
		Thread.sleep(2000);

		driver.findElement(By.id("customer.password")).sendKeys("syntax123");
		Thread.sleep(2000);

		driver.findElement(By.id("repeatedPassword")).sendKeys("syntax123");
		Thread.sleep(2000);
		driver.findElement(By.className("button")).click();
		Thread.sleep(2000);

		driver.findElement(By.name("username")).sendKeys("hahmad2384");
		Thread.sleep(2000);

		driver.findElement(By.name("password")).sendKeys("syntax123");
		Thread.sleep(2000);

		driver.findElement(By.className("button")).click();

	}

}
