package org.web;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BrowserLaunch4 {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vignesh vicky\\eclipse-workspace\\Seljava\\Driver\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.greenstechnologys.com/");
		driver.manage().window().maximize();
		WebElement lnkco = driver.findElement(By.xpath("//a[text()='COURSES']"));
		
		Actions actions=new Actions(driver);
		actions.moveToElement(lnkco).perform();
		
		WebElement lnkjt = driver.findElement(By.xpath("//span[text()='Java Training']"));
		actions.moveToElement(lnkjt).perform();
		 WebElement btnclk = driver.findElement(By.xpath("//span[text()='Core Java Training']"));
		 btnclk.click();
		
	
		
	}

}
