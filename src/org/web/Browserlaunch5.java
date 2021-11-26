package org.web;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Browserlaunch5 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vignesh vicky\\eclipse-workspace\\Seljava\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.t-mobile.com/?src=spr&rdpage=%2F");
		
		Thread.sleep(2);
	    WebElement lnkph = driver.findElement(By.id("nav-link-contaniner-1"));
		Actions actions=new Actions(driver);
		actions.moveToElement(lnkph).perform();
		WebElement lnkg = driver.findElement(By.xpath("//span[text()='5G phones']"));
		lnkg.click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
