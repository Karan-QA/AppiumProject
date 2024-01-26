package com.karora.pages.trustwallet;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.karora.pages.AbstractPage;

public class CreatePasscodePage extends AbstractPage {

	@FindBy(xpath = "//android.widget.TextView[@text='1']")
	private WebElement value1;

	public CreatePasscodePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean isAt() {
		// TODO Auto-generated method stub
		return true;
	}

	public void clickDigit() {
		this.wait.until(ExpectedConditions.visibilityOf(this.value1));
		for (int count = 1; count < 7; count++) {
			this.value1.click();
		}
	}

}
