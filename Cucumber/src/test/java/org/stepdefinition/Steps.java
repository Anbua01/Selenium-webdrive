package org.stepdefinition;

import java.util.List;

import org.Helper.Baseclass;
import org.Helper.Pojofacebookpage1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Steps extends Baseclass {
	
         
	 Pojofacebookpage1 p;

	
	
	@Given("user has to be in the facebook")
	public void user_has_to_be_in_the_facebook() {
		
		launchurl("https://www.facebook.com/");
		
	}

	

	
		
	@When("user enter invalid username and password")
	public void user_enter_invalid_username_and_password(io.cucumber.datatable.DataTable d) {
	  List<List<String>> list = d.asLists();
	  List<String> list1 = list.get(1);
	  String username = list1.get(1);
	  String password = list1.get(3);
	   p=new Pojofacebookpage1();
	   filltextbox(p.getTxtemail(), username);
	   filltextbox(p.getTxtxpass(), password);
	    
	}

	@When("user click the login button")
	public void user_click_the_login_button() throws InterruptedException {
	   p=new Pojofacebookpage1();
	   click(p.getTxtlogin());
	   
	   Thread.sleep(3000);
	}

	@When("user click the login without passing value")
	public void user_click_the_login_without_passing_value() {
		p=new Pojofacebookpage1();
		   click(p.getTxtlogin());
		   
		   
		   
	}

}
