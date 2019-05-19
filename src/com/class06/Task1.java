package com.class06;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task1 {
/*
 * TC 1: Amazon Department List Verification
Open chrome browser
Go to “http://amazon.com/”
Verify how many department options available.
Print each department
Select Computers
Quit browser
 */
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/imanahmad/Selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		
		driver.get("https://www.amazon.com/");
		
		WebElement departments = driver.findElement(By.cssSelector("select#searchDropdownBox"));
		Select select = new Select(departments);
		select.selectByVisibleText("Computers");
		Thread.sleep(3000);

		List<WebElement> allOptions =  select.getOptions();
		System.out.println("Total Number of Departments are: "+allOptions.size());
		
		for(int i = 0; i<allOptions.size(); i++) {
			System.out.println(allOptions.get(i).getText());
			
		}
		
		
		Thread.sleep(2000);
		driver.quit();
		
	}

}
