package org.selenium;

import java.awt.AWTException;
import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
	
public static void main(String[] args) throws InterruptedException, AWTException, IOException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\amars\\eclipse-workspace\\Selenium Task 01\\driver\\chromedriver.exe"
				+ "");
		
		WebDriver driver = new ChromeDriver();
		
	driver.get("https://www.amazon.com/");
	
	driver.manage().window().maximize();

	

//	WebElement btn = driver.findElement(By.xpath("//button[@onclick='alertbox()']"));
//	
//	btn.click();
//	
//	Alert a = driver.switchTo().alert();
//	
//	a.accept();
	
	
//	WebElement alert = driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']"));
//	
//	alert.click();
//	
//	WebElement btn = driver.findElement(By.xpath("//button[@onclick='confirmbox()']"));
//	
//	btn.click();
//	Alert a = driver.switchTo().alert();
//	
//	a.dismiss();
//	
//TakesScreenshot tk = (TakesScreenshot) driver;
//	
//	File src = tk.getScreenshotAs(OutputType.FILE);
//	
//	File des = new File("C:\\Users\\amars\\eclipse-workspace\\Selenium Task 01\\Picture\\pic2.png");
//	
//	FileUtils.copyFile(src, des);
//	
//	
//	String text = a.getText();
//	
//	System.out.println(text);
//	a.dismiss();
	
	
//	WebElement alrt = driver.findElement(By.xpath("//a[text()='Alert with Textbox ']"));
//	
//	alrt.click();
//	
//	WebElement btn = driver.findElement(By.xpath("//button[@onclick='promptbox()']"));
//	
//	btn.click();
//	
//	Alert a = driver.switchTo().alert();
//	
//	a.sendKeys("Greens");
//	a.accept();
	
	
	//class task to pull list 
	
	
	
	WebElement srch = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
	srch.sendKeys("iphone");
	
	Thread.sleep(2000);
	
	WebElement btn = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
	btn.click();
	
	List<WebElement> name = driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
	
	for (int i = 0; i < name.size(); i++) {
		
		WebElement eachname = name.get(i);
		System.out.println(eachname.getText());
		
	}
}
}
