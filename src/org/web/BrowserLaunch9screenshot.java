package org.web;
// Multiple screen shot
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch9screenshot {
	static WebDriver driver;
	public static void screenshot(String fb) throws IOException {
		
		 TakesScreenshot tk=(TakesScreenshot)driver;
		 File source = tk.getScreenshotAs(OutputType.FILE);
		File dest=new File("D:\\screen\\"+fb+".png");
		 FileUtils.copyFile(source, dest);
		
	}
	
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vignesh vicky\\eclipse-workspace\\Seljava\\Driver\\chromedriver.exe");
		 driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
        Thread.sleep(50);
		screenshot("launch");
		WebElement txtusername = driver.findElement(By.id("email"));
		txtusername.sendKeys("vignesh.vicky378@gmail.com");
		Thread.sleep(30);
		screenshot("username");
		WebElement password = driver.findElement(By.id("pass"));
	    password.sendKeys("vignesh9490");
	    Thread.sleep(30);
	    screenshot("password");
	 	WebElement btnlogin = driver.findElement(By.xpath("//button[@name='login']"));
		btnlogin.click();
		Thread.sleep(30);
		screenshot("login");
		
	
		}
}
