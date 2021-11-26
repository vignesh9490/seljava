package org.web;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BrowserLaunch3 {
	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver","C:\\Users\\vignesh vicky\\eclipse-workspace\\Seljava\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.guru99.com/test/drag_drop.html");
	driver.manage().window().maximize();
	 WebElement bank = driver.findElement(By.id("credit2"));
     WebElement bnkamt = driver.findElement(By.id("bank")); 
     WebElement amt= driver.findElement(By.id("fourth"));
     WebElement bamt = driver.findElement(By.id("amt7"));
     WebElement sale = driver.findElement(By.id("credit1"));
     WebElement s = driver.findElement(By.id("loan"));
     WebElement samt = driver.findElement(By.id("fourth"));
     WebElement saleamt = driver.findElement(By.id("amt8"));
    
    
     Actions actions=new Actions(driver);
     actions.dragAndDrop(bank, bnkamt).perform();
     actions.dragAndDrop(amt, bamt).perform();
    actions.dragAndDrop(sale, s).perform();
    actions.dragAndDrop(samt, saleamt).perform();
    
        Thread.sleep(900);
		WebElement txt = driver.findElement(By.id("equal"));
	    String text = txt.getText();
	    System.out.println(text);
		 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
