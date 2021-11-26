package org.web;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch {
	
	

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vignesh vicky\\eclipse-workspace\\Seljava\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
	    
	   	    
	  WebElement txt = driver.findElement(By.xpath("//a[contains(text(),'Conditions of Use & Sale')]"));
	  
	 
	  
	   String text = txt.getText();
	   
	   System.out.println(text);
	}

}
