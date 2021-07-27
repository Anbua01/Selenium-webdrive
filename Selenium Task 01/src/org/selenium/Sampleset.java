package org.selenium;



import java.awt.AWTException;
import java.awt.Desktop.Action;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.security.AllPermission;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.logging.NeedsLocalLogs;
import org.openqa.selenium.support.ui.Select;

public class Sampleset {
	
	public static void main(String[] args) throws InterruptedException, AWTException, IOException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\amars\\eclipse-workspace\\Selenium Task 01\\driver\\chromedriver.exe"
				+ "");
		
		WebDriver driver = new ChromeDriver();
		
	driver.get("https://www.w3schools.com/html/html_tables.asp");
	
	driver.manage().window().maximize();
	
//	WebElement txtemail = driver.findElement(By.id("email"));
//	WebElement txtpass = driver.findElement(By.id("pass"));
//	
//	WebElement logbtn = driver.findElement(By.name("login"));
//	
//	
//	txtemail.sendKeys("eickeystands@gmail.com");
//	txtpass.sendKeys("natasha93");
//	logbtn.click();
	
	
//	WebElement email = driver.findElement(By.xpath("//input[@type='text']"));
//	
//	WebElement pass = driver.findElement(By.xpath("//input[@id='pass']"));
//	
//	
//	email.sendKeys("Greens");
//	
//	pass.sendKeys("12345");
//	
//	
//	WebElement btn = driver.findElement(By.xpath("//button[@name='login']"));
//	
//	btn.click();
	
	
//	WebElement email = driver.findElement(By.id("email"));
//	
//	String attribute = email.getAttribute("aria-label");
//	
//	System.out.println(attribute);
//	
//	
//	WebElement sentence = driver.findElement(By.xpath("//h2[contains(text(),'connect')]"));
//	
//	
//	String text = sentence.getText();
//	
//	System.out.println(text);
//	
//	
//	WebElement createbtn = driver.findElement(By.xpath("//a[text()='Create New Account']"));
//	
//	String text2 = createbtn.getText();
//	
//	System.out.println(text2);
//	
//	createbtn.click();
	
//	
//	WebElement email = driver.findElement(By.id("email"));
//	
//	email.sendKeys("java");
//	
//	WebElement pass = driver.findElement(By.name("pass"));
//	
//	pass.sendKeys("123456");
//	
//	WebElement creatbtn = driver.findElement(By.xpath("//a[text()='Create New Account']"));
//	
//	creatbtn.click();
//	
//	Thread.sleep(2000);
//	
//	WebElement fname = driver.findElement(By.name("firstname"));
//	fname.sendKeys("Salman");
	
	//class25
	
	
//	WebElement course = driver.findElement(By.xpath("//a[text()='COURSES']"));
//	
//Actions a = new Actions(driver);
//
//a.moveToElement(course).perform();
//
//
//WebElement training = driver.findElement(By.xpath("//span[text()='Oracle Training']"));
//
//a.moveToElement(training).perform();
//
//WebElement dba = driver.findElement(By.xpath("//span[text()='Oracle DBA Training']"));
//
//dba.click();
	
	
//	WebElement src = driver.findElement(By.xpath("//a[text()=' 5000']"));
//	
//	WebElement sales = driver.findElement(By.xpath("//a[text()=' SALES ']"));
//	
//	WebElement bank = driver.findElement(By.xpath("//a[text()=' BANK ']"));
//	
//	WebElement debdes = driver.findElement(By.xpath("//li[@class='placeholder']"));
//	
//	
//	WebElement des = driver.findElement(By.xpath("//ol[@id='loan']"));
//	
//	WebElement des1 = driver.findElement(By.xpath("//ol[@id='amt7']"));
//	
//	WebElement dest = driver.findElement(By.xpath("//ol[@id='amt8']"));
//	
//	Actions a = new Actions(driver);
//	
//	
//	a.dragAndDrop(src, dest).perform();
//	
//	a.dragAndDrop(bank, debdes).perform();
//	
//	a.dragAndDrop(sales, des).perform();
//	a.dragAndDrop(src, des1).perform();
	
	
	
	//class26
//	WebElement email = driver.findElement(By.id("email"));
//	
//	Actions a = new Actions(driver);
//	
//	a.keyDown(email, Keys.SHIFT).sendKeys(email, "greens").keyUp(email, Keys.SHIFT).build().perform();
//	
//	a.doubleClick(email);
//	
//	a.contextClick(email);
//	
//	Robot r = new Robot();
//	
//	for (int i = 0; i < args.length; i++) {
//		
//		r.keyPress(KeyEvent.VK_DOWN);
//		r.keyRelease(KeyEvent.VK_DOWN);
//		
//	}
//	
//	r.keyPress(KeyEvent.VK_ENTER);
//	r.keyRelease(KeyEvent.VK_ENTER);
//	
//	
//	r.keyPress(KeyEvent.VK_TAB);
//	r.keyRelease(KeyEvent.VK_TAB);
//	
//	r.keyPress(KeyEvent.VK_CONTROL);
//	r.keyPress(KeyEvent.VK_PASTE);
//	r.keyRelease(KeyEvent.VK_PASTE);
//	
//r.keyRelease(KeyEvent.VK_CONTROL);
//
//
//WebElement logbtn = driver.findElement(By.name("login"));
//
//logbtn.click();
	
	
	//class27
	
	
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
	
	
	//class 28
	
