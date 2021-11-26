package org.web;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch1 {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vignesh vicky\\eclipse-workspace\\Seljava\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.greenstech.in/selenium-course-content.html");
		 WebElement txt = driver.findElement(By.xpath("//a[@id='overview-tab']"));
		txt.click();
		
		Thread.sleep(3000);
		WebElement txtpara = driver.findElement(By.xpath("(//p[contains(text(),'Greens ')])[1]"));
		String text = txtpara.getText();
		System.out.println(text);
	
		
	}

}
