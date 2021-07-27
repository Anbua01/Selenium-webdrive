package org.run;

import org.Helper.JvmClass;
import org.apache.velocity.runtime.parser.JJTParserState;
import org.junit.AfterClass;
import org.junit.runner.RunWith;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\Feature\\login.feature",  glue= {"org.stepdefinition"},dryRun=false,
monochrome=false , plugin= {"pretty","html:src\\test\\resources\\Report", "json:src\\test\\resources\\Report\\output.json",
		"junit:src\\test\\resources\\Report\\fb.xml","rerun:src\\test\\resources\\Failed\\Amar.txt"})
public class Runner {
	@AfterClass
	public static void jvmReport() {  
	JvmClass.generateJvmReport(System.getProperty("user.dir")+"\\src\\test\\resources\\Report\\output.json");

	}
	

}
//plugin= {"pretty","html:src\\test\\resources\\Report", "json:src\\test\\resources\\Report\\output.json",
//"junit:src\\test\\resources\\Report\\fb.xml"})
