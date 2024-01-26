package com.karora.pages.trustwallet;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.karora.pages.AbstractPage;

public class LandingPage extends AbstractPage {

	public LandingPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(className = "android.widget.Button")
	private WebElement getStartedButton;

	@Override
	public boolean isAt() {
//		this.wait.until(ExpectedConditions.visibilityOf(this.getStartedButton));
//		return this.getStartedButton.isDisplayed();
		return true;
	}

	public void getStarted() {
		this.getStartedButton.click();
	}

}
