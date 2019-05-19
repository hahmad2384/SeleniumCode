package com.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FbXpath {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "/Users/imanahmad/Selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("html/body/div/div/div/div/div/div/div/form/table/tbody/tr/td/input[@id='email']")).sendKeys("imhussainahmad74@gmail.com");
		Thread.sleep(2000);
driver.findElement(By.xpath("html/body/div/div/div/div/div/div/div/form/table/tbody/tr/td[2]/input[@name='pass']")).sendKeys("mike12345");
Thread.sleep(2000);
driver.findElement(By.xpath("html/body/div/div/div/div/div/div/div/form/table/tbody/tr/td[3]/label/input[@value='Log In']")).click();
	}

}
