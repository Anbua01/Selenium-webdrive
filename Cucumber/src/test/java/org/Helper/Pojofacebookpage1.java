package org.Helper;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pojofacebookpage1 extends Baseclass {
	
	public Pojofacebookpage1() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="email")
	private WebElement txtemail;
	
	@FindBy(id="pass")
	private WebElement txtxpass;
	
	@FindBy(name="login")
	private WebElement txtlogin;

	public WebElement getTxtemail() {
		return txtemail;
	}

	public WebElement getTxtxpass() {
		return txtxpass;
	}

	public WebElement getTxtlogin() {
		return txtlogin;
	}
	

}
