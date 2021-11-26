package org.web;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BrowserLaunch7 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\vignesh vicky\\eclipse-workspace\\Seljava\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://demo.automationtesting.in/Alerts.html");
	
	Actions actions=new Actions(driver);
	
	WebElement btnclk = driver.findElement(By.xpath("//a[@href='#Textbox']"));
	btnclk.click();
	WebElement btnclk2 = driver.findElement(By.xpath("//button[@onclick='promptbox()']"));
	btnclk2.click();
	Alert al=driver.switchTo().alert();
	al.sendKeys("VigneshKumar");
	al.accept();
	WebElement txt = driver.findElement(By.id("demo1"));
	String text = txt.getText();
	System.out.println(text);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
