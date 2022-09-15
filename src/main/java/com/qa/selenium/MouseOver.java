package com.qa.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOver {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.worldatlas.com/");
		
		Actions action = new Actions(driver);
		
		WebElement continents = driver.findElement(By.xpath("//label[@class='nav_categroy_parent nav_menu'][@for='nav_check_continents'"));
		action.moveToElement(continents).build().perform();
		
		WebElement europe = driver.findElement(By.xpath("//a[containts(text(),'Europe')]"));
		europe.click();

	}

}
