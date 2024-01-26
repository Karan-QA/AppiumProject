package com.karora.pages.trustwallet;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.karora.pages.AbstractPage;

public class WelcomeAboardPage extends AbstractPage {

	@FindBy(xpath = "//android.widget.TextView[@text='Start using Trust Wallet']")
	private WebElement startUsingButton;

	public WelcomeAboardPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean isAt() {
		// TODO Auto-generated method stub
		return true;
	}

	public void getStartedButton() {
		this.startUsingButton.click();
	}

}
