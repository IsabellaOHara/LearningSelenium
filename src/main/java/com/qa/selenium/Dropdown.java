package com.qa.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
		

		System.setProperty("webdriver.chrome.driver","/usr/local/bin/chromedriver");
		WebDriver driver = new ChromeDriver();

		driver.get("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");

		
		WebElement progLanguageDropdown = driver.findElement(By.id("dropdowm-menu-1"));
		Select prog = new Select(progLanguageDropdown);
		
		prog.selectByIndex(2);
//		prog.deselectByIndex(0);
		
		WebElement progIdeDropdown = driver.findElement(By.id("dropdowm-menu-2"));
		Select ide = new Select(progIdeDropdown);
		
		ide.selectByValue("maven");
//		ide.deselectByValue("maven");
		
		WebElement scriptingLanguageDropdown = driver.findElement(By.id("dropdowm-menu-3"));
		Select scripting = new Select(scriptingLanguageDropdown);
		
		scripting.selectByVisibleText("JQuery");
//		scripting.deselectByVisibleText("JQuery");
		//deselect only works when you can select multiple things (aka not with a dropdown
		
	}
	
}
