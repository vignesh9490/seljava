package org.web;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch6 {
public static void main(String[] args) throws AWTException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\vignesh vicky\\eclipse-workspace\\Seljava\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://adactinhotelapp.com/");
	
	
	Robot robot=new Robot();
	robot.keyPress(KeyEvent.VK_TAB);
	robot.keyRelease(KeyEvent.VK_TAB);
	robot.keyPress(KeyEvent.VK_TAB);
	robot.keyRelease(KeyEvent.VK_TAB);
	robot.keyPress(KeyEvent.VK_TAB);
	robot.keyRelease(KeyEvent.VK_TAB);
	robot.keyPress(KeyEvent.VK_V);
	robot.keyRelease(KeyEvent.VK_V);
	robot.keyPress(KeyEvent.VK_I);
	robot.keyRelease(KeyEvent.VK_I);
	robot.keyPress(KeyEvent.VK_G);
	robot.keyRelease(KeyEvent.VK_G);
	robot.keyPress(KeyEvent.VK_N);
	robot.keyRelease(KeyEvent.VK_N);
	robot.keyPress(KeyEvent.VK_E);
	robot.keyRelease(KeyEvent.VK_E);
	robot.keyPress(KeyEvent.VK_S);
	robot.keyRelease(KeyEvent.VK_S);
	robot.keyPress(KeyEvent.VK_H);
	robot.keyRelease(KeyEvent.VK_H);
	robot.keyPress(KeyEvent.VK_3);
	robot.keyRelease(KeyEvent.VK_3);
	robot.keyPress(KeyEvent.VK_7);
	robot.keyRelease(KeyEvent.VK_7);
	robot.keyPress(KeyEvent.VK_8);
	robot.keyRelease(KeyEvent.VK_8);
	robot.keyPress(KeyEvent.VK_TAB);
	robot.keyRelease(KeyEvent.VK_TAB);
	robot.keyPress(KeyEvent.VK_V);
	robot.keyRelease(KeyEvent.VK_V);
	robot.keyPress(KeyEvent.VK_I);
	robot.keyRelease(KeyEvent.VK_I);
	robot.keyPress(KeyEvent.VK_G);
	robot.keyRelease(KeyEvent.VK_G);
	robot.keyPress(KeyEvent.VK_N);
	robot.keyRelease(KeyEvent.VK_N);
	robot.keyPress(KeyEvent.VK_E);
	robot.keyRelease(KeyEvent.VK_E);
	robot.keyPress(KeyEvent.VK_S);
	robot.keyRelease(KeyEvent.VK_S);
	robot.keyPress(KeyEvent.VK_H);
	robot.keyRelease(KeyEvent.VK_H);
	robot.keyPress(KeyEvent.VK_1);
	robot.keyRelease(KeyEvent.VK_1);
	robot.keyPress(KeyEvent.VK_2);
	robot.keyRelease(KeyEvent.VK_2);
	robot.keyPress(KeyEvent.VK_3);
	robot.keyRelease(KeyEvent.VK_3);
	robot.keyPress(KeyEvent.VK_TAB);
	robot.keyRelease(KeyEvent.VK_TAB);
	
	robot.keyPress(KeyEvent.VK_TAB);
	robot.keyRelease(KeyEvent.VK_TAB);
	robot.keyPress(KeyEvent.VK_ENTER);
	robot.keyRelease(KeyEvent.VK_ENTER);
	
	
	
	
	
	
	
	
	
	
}
}
