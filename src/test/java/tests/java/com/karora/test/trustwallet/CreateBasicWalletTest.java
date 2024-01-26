package tests.java.com.karora.test.trustwallet;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.karora.pages.trustwallet.BackUpSecretPhrasePage;
import com.karora.pages.trustwallet.BioMetricLoginScreen;
import com.karora.pages.trustwallet.CreateAddWalletPage;
import com.karora.pages.trustwallet.CreatePasscodePage;
import com.karora.pages.trustwallet.HomePage;
import com.karora.pages.trustwallet.LandingPage;
import com.karora.pages.trustwallet.WelcomeAboardPage;

import tests.java.com.karora.AbstractTest;

public class CreateBasicWalletTest extends AbstractTest {

	@Test
	public void getStarted() {
		LandingPage landPage = new LandingPage(driver);
		landPage.getStarted();
	}

	@Test(dependsOnMethods = "getStarted")
	public void selectCreateNewWallet() {
		CreateAddWalletPage updateWallet = new CreateAddWalletPage(driver);
		updateWallet.createWallet();
	}

	@Test(dependsOnMethods = "selectCreateNewWallet")
	public void backUpSecretPhrase() {
		BackUpSecretPhrasePage backUp = new BackUpSecretPhrasePage(driver);
		backUp.skipBackUp();
	}

	@Test(dependsOnMethods = "backUpSecretPhrase")
	public void createPasscode() {
		CreatePasscodePage enterPasscode = new CreatePasscodePage(driver);
		enterPasscode.clickDigit();
	}

	@Test(dependsOnMethods = "createPasscode")
	public void reEnterPasscode() {
		CreatePasscodePage enterPasscode = new CreatePasscodePage(driver);
		enterPasscode.clickDigit();
	}

	@Test(dependsOnMethods = "reEnterPasscode")
	public void denyBiometric() {
		BioMetricLoginScreen bioMetricPopUp = new BioMetricLoginScreen(driver);
		bioMetricPopUp.denyBiometricButton();
	}

	@Test(dependsOnMethods = "denyBiometric")
	public void startUsingTrustwallet() {
		WelcomeAboardPage welcomePopUp = new WelcomeAboardPage(driver);
		welcomePopUp.getStartedButton();
	}

	@Test(dependsOnMethods = "startUsingTrustwallet")
	public void assertWalletCreated() {
		HomePage homePg = new HomePage(driver);
		homePg.returnWalletDropdown();

	}
}
