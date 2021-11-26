package org.web;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch10 {
	public static void main(String[] args)  {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vignesh vicky\\eclipse-workspace\\Seljava\\Driver\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://netbanking.hdfcbank.com/netbanking/");
	driver.manage().window().maximize();
	WebElement frame = driver.findElement(By.xpath("//frame[@name='login_page']"));
	driver.switchTo().frame(frame);
	WebElement username = driver.findElement(By.name("fldLoginUserId"));
	username.sendKeys("34567892",Keys.ENTER);
	WebElement password = driver.findElement(By.name("fldPassword"));
	password.sendKeys("25673457",Keys.ENTER);
	}
}
	
	
	
	
	
	