package com.qdPM.TestBase;

import java.time.Duration;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.qdPM.Factories.BrowserFactory;
import com.qdPM.Factories.DriverFactory;
import com.qdPM.ReportUtility.ActionEngine;
import com.qdPM.reusableComponents.PropertiesOperations;

public class BaseClass extends ActionEngine {
	
	BrowserFactory bf = new BrowserFactory();

	@BeforeMethod
	public void LaunchApplication() throws Exception {
		String browser = PropertiesOperations.getPropertyValueByKey("browser");
		String url = 	PropertiesOperations.getPropertyValueByKey("url");

		DriverFactory.getInstance().setDriver(bf.createBrowserInstance(browser));

		DriverFactory.getInstance().getDriver().manage().window().maximize();
		DriverFactory.getInstance().getDriver().manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		DriverFactory.getInstance().getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		DriverFactory.getInstance().getDriver().navigate().to(url);

	}

	@AfterMethod
	public void tearDown() {
		DriverFactory.getInstance().closeBrowser();
	}
	
	
	
	
	
	
	

}
