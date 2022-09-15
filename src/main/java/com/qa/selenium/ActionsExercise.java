package com.qa.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsExercise {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://webdriveruniversity.com/Actions/index.html");
		
		Actions action = new Actions(driver);
		
		WebElement draggable = driver.findElement(By.id("draggable"));
		WebElement droppable = driver.findElement(By.id("droppable"));
		
		action.dragAndDrop(draggable, droppable).build().perform();
	
		Thread.sleep(2000);
		
		String colourChange = driver.findElement(By.xpath("//div[@id='droppable']/p")).getCssValue("background-color");
		String changedText = driver.findElement(By.xpath("//div[@id='droppable']/p")).getText();
		
		if(colourChange.equals("rgba(244, 89, 80, 1)") && changedText.equals("Dropped!")) {
			System.out.println("Action successful");
		} else {
			System.out.println("Action failed");
		}
		
		WebElement clickbox = driver.findElement(By.id("click-box"));
		
		action.clickAndHold(clickbox).build().perform();
		
		Thread.sleep(2000);
		
		String boxClicked = driver.findElement(By.id("click-box")).getText();
		if(boxClicked.equals("Well done! keep holding that click now.....")) {
			System.out.println("Action successful");
		} else {
			System.out.println("Action failed");
		
		}
		
		Thread.sleep(2000);
		
		action.release(clickbox).build().perform();
		String boxRelease = driver.findElement(By.id("click-box")).getText();
		if(boxRelease.equals("Dont release me!!!")) {
			System.out.println("Action successful");
		} else {
			System.out.println("Action failed");
		
		}
		
		WebElement doubleClick = driver.findElement(By.id("double-click"));
		
		action.doubleClick(doubleClick).build().perform();

		WebElement doubleClicked = driver.findElement(By.className("div-double-click double"));
		
		
		//general actions
		driver.navigate().back();
        Thread.sleep(2000);
        driver.navigate().forward();
        Thread.sleep(2000);
        driver.navigate().refresh();
        Thread.sleep(2000);
        driver.quit();
		
	}

}
