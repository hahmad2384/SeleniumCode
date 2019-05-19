package com.class05;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Hw2 {
	/*
	 * TC 1: Facebook dropdown verification Open chrome browser Go to
	 * “https://www.facebook.com” Verify: month dd has 12 month options day dd has
	 * 31 day options year dd has 115 year options Select your date of birth Quit
	 * browser
	 */
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "/Users/imanahmad/Selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		WebElement m = driver.findElement(By.id("month"));
		Select obj = new Select(m);
		List<WebElement> allOptions = obj.getOptions();
		System.out.println(allOptions.size() - 1);
		obj.selectByVisibleText("Apr");

		WebElement d = driver.findElement(By.id("day"));
		Select obj1 = new Select(d);
		List<WebElement> days = obj1.getOptions();
		System.out.println(days.size() - 1);
		obj1.selectByVisibleText("17");

		WebElement y = driver.findElement(By.id("year"));
		Select obj2 = new Select(y);
		List<WebElement> years = obj2.getOptions();
		System.out.println(years.size() - 1);
		obj2.selectByVisibleText("1995");

//		driver.findElement(By.id("month")).click();
//		Select month = new Select(driver.findElement(By.id("month")));
//		month.selectByVisibleText("Apr");
//		Thread.sleep(2000);
//
//		driver.findElement(By.id("day")).click();
//		Select day = new Select(driver.findElement(By.id("day")));
//		day.selectByVisibleText("17");
//		Thread.sleep(2000);
//
//		driver.findElement(By.id("year")).click();
//		Select year = new Select(driver.findElement(By.id("year")));
//		year.selectByVisibleText("1995");

		Thread.sleep(2000);
		driver.quit();
	}

}
