package org.fw.day;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day1 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\eclipse-workspace\\FrameWorks\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://netbanking.hdfcbank.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		List<WebElement> framecount = driver.findElements(By.tagName("frame"));
		System.out.println(framecount.size());
		driver.switchTo().frame("login_page");
	    WebElement txtlogin = driver.findElement(By.name("fldLoginUserId"));
	    txtlogin.sendKeys("Nis7076");
	     
	    
	}

}
