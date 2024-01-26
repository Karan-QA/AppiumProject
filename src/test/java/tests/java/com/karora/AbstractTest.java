package tests.java.com.karora;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class AbstractTest{
	public AppiumDriver<MobileElement> driver;
	@BeforeTest
	public void setup() {
		try {
		DesiredCapabilities caps = new DesiredCapabilities();
		
		caps.setCapability("deviceName","Galaxy A71");
		caps.setCapability("udid","RZ8N70LZ9LJ");
		caps.setCapability("platformName","ANDROID");
		caps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 200);
		caps.setCapability("platformVersion", "12");
		caps.setCapability("appPackage", "com.wallet.crypto.trustapp");
		caps.setCapability("appActivity", "com.wallet.crypto.trustapp.ui.app.AppActivity");
		
		
			URL url= new URL("http://127.0.0.1:4723/wd/hub");
			driver = new AppiumDriver<MobileElement>(url, caps);
			System.out.println("Application started");
		} catch (Exception exp) {
			// TODO Auto-generated catch block
			System.out.println("Cause is ---> "+ exp.getCause());
			System.out.println("Message is ---> "+ exp.getMessage());
			exp.printStackTrace();
		}
		
	}
	
	
	
	
	@AfterTest
	public void teardown()
	{
		driver.quit();
	}

}
