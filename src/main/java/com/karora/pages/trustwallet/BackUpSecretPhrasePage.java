package com.karora.pages.trustwallet;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.karora.pages.AbstractPage;

public class BackUpSecretPhrasePage extends AbstractPage{

	@FindBy(xpath = "//android.widget.TextView[@text='SKIP']")
	private WebElement skipButton;
	
	@FindBy(xpath = "")
	private WebElement backUpManualButton;
	
	@FindBy(xpath = "//android.widget.TextView[@text='Back up to Google Drive']")
	private WebElement backUpGoogleDriveButton;
	
	public BackUpSecretPhrasePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean isAt() {
		// TODO Auto-generated method stub
		return true;
	}
	
	public void skipBackUp() {
		this.wait.until(ExpectedConditions.visibilityOf(this.skipButton));
        this.skipButton.click();
    }
	
	public void backUpUsingGoogleButtonClick()
	{
		this.wait.until(ExpectedConditions.visibilityOf(this.backUpGoogleDriveButton));
		this.backUpGoogleDriveButton.click();
	}

}
