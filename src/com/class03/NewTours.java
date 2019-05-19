package com.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class NewTours {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "/Users/imanahmad/Selenium/chromedriver");

		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);

		driver.navigate().to("http://newtours.demoaut.com/");
		Thread.sleep(2000);

		driver.manage().window().maximize();

		driver.findElement(By.linkText("REGISTER")).click();
		Thread.sleep(2000);

		driver.findElement(By.name("firstName")).sendKeys("Jhon");
		Thread.sleep(2000);

		driver.findElement(By.name("lastName")).sendKeys("Smith");
		Thread.sleep(2000);

		driver.findElement(By.name("phone")).sendKeys("2403743568");
		Thread.sleep(2000);

		driver.findElement(By.id("userName")).sendKeys("jhon95@gmail.com");
		Thread.sleep(2000);

		driver.findElement(By.name("address1")).sendKeys("9261 All Saints Road");
		Thread.sleep(2000);

		driver.findElement(By.name("city")).sendKeys("Laurel");
		Thread.sleep(2000);

		driver.findElement(By.name("state")).sendKeys("MD");
		Thread.sleep(2000);

		driver.findElement(By.name("postalCode")).sendKeys("20723");
		Thread.sleep(2000);

		driver.findElement(By.name("country")).click();
		Select country = new Select(driver.findElement(By.name("country")));
		country.selectByVisibleText("UNITED STATES");
		Thread.sleep(2000);

		driver.findElement(By.id("email")).sendKeys("john95");
		Thread.sleep(2000);

		driver.findElement(By.name("password")).sendKeys("john123");
		Thread.sleep(2000);

		driver.findElement(By.name("confirmPassword")).sendKeys("john123");
		Thread.sleep(2000);

		driver.findElement(By.name("register")).click();

		Thread.sleep(2000);
		driver.findElement(By.linkText("sign-in")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("userName")).sendKeys("john95");
		Thread.sleep(2000);

		driver.findElement(By.name("password")).sendKeys("john123");
		Thread.sleep(2000);
		driver.findElement(By.name("login")).click();

	}

}
