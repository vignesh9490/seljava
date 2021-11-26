package org.web;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch11 {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vignesh vicky\\eclipse-workspace\\Seljava\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cricbuzz.com/cricket-series/3472/indian-premier-league-2021/points-table");
		driver.manage().window().maximize();
		WebElement table = driver.findElement(By.xpath("//table[@class='table cb-srs-pnts']"));
		List<WebElement> trows = table.findElements(By.tagName("tr"));
		int size = trows.size();
		System.out.println(size);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
