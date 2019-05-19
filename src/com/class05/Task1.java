package com.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
	/*
	 * TC 1: Swag Labs Positive login: Open chrome browser Go to
	 * “https://www.saucedemo.com/” Enter valid username and valid password and
	 * click login Verify robot icon is displayed Verify “Products” text is
	 * available next to the robot icon
	 */

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "/Users/imanahmad/Selenium/chromedriver");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().fullscreen();
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(2000);

		driver.findElement(By.cssSelector("input[id='user-name']")).sendKeys("problem_user");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[id='password']")).sendKeys("secret_sauce");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[type='submit']")).submit();
		Thread.sleep(2000);
		WebElement icon = driver.findElement(By.cssSelector("div[class='peek']"));

		if (icon.isDisplayed()) {
			System.out.println("Robot icon is displayed");
		} else {
			System.out.println("Robot icon is NOT displayed");
		}
		WebElement text = driver.findElement(By.xpath("//div[text()='Products']"));
		String tex = text.getText();
		System.out.println(tex);

		if (tex.contains("Products")) {
			System.out.println("Text is available");
		} else {
			System.out.println("Text is not available");
		}
		driver.findElement(By.xpath("//button[text()='Open Menu']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
		driver.close();
	}

}
