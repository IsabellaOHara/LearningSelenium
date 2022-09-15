package com.qa.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonClick {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
		WebDriver driver = new ChromeDriver();

		driver.get("http://uitestingplayground.com/");
		String pageTitle = driver.findElement(By.id("title")).getText();

		System.out.println("Page title is : " + pageTitle);

		driver.findElement(By.linkText("Click")).click();

		WebElement button = driver.findElement(By.id("badButton"));

		System.out.println("Before clicking :" + button.getCssValue("background-color"));
		button.click();
		Thread.sleep(2000);
		System.out.println("After clicking :" + button.getCssValue("background-color"));
	}

}
