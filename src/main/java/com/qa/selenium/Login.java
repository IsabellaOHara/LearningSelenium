package com.qa.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","/usr/local/bin/chromedriver");
		WebDriver driver = new ChromeDriver();

		driver.get("http://uitestingplayground.com/");
		String pageTitle = driver.findElement(By.id("title")).getText();

		System.out.println("Page title is : " + pageTitle);
		
		driver.findElement(By.linkText("Sample App")).click();
		
		WebElement username = driver.findElement(By.xpath("//input[@name='UserName']"));
		WebElement password = driver.findElement(By.name("Password"));
		WebElement login = driver.findElement(By.id("login"));
		
		username.sendKeys("testUser");
		password.sendKeys("pwd");
		login.click();
		
		
		WebElement welcomeText = driver.findElement(By.id("loginstatus"));
				if (welcomeText.getText().equals("Welcome, testUser!")) {
					System.out.println("Successfully logged in");
		} else {
			System.out.println("failed to login");
	}
		

	}
}
