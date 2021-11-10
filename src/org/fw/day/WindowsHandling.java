package org.fw.day;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandling {
	
	

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\eclipse-workspace\\FrameWorks\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	//	List<WebElement> framecount = driver.findElements(By.tagName("frame"));
		//System.out.println(framecount.size());
		WebElement txtSearch = driver.findElement(By.id("twotabsearchtextbox"));
		txtSearch.sendKeys("iphone",Keys.ENTER);
		WebElement clickiphone = driver.findElement(By.xpath("//span[text()='Apple iPhone 13 (256GB) - Pink']"));
		clickiphone.click();
		//WebElement addcrt = driver.findElement(By.xpath("//input[@id='add-to-cart-button']"));
		//addcrt.click();
		String prarntWindow = driver.getWindowHandle();
		System.out.println(prarntWindow);
		Set<String> noofwindow = driver.getWindowHandles();
		System.out.println(noofwindow);
		for (String string : noofwindow) {
		  if (!(prarntWindow.equals(string))) {
			  driver.switchTo().window(string);
			
			}
		
		  }
		  WebElement addcrt = driver.findElement(By.xpath("//input[@id='add-to-cart-button']"));
			addcrt.click();
		
		
   }
	
}