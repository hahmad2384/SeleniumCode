package com.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookSignUp {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/imanahmad/Selenium/chromedriver");

		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/");
		
		driver.findElement(By.name("firstname")).sendKeys("Mike");
		Thread.sleep(3000);
		driver.findElement(By.name("lastname")).sendKeys("Hennick");
		Thread.sleep(3000);

		driver.findElement(By.name("reg_email__")).sendKeys("hussain.ahmad8@gmail.com");
		Thread.sleep(3000);

		driver.findElement(By.id("u_0_k")).sendKeys("hussain.ahmad8@gmail.com");
		Thread.sleep(3000);

		driver.findElement(By.id("u_0_o")).sendKeys("mike12345");
		Thread.sleep(3000);

		driver.findElement(By.id("month")).click();
		Select month = new Select(driver.findElement(By.id("month")));
		month.selectByVisibleText("Apr");
		Thread.sleep(3000);

		driver.findElement(By.id("day")).click();
		Select day = new Select(driver.findElement(By.id("day")));
		day.selectByVisibleText("17");
		Thread.sleep(3000);

		driver.findElement(By.id("year")).click();
		Select year = new Select(driver.findElement(By.id("year")));
		year.selectByVisibleText("1995");
		Thread.sleep(3000);

		WebElement radio1 = driver.findElement(By.id("u_0_a"));
		radio1.click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
	}

}
