
package com.atmecs.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Practice {
	String Url = "https://www.demoblaze.com/";
	//String chromeDriverPath =".C:\\Users\\admin\\eclipse-workspace\\BlazeDemo\\lib\\chromedriver.exe";
	public WebDriver driver;

    @Test
    public void launchChromeTest() {
    	System.setProperty("webdriver.chrome.driver", "./lib/chromedriver.exe");
    	//Initializing the webDriver instances
    	@SuppressWarnings("unused")
		WebDriver  driver = new ChromeDriver();
    	//launch the webdriver
    	driver.get(Url);
    	// Maximize the window
    	driver.manage().window().maximize();
    	//implicit wait
    	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
   // }
      //  @Test
      //  public void purchaseProduct() {
    	//To click signin button
    	WebElement signin = driver.findElement(By.xpath("//a[@id='signin2']"));
    	signin.click();
    	//To enter user name
    	@SuppressWarnings("unused")
		WebElement userName = driver.findElement(By.xpath("//input[@id='sign-username']"));
    	userName.sendKeys("maheshprabha1235@gmail.com");
    	//To enter Passwords
		WebElement password = driver.findElement(By.xpath("//input[@id='sign-password']"));
    	password.sendKeys("Mahesh");
    	// To click signin button
    	WebElement signButton = driver.findElement(By.xpath("//button[text()='Sign up']"));
    	signButton.click();
    	// switch to alert
    	@SuppressWarnings("unused")
		Alert alert = driver.switchTo().alert();
    	
    	//To click login button
    	@SuppressWarnings("unused")
		WebElement login = driver.findElement(By.xpath("//a[text()='Log in']"));
    	signButton.click();
    	
    	//To enter username
		WebElement loginUsername = driver.findElement(By.xpath("//input[@id='loginusername']"));
		loginUsername.sendKeys("maheshprabha1235@gmail.com");
        // To enter Password
		WebElement loginPassword = driver.findElement(By.xpath("//input[@id='loginpassword']"));
		loginPassword.sendKeys("Mahesh");
		//To enter login button
		WebElement loginButton = driver.findElement(By.xpath("//button[text()='Log in']"));
    	loginButton.click();
    	
    	//Scenario 2
		WebElement contactButton = driver.findElement(By.xpath("//a[text()='Contact']"));
		contactButton.click();
		WebElement contactMail = driver.findElement(By.xpath("//input[@id='recipient-email']"));
		contactMail.sendKeys("maheshprabha123@gmail.com");
		WebElement contactPassword = driver.findElement(By.xpath("//input[@id='recipient-name'] "));
		contactPassword.sendKeys("Mahesh");
		WebElement contactMessage = driver.findElement(By.xpath("//textarea[@id='message-text']"));
		contactMessage.sendKeys("Mobile is good");
		WebElement ContactMessageButton = driver.findElement(By.xpath("//button[text()='Send message']"));
		ContactMessageButton.click();
    	// switch to alert
    	@SuppressWarnings("unused")
		Alert alert1 = driver.switchTo().alert();
      
    	//Add product to cart
		WebElement clickProduct = driver.findElement(By.xpath("(//h4[@class='card-title'])[1]"));
		clickProduct.click();
		WebElement addPrductToCart = driver.findElement(By.xpath("//a[@onclick='addToCart(1)']"));
		addPrductToCart.click();
		WebElement clicksecondProduct = driver.findElement(By.xpath("//a[text()='Nokia lumia 1520']"));
		clicksecondProduct.click();
		WebElement addPrductSecondToCart = driver.findElement(By.xpath("//a[@onclick='addToCart(2)']"));
		addPrductSecondToCart.click();
		//click cart
		//WebElement cart = driver.findElement(By.xpath("//a[@onclick='showcart()']"));
		//cart.click();
        }
}



