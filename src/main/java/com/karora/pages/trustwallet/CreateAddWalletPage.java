package com.karora.pages.trustwallet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.karora.pages.AbstractPage;

public class CreateAddWalletPage extends AbstractPage{
	
	@FindBy(xpath = "//android.widget.TextView[@text='Create new wallet']")
	private WebElement createNewWallet;
	
	@FindBy(xpath = "//android.widget.TextView[@text='Add existing wallet']")
	private WebElement addExistingWallet;

	public CreateAddWalletPage(WebDriver driver) {
		super(driver);
	}
	

	@Override
	public boolean isAt() {
//		this.wait.until(ExpectedConditions.visibilityOf(this.createNewWallet));
//		return this.createNewWallet.isDisplayed();
		return true;
	}
	
	public void createWallet() {
		this.wait.until(ExpectedConditions.visibilityOf(this.createNewWallet));
        this.createNewWallet.click();
    }

}
