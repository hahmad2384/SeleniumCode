package com.class02;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail {


		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "/Users/imanahmad/Selenium/chromedriver");

			WebDriver driver = new ChromeDriver();
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			driver.get("https://accounts.google.com/ServiceLogin/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=AddSession");
	
			driver.findElement(By.id("identifierId")).sendKeys("hussaingahmad8@gmail.com");
			Thread.sleep(2000);
			driver.findElement(By.className("RveJvd")).click();
			Thread.sleep(2000);
driver.findElement(By.name("password")).sendKeys("Hacker2525@@$$");
Thread.sleep(2000);

driver.findElement(By.className("RveJvd")).click();
Thread.sleep(2000);


}
}