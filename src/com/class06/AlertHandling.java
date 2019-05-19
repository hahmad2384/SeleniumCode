package com.class06;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandling {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "/Users/imanahmad/Selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.get("http://uitestpractice.com/");
		//click on Swith link & alert button
		driver.findElement(By.xpath("//a[text()='Switch to']")).click();
		driver.findElement(By.xpath("//button[text()='Alert']")).click();
		//switch focus to the alert window
		Thread.sleep(3000);

		Alert alert = driver.switchTo().alert();
		alert.accept();
		Thread.sleep(2000);
		driver.findElement(By.id("confirm")).click();
		Thread.sleep(2000);

		Alert alert2 = driver.switchTo().alert();
		//getting text of an alert
		String alertText = alert2.getText();
		System.out.println(alertText);
		alert2.dismiss();
		Thread.sleep(3000);
		
		driver.findElement(By.id("prompt")).click();
		Thread.sleep(2000);

		Alert promptAlert = driver.switchTo().alert();
		String prompt = promptAlert.getText();
		System.out.println(prompt);
		promptAlert.accept();
		Thread.sleep(2000);
		driver.quit();
		
		
	}

}
