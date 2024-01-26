package com.karora.pages.trustwallet;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.karora.pages.AbstractPage;

public class HomePage extends AbstractPage {

	@FindBy(xpath = "//android.widget.TextView['Main Wallet 1']")
	private WebElement walletCreatedDropdown;

	public HomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean isAt() {
		// TODO Auto-generated method stub
		return true;
	}

	public Boolean returnWalletDropdown() {
		return this.walletCreatedDropdown.isDisplayed();

	}

}
