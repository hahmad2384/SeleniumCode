package com.class06;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownRadio {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "/Users/imanahmad/Selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.get("https://www.toolsqa.com/automation-practice-form/");
		// if we pass wrong element type to the Select class
		// we will get UnexpectTagNameException
		// identify DropDown with <Select>

		WebElement continentsDD = driver.findElement(By.cssSelector("select#continents"));
		// Pass to the Select class constructor
		Select select = new Select(continentsDD);
		//find how many options are available
		List<WebElement> allOptions = select.getOptions();
		System.out.println("Number of options in Country DD = "+allOptions.size());
		for(int i=0; i<allOptions.size(); i++) {
			System.out.println(allOptions.get(i).getText());
		}
		select.selectByVisibleText("Africa");
		Thread.sleep(2000);
		select.selectByIndex(5);
		//deselect from single DD--> we will get UnsupportedOperationException;
		Thread.sleep(2000);
System.out.println("----------------------------");
		// working with MultiSelect
		WebElement commandsDD = driver.findElement(By.id("selenium_commands"));
		Select select1 = new Select(commandsDD);
		List<WebElement> allOptions1 = select1.getOptions();
		System.out.println("Number of options in commands DD = "+allOptions1.size());
		Iterator<WebElement> it = allOptions1.iterator();
		while(it.hasNext()) {
			String text = it.next().getText();
			System.out.println(text);
		}
		if (select1.isMultiple()) {//checks if DD support multiple options
			select1.selectByVisibleText("Navigation Commands");
			Thread.sleep(2000);
			select1.selectByIndex(2);

			select1.selectByIndex(3);
			select1.selectByIndex(4);
			
			Thread.sleep(5000);

		}
		//Deselect form Multiple DropDown
		select1.deselectByIndex(4);
		Thread.sleep(7000);
		driver.quit();
	}

}
