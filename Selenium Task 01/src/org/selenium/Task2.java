package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {

public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\amars\\eclipse-workspace\\Selenium Task 01\\driver\\chromedriver.exe"
				+ "");
		
		WebDriver driver = new ChromeDriver();
		
	driver.get("http://adactinhotelapp.com/ ");
	
	driver.manage().window().maximize();
//	
//	WebElement txtemail = driver.findElement(By.id("email"));
//	WebElement txtpass = driver.findElement(By.id("pass"));
//	
//	WebElement logbtn = driver.findElement(By.name("login"));
//	
//	
//	txtemail.sendKeys("Greens");
//	txtpass.sendKeys("newzealand");
//	logbtn.click();
	
	
	//task02 q02
//	WebElement from = driver.findElement(By.xpath("//input[@id='src']"));
//	WebElement to = driver.findElement(By.xpath("//input[@id='dest']"));
//	
//	from.sendKeys("Chennai");
//	to.sendKeys("Trichy");
	
	//task02 q03
	
//	WebElement enter = driver.findElement(By.xpath("//input[@name='q']"));
//	
//	enter.sendKeys("greens");
	
	
	//task02 q04 right click now allowed
	
	
	//task02 q05 need to beclarified
	

	
//	WebElement cno = driver.findElement(By.xpath("//input[@name='fldLoginUserId']"));
	
//	WebElement cnt = driver.findElement(By.xpath("//img[@alt='continue']"));
//	
//	cno.sendKeys("123456789");
//	
//	cnt.click();
	
	
				//task02 q06
	
	
//	WebElement search = driver.findElement(By.xpath("//input[@type='text']"));
//	
//	search.sendKeys("chennai");
	
	
	//task02 q07
	
//	WebElement search = driver.findElement(By.xpath("//input[@type='text']"));
//	
//	WebElement cont = driver.findElement(By.xpath("//button[@id='checkUser']"));
//	
//	search.sendKeys("xxx@gmail.com");
//	
//	cont.click();
	
	
	//task02 q08
//	WebElement login = driver.findElement(By.xpath("//input[@name='username']"));
//	
//	WebElement pswd = driver.findElement(By.xpath("//input[@name='password']"));
//	
////	WebElement logn = driver.findElement(By.xpath("//div[text()='Log In']"));
//	
//	
//	login.sendKeys("aaa@gmail.com");
//	pswd.sendKeys("asdfg123");
//	
	
//	task02 q10
	
	
	
	WebElement login = driver.findElement(By.xpath("//input[@name='username']"));
	
	WebElement pswd = driver.findElement(By.xpath("//input[@name='password']"));
	
	WebElement log = driver.findElement(By.xpath("//input[@id='login']"));
	
	
	login.sendKeys("asdf");
	
	pswd.sendKeys("trewq");
	
	log.click();
	
	
	
	
	
	
	
	
	
}
}
