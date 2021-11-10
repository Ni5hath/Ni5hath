package org.fw.day;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleWebTable {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\eclipse-workspace\\FrameWorks\\Driver\\chromedriver.exe");
		//web table selecting alternately
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		WebElement table = driver.findElement(By.xpath("//table[@id='customers']"));
		List<WebElement> trrow = table.findElements(By.tagName("tr"));
		for (int i = 0; i <trrow.size(); i=i+2) {

			WebElement text = trrow.get(i);
			String text2 = text.getText();
			System.out.println(text2);

		}

	}
}
//web table selecting colume vise
driver.get("https://www.w3schools.com/html/html_tables.asp");
driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
driver.manage().window().maximize();
WebElement table = driver.findElement(By.xpath("//table[@id='customers']"));
List<WebElement> trrow = table.findElements(By.tagName("td"));
for (int i = 0; i <trrow.size(); i++) {

	WebElement text = trrow.get(i);
	String text2 = text.getText();
	System.out.println(text2);
