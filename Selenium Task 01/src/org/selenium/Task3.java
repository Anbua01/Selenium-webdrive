package org.selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Task3 {

public static void main(String[] args) throws IOException, AWTException, InterruptedException  {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\amars\\eclipse-workspace\\Selenium Task 01\\driver\\chromedriver.exe"
				+ "");
		
		WebDriver driver = new ChromeDriver();
		
//		ChromeOptions c = new ChromeOptions();
//		c.addArguments("--disable-notifcation");
		
	driver.get("https://www.facebook.com/");
	
	driver.manage().window().maximize();
	
	
	// Task3 q01
//	WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
//	
//	WebElement button = driver.findElement(By.id("nav-search-submit-button"));
//	
//	search.sendKeys("iphone");
//	
//	button.click();
	
	//task3 q02
	
	
//	WebElement login = driver.findElement(By.xpath("//input[@id='email']"));
//	
//	WebElement pswd = driver.findElement(By.xpath("//input[@id='pass']"));
//	
//	WebElement btn = driver.findElement(By.xpath("//button[@name='login']"));
//	
//	login.sendKeys("greens@gmail.com");
//	pswd.sendKeys("qwerty123");
//	btn.click();
	
	
	//task03 q03
	
//	WebElement fname = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
//	WebElement lname = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
//	
//	WebElement address = driver.findElement(By.xpath("//textarea[@ng-model='Adress']"));
//	
//	
//	WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
//	
//	WebElement pno = driver.findElement(By.xpath("//input[@type='tel']"));
//	
//	WebElement male = driver.findElement(By.xpath("//input[@type='radio']"));
//	WebElement cricket = driver.findElement(By.xpath("//input[@id='checkbox1']"));
//	
//	WebElement lang = driver.findElement(By.xpath("//div[@id='msdd']"));
//	WebElement skill = driver.findElement(By.xpath("//option[@value='C']"));
	
	
	
//	fname.sendKeys("Amarnath");
//	lname.sendKeys("Anbu");
//	address.sendKeys("Auckland 1024");
//	pno.sendKeys("12345678");
//	male.click();
//	cricket.click();
//	lang.sendKeys("English");
	
//	WebElement job = driver.findElement(By.xpath("//h2[@class='mb-0']"));
//	job.click();
//	
//	TakesScreenshot tk = (TakesScreenshot) driver;
//	
//	File src = tk.getScreenshotAs(OutputType.FILE);
//	
//	File des = new File("C:\\\\Users\\\\amars\\\\eclipse-workspace\\\\Selenium Task 01\\\\Picture\\\\pic3.png");
//	
//	FileUtils.copyFile(src, des);
	
	
//	WebElement txt = driver.findElement(By.xpath("//div[@class='col-md-3 short-desc-with-logo widget widget_text']"));
//	System.out.println(txt.getText());
	
	
//	TakesScreenshot tk = (TakesScreenshot) driver;
//	
//	File src = tk.getScreenshotAs(OutputType.FILE);
//	
//	File des = new File("C:\\Users\\amars\\eclipse-workspace\\Selenium Task 01\\Picture\\pic1.png");
//	
//	FileUtils.copyFile(src, des);
	
	
	WebElement email = driver.findElement(By.id("email"));
	WebElement pswd = driver.findElement(By.id("pass"));
	email.sendKeys("amarstands@gmail.com");
	pswd.sendKeys("natasha93");
	
	WebElement btn = driver.findElement(By.xpath("//button[@name='login']"));
	btn.click();
	
	Thread.sleep(4000);
	
//	Alert a = driver.switchTo().alert();
//	String t = a.getText();
//	System.out.println(t);
//	a.allow();
	
	Robot r = new Robot();
	r.keyPress(KeyEvent.VK_TAB);
	r.keyRelease(KeyEvent.VK_TAB);
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	
	
	WebElement acct = driver.findElement(By.xpath("//div[@aria-label='Account']"));
	
	acct.click();
	
	
	WebElement lgout = driver.findElement(By.xpath("//span[text()='Log Out']"));
	lgout.click();
	
	
	
	
}
}
