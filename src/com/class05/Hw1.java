package com.class05;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hw1 {

	/*
	 * TC 1: Tools QA check all elements Open chrome browser Go to
	 * “https://www.toolsqa.com/automation-practice-form/” Fill out: First Name Last
	 * Name Check that sex radio buttons are enabled and select “Male” Check all
	 * Years of Experience radio buttons are clickable Date Select both checkboxes
	 * for profession Check all Automation Tools checkboxes are clickable and keep
	 * “Selenium WebDriver” option as selected Quit browser
	 */

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "/Users/imanahmad/Selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.get("https://www.toolsqa.com/automation-practice-form/");
		driver.findElement(By.cssSelector("input[name='firstname']")).sendKeys("John");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[name='lastname']")).sendKeys("Smith");

		List<WebElement> buttons = driver.findElements(By.name("sex"));
		String expected = "Male";
		System.out.println(buttons.size());
		Thread.sleep(2000);

		for (WebElement radio : buttons) {
			String value = radio.getAttribute("value");
			System.out.println(value);
			if (radio.isEnabled()) {
				radio.click();
				Thread.sleep(2000);
			}
		}
		WebElement radio1 = driver.findElement(By.id("sex-0"));
		radio1.click();
		Thread.sleep(2000);

		List<WebElement> years = driver.findElements(By.name("exp"));
		Thread.sleep(2000);

		for (WebElement year : years) {
			String value = year.getAttribute("value");
			if (year.isEnabled()) {
				year.click();
				Thread.sleep(2000);
			}
		}

		driver.findElement(By.cssSelector("input[id='datepicker']")).sendKeys("05/18/2019");
		List<WebElement> profession = driver.findElements(By.name("profession"));
		for (WebElement tester : profession) {
			if (tester.isEnabled()) {
				tester.click();
				Thread.sleep(2000);
			}
		}
		String auto = "QTP";
		String auto1 = "Selenium IDE";
		List<WebElement> tools = driver.findElements(By.name("tool"));
		for (WebElement tool : tools) {
			String value = tool.getAttribute("value");
			System.out.println(value);
			if (tool.isEnabled()) {
				tool.click();
				Thread.sleep(2000);
				if (value.equals(auto) || value.equals(auto1)) {
					tool.click();
				}
			}
		}
		Thread.sleep(2000);

		driver.quit();

	}

}
