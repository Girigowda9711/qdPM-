package com.qdPM.TestCases;

import org.testng.annotations.Test;

import com.qdPM.PageClass.HomePage;
import com.qdPM.PageClass.LoginPage;
import com.qdPM.PageClass.TaskPage;
import com.qdPM.reusableComponents.PropertiesOperations;

public class HomePageTest {
	
	LoginPage loginpage=new LoginPage();
	HomePage homepage=new HomePage();
	TaskPage taskpage=new TaskPage();
	
	@Test
	public void TestCase1() {
		//Login to application with valid username and password
		loginpage.login(PropertiesOperations.getPropertyValueByKey("username"),
				PropertiesOperations.getPropertyValueByKey("password"));
		
		//check the dashboard is displayed in homepage 
		homepage.checkIfDashBoardPageIsOpened();
		homepage.clickOnSideSubMenu("Tasks","Add Task");
		System.out.println("this line should be removed after push to git");
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
