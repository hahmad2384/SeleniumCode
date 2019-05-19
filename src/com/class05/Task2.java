package com.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {
	/*
	 * TC 2: Swag Labs Negative login: Open chrome browser Go to
	 * “https://www.saucedemo.com/” Enter invalid username and password and click
	 * login Verify error message contains: “Username and password do not match any
	 * user in this service”
	 */
	public static String userName;
	public static String password;

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "/Users/imanahmad/Selenium/chromedriver");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		//1- Launch Site
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.cssSelector("input[id='user-name']")).sendKeys("problemuser");
		driver.findElement(By.cssSelector("input[id='password']")).sendKeys("secretsauce");
		driver.findElement(By.cssSelector("input[type='submit']")).submit();
		WebElement error = driver.findElement(By.cssSelector("h3[data-test='error']"));
		String msg = error.getText();
		System.out.println(msg);
		
		if (msg.contains("Username and password do not match any user in this service")) {
			System.out.println("It match the error message");
		} else {
			System.out.println("It doesn't match the error message");

		}
		Thread.sleep(2000);
		driver.close();

	}

}
