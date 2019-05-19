package com.class05;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task3 {
	/*
	 * TC 1: Amazon link count:
Open chrome browser
Go to “https://www.amazon.com/”
Using Iterator get text of each link
Get number of links that has text
	 */
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "/Users/imanahmad/Selenium/chromedriver");

	WebDriver driver=new ChromeDriver();
	driver.manage().window().fullscreen();
	driver.get("https://www.amazon.com/");
	
	List<WebElement> links = driver.findElements(By.tagName("a"));
	
	System.out.println("Total number of links: "+links.size());
	
	int count = 0;
	Iterator<WebElement> link = links.iterator();
	while(link.hasNext()) {
		String getLink = link.next().getText();
		System.out.println(getLink);
		
		if(!getLink.isEmpty()) {
			System.out.println(getLink);
			count++;
		}
		
	}
	System.out.println("Total number of links with text "+count);

	driver.quit();
	
}
}
