package com.qdPM.TestCases;

import org.testng.annotations.Test;

import com.qdPM.PageClass.LoginPage;
import com.qdPM.TestBase.BaseClass;
import com.qdPM.reusableComponents.PropertiesOperations;

public class LoginPageTest extends BaseClass{
	
	LoginPage loginpage=new LoginPage();
	
	@Test
	public void administatorLoginTest() {
		loginpage.login(PropertiesOperations.getPropertyValueByKey("username"),
				PropertiesOperations.getPropertyValueByKey("password"));
		
	}
	
	@Test
	public void administatorLoginTest2() {
		loginpage.login(PropertiesOperations.getPropertyValueByKey("username"),
				PropertiesOperations.getPropertyValueByKey("password"));
		
	}
	
	
	
	
	
	
	
	

}
