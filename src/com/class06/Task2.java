package com.class06;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import utils.CommonMethods;

public class Task2 {

	/*
	 * TC 2: Select and Deselect values Open chrome browser Go to
	 * “http://uitestpractice.com/” Click on “Select” tab Verify how many options
	 * available in the first drop down and then select “United states of America”
	 * Verify how many options available in the second drop down and then select
	 * all. Deselect China from the second drop down Quit browser (edited)
	 */
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/imanahmad/Selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.get("http://uitestpractice.com/");

		driver.findElement(By.xpath("//a[text()='Select']")).click();

		WebElement dropDown = driver.findElement(By.cssSelector("select#countriesSingle"));
		CommonMethods.selectValueFromDD(dropDown, "United states of America");
		Thread.sleep(3000);
		
		
		WebElement multiDD = driver.findElement(By.cssSelector("select#countriesMultiple"));
		Select multi = new Select(multiDD);

		List<WebElement> allOptions1 = multi.getOptions();
		System.out.println("Total options in Multiple: " + allOptions1.size());
		if(multi.isMultiple()) {
		for(int i =0; i<allOptions1.size();i++) {
			multi.selectByIndex(i);
		}
		}
		Thread.sleep(2000);
		multi.deselectByIndex(2);
		Thread.sleep(2000);
		driver.quit();
	}

}
