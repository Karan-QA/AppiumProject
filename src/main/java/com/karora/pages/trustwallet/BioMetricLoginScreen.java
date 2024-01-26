package com.karora.pages.trustwallet;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.karora.pages.AbstractPage;

public class BioMetricLoginScreen extends AbstractPage{

	@FindBy(xpath = "//android.widget.TextView[@text='Deny']")
	private WebElement denyButton;
	
	@FindBy(xpath = "")
	private WebElement confirmButton;
	
	
	public BioMetricLoginScreen(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean isAt() {
		// TODO Auto-generated method stub
		return true;
	}
	
	public void denyBiometricButton() {
		this.wait.until(ExpectedConditions.visibilityOf(this.denyButton));
        this.denyButton.click();
    }

}
