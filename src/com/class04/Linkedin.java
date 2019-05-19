package com.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Linkedin {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver", "/Users/imanahmad/Selenium/geckodriver");

		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().fullscreen();

		driver.get("https://www.linkedin.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Sign in']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input#username")).sendKeys("aliahmad4573@yahoo.com");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[name$='password']")).sendKeys("Hacker2525@@$$");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button.btn__primary--large")).click();
	}

}
