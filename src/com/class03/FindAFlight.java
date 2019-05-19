package com.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FindAFlight {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "/Users/imanahmad/Selenium/chromedriver");

		WebDriver driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		Thread.sleep(2000);
		// Find A Flight

		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("jhon95");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("jhon1234");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='login']")).click();
		Thread.sleep(2000);
		WebElement radio1 = driver.findElement(By.xpath("//input[@value='roundtrip']"));
		// WebElement radio2 = driver.findElement(By.xpath("//input[@value='oneway']"));
		radio1.click();
		Thread.sleep(2000);

		driver.findElement(By.xpath(
				"/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[3]/td[2]/b/select/option[2]"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[4]/td[2]/select/option[4]"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[5]/td[2]/select[1]/option[6]"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[5]/td[2]/select[2]/option[8]"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[6]/td[2]/select/option[3]"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[7]/td[2]/select[1]/option[7]"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[7]/td[2]/select[2]/option[10]"))
				.click();
		Thread.sleep(2000);
		WebElement radio2 = driver.findElement(By.xpath("//input[@value='Business']"));
		radio2.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[10]/td[2]/select/option[3]"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='findFlights']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='Unified Airlines$363$281$11:24']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='Unified Airlines$633$303$18:44']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='reserveFlights']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='passFirst0']")).sendKeys("jhon");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='passLast0']")).sendKeys("smith");
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[4]/td/table/tbody/tr[2]/td[3]/select/option[6]"))
				.click();
		Thread.sleep(2000);

	}

}
