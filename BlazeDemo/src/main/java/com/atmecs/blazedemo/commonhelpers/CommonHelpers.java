package com.atmecs.blazedemo.commonhelpers;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class CommonHelpers {
	public static void webElement(WebDriver driver, String elementPath, String actual, String expected) {
		driver.findElement(By.xpath(elementPath)).getText();
    }

	public static void sendText(WebDriver driver, String elementPath, String value) {
		driver.findElement(By.xpath(elementPath)).sendKeys(value);
	}

	public static void clickAction(WebDriver driver, String elementPath) {
		driver.findElement(By.xpath(elementPath)).click();
		
	
	}
	public static void explicitWait(WebDriver driver, String path) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(path))));
	}
	//public static void validateProduct(WebDriver driver, String elementPath, String actual, String expected) {
		//WebElement Actual = driver.findElement(By.xpath(elementPath));
		//WebElement Expected = driver.findElement(By.xpath("expected"));
		//Assert.assertEquals(Actual,Expected);
		//System.out.println("Assertion passed");
	//}
	public static void validate(WebDriver driver, String actual, String expected) {
		Assert.assertEquals(actual, expected);
		System.out.println(" Passed : " + " Expected : " + expected + " Actual : " + actual);
	}


	public static void dropDownMenu(WebDriver driver, String xpath, String valueToSelect) throws Exception {
		Select dropdown = new Select(driver.findElement(By.xpath(xpath)));
		dropdown.selectByVisibleText(valueToSelect);
	}
	public static void switchTOWindows(WebDriver driver ,String elementPath) {
     String mainWindow=driver.getWindowHandle();
	Set<String> set =driver.getWindowHandles();
	Iterator<String> itr= set.iterator();
	while(itr.hasNext()){
	String childWindow=itr.next();
	if(!mainWindow.equals(childWindow)){
	driver.switchTo().window(childWindow);
	System.out.println("childwindow" + driver.switchTo().window(childWindow).getTitle());
	driver.close();
	}
	
    driver.switchTo().window(mainWindow);
	System.out.println("mainwindow" + driver.switchTo().window(mainWindow).getTitle());

    
	}
	}
	}

