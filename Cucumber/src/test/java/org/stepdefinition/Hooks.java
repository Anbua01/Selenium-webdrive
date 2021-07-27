package org.stepdefinition;

import java.io.IOException;

import org.Helper.Baseclass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends Baseclass{
	

	@Before
	public void beforescenario() {
		System.out.println("scenario start");
		launchbrowser();
		maxwindow();

	}
	
	@After
	public void afterscenario(Scenario s) throws IOException {
		
		if (s.isFailed()) {
			
			TakesScreenshot t = (TakesScreenshot)driver;
			byte[] sc = t.getScreenshotAs(OutputType.BYTES);
			s.embed(sc, "image/png");
			
		}
		
//		String name = s.getName();
//		snap(name);
		close();
		System.out.println("scenario close");
	}
}
