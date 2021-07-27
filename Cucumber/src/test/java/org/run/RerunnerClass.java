package org.run;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="@src\\test\\resources\\Failed\\Amar.txt",  glue= {"org.stepdefinition"},dryRun=false,
monochrome=false)


public class RerunnerClass {

}
