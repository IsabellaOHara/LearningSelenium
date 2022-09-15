package com.qa.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Checkboxes {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
		WebDriver driver = new ChromeDriver();

		driver.get("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");

		WebElement checkboxes = driver.findElement(By.id("checkboxes"));

		// some check-boxes will be made using selects in which case same method as
		// drop-downs
		// dynamic xpath
		for (int i = 1; i < 5; i++) {
			if (!driver.findElement(By.xpath("//input[@value='option-" + i + "']")).isSelected()) {
				driver.findElement(By.xpath("//input[@value='option-" + i + "']")).click();
			}

		}
		
		//isSelected => if element checked or not
		//isEnabled => if element is enabled/disabled
		//isDisplayed => if element is visible on the UI

	}
}