//	WebElement email = driver.findElement(By.id("email"));
//	
//	JavascriptExecutor js = (JavascriptExecutor)driver;
//	
//	js.executeScript("arguments[0].setAttribute('Value','Greens')", email);
//	
//	Object obj = js.executeScript("return arguments[0].get Attribute('placeholder')", email);
//	
//	String s = (String)obj;
//
//	WebElement lognbtn = driver.findElement(By.name("login"));
//	
//	js.executeScript("arguments[0].Click()", lognbtn);
	
	//need to check
	
//	WebElement down = driver.findElement(By.xpath("//h3[@id='heading884']"));
//	
//	JavascriptExecutor js = (JavascriptExecutor) driver;
//	
//	js.executeScript("arguments[0].scrollIntoView('true')", down);
//	
//	Thread.sleep(2000);
//	
//	driver.findElement(By.xpath("//li[text()='Classes and Objects']"));
//	
//	
//	Thread.sleep(2000);
//	
//	WebElement up = driver.findElement(By.xpath("//div[@title='Courses']"));
//	
//	js.executeScript("arguments[0].scrollIntoView('false')", up);
	
	//class 29
	
	
//	TakesScreenshot tk = (TakesScreenshot) driver;
//	
//	File src = tk.getScreenshotAs(OutputType.FILE);
//	
//	File des = new File("C:\\Users\\amars\\eclipse-workspace\\Selenium Task 01\\Picture\\pic1.png");
//	
//	FileUtils.copyFile(src, des);
	
	
	//Class 30
	
//	driver.switchTo().frame("a077aa5e");
//	WebElement jmeter = driver.findElement(By.xpath("//img[@src='Jmeter720.png']"));
//jmeter.click();

	//class31
	
//	WebElement srch = driver.findElement(By.xpath("//input[@placeholder='Search products & brands']"));
//	srch.sendKeys("trimmer");
//	Thread.sleep(2000);
//	WebElement btn = driver.findElement(By.xpath("//span[@class='searchTextSpan']"));
//	btn.click();
//	
//	WebElement prd = driver.findElement(By.xpath("//p[@title='Philips BT1212/15 Beard Trimmer ( Green )']"));
//	prd.click();
//	
//	String parid = driver.getWindowHandle();
//	
//	Set<String> childid = driver.getWindowHandles();
//	
//	for (String eachwinid : childid) {
//		
//		if (!eachwinid.equals(parid)) {
//			driver.switchTo().window(eachwinid);
//			
//		}
//			
//	}
//	
//	driver.findElement(By.xpath("//span[text()='add to cart']")).click();
	
	//class32
	
//	WebElement friuts = driver.findElement(By.xpath("//select[@id='fruits']"));
//	
//	
//	
//	Select s = new Select(friuts);
//	
//	if (s.isMultiple()) {
//		
//		System.out.println("more option");
//		
//	} else {
//		
//		System.out.println("one option");
//
//	}
	
//	s.selectByValue("2");
//	s.selectByIndex(1);
//	s.selectByValue("orange");
//	s.selectByVisibleText("Grape");
//	
//	
//WebElement a = s.getFirstSelectedOption();
//System.out.println(a.getText());
//System.out.println(a.getAttribute("Value"));
//
//System.out.println("All option using Text");
//List<WebElement> alloptn = s.getOptions();
//for (WebElement option : alloptn) {
//	System.out.println(option.getText());
//	
//}
//
//int size = alloptn.size();
//System.out.println(size);
//
//s.deselectAll();
	
	//class33
	
//	WebElement table = driver.findElement(By.id("customers"));
//	List<WebElement> allrows = table.findElements(By.tagName("tr"));
	
//	int a = allrows.size();
//	System.out.println("row" +a);
//	
//	List<WebElement> alldata = table.findElements(By.tagName("td"));
//	int b = alldata.size();
//	System.out.println("data: " +b) ;
	
	
//	WebElement row = allrows.get(3);
//	List<WebElement> alldatas = row.findElements(By.tagName("td"));
//	WebElement data = alldatas.get(1);
//	System.out.println(data.getText());
	
//	for (int i = 0; i < allrows.size(); i++) {
//		
//		WebElement row = allrows.get(i);
//		List<WebElement> alldatas = row.findElements(By.tagName("td"));
//		
//		for (int j = 0; j < alldatas.size(); j++) {
//			
//			WebElement eachdata = alldatas.get(j);
//			
//			String name = eachdata.getText();
//			
//			System.out.println(name);
//		}
			
//			if (name.equals("Mexico")) {
//				
//				System.out.println("name " +name);
//				System.out.println("row" +i);
//				System.out.println("cell: " +j);
				
//			}
	
	//class35
	
	
			
		
	
	
	}

}
