package org.Helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {
	
	public static WebDriver driver;
	  public static  Select s;
	  
	  
	  public static void launchbrowser() {
		
		  WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();

	}
	  
	  public static void launchurl(String url) {
		driver.get(url);

	}
	  
	  
	  public static void maxwindow() {
		driver.manage().window().maximize();

	}
	  
	  public static void pagetitle() {
		String title = driver.getTitle();
		System.out.println(title);

	}
	  
	  public static void close() {
		driver.quit();

	}
	  
	  public static void pageurl() {
		String url = driver.getCurrentUrl();
		System.out.println(url);

	}
	  
	  public static String toGetATT(WebElement att) {
		String val = att.getAttribute("value");
		return val;

	}
	  
	  public static void snap(String pic) throws IOException {
		TakesScreenshot tk = (TakesScreenshot) driver;
		File src = tk.getScreenshotAs(OutputType.FILE);
		File des = new File("C:\\Users\\amars\\eclipse-workspace\\Cucumber\\src\\test\\resources\\Report\\Screenshot\\"+pic +".png");
		FileUtils.copyFile(src, des);

	}
	  
	  public static void filltextbox(WebElement element , String value) {
		  element.sendKeys(value);
		

	}
	  
	  public static void timewait(int time) {
		driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);

	}
	  
	  public static void click(WebElement ele) {
		ele.click();
	}
	  
	  public static void actn(WebElement path) {
		  Actions a = new Actions(driver);
		  a.moveToElement(path).perform();

	}
public static void Select(WebElement value,String str) {
		  
		   s = new Select(value);
		   s.selectByValue(str);
		  
	
}


	 
	 
}
	
	


