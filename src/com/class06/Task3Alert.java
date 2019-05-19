package com.class06;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task3Alert {
	/*
	 * TC 1: JavaScript alert text verification Open chrome browser Go to
	 * “https://www.seleniumeasy.com/test/javascript-alert-box-demo.html” Verify
	 * alert box with text “I am an alert box!” is present confirm box with text
	 * “Press a button!” is present prompt box with text “Please enter your name” is
	 * present Quit browser
	 * 
	 */
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "/Users/imanahmad/Selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
		driver.findElement(By.xpath("//button[text()='Click me!']")).click();
		Thread.sleep(2000);
		Alert alert = driver.switchTo().alert();
		String text = alert.getText();
		System.out.println("Text of Simple Alert is: " + text);
		alert.accept();
		driver.findElement(By.xpath("//button[@onclick='myConfirmFunction()']")).click();
		Thread.sleep(2000);
		Alert confirmAlert = driver.switchTo().alert();
		System.out.println("Text of Comfirm Alert is: " + confirmAlert.getText());
		confirmAlert.dismiss();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Click for Prompt Box']")).click();
		Thread.sleep(2000);
		Alert promptAlert = driver.switchTo().alert();
		System.out.println("Text of Prompt Alert is: " + promptAlert.getText());
		promptAlert.accept();
		Thread.sleep(2000);
		driver.quit();
	}

}
