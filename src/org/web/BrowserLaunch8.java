package org.web;
import java.util.Iterator;
//WebTable
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//WebTable
public class BrowserLaunch8 {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vignesh vicky\\eclipse-workspace\\Seljava\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
		driver.manage().window().maximize();
		List<WebElement> tRows = driver.findElements(By.tagName("tr"));
		int size = tRows.size();
		System.out.println(size);
		List<WebElement> tData = driver.findElements(By.tagName("td"));
		int size2 = tData.size();
		System.out.println(size2);
		List<WebElement> th = driver.findElements(By.tagName("th"));
		int size3 = th.size();
		System.out.println(size3);
		List<WebElement> thcol = driver.findElements(By.xpath("//th[text()='Country']"));
		int size4 = thcol.size();
		System.out.println(size4);
	
		for (WebElement x: tRows) {
			String text = x.getText();
			System.out.println(text);
		}
		
		for (WebElement y : tData) {
			String text2 = y.getText();
			System.out.println(text2);
			
		}
		for (WebElement z : th) {
			String text3 = z.getText();
			System.out.println(text3);
		}
		
		for (int i = 0; i < tRows.size(); i=(i+2))	 {
			System.out.println(i);
		}
		
	}

}
