package com.qdPM.PageClass;

import org.openqa.selenium.By;
import org.testng.Assert;

import com.qdPM.Factories.DriverFactory;
import com.qdPM.TestBase.BaseClass;

public class HomePage extends BaseClass{
	
	
	By sidebarMenu_Dashboard = By.xpath("//ul[@class='page-sidebar-menu']//i/following-sibling::span[text()='Dashboard']");

	//click on menu bar - by passing name of menu
	public void clickOnSideMenu(String menu) {
		String MenuXpath = "//ul[@class='page-sidebar-menu']//i/following-sibling::span[text()='"+menu+"']";
		DriverFactory.getInstance().getDriver().findElement(By.xpath(MenuXpath)).click();
	}

	//click on sub menu bar - by passing name of menu
	public void clickOnSideSubMenu(String menu, String submenu) {
		String MenuXpath = "//ul[@class='page-sidebar-menu']//i/following-sibling::span[text()='"+menu+"']";
		DriverFactory.getInstance().getDriver().findElement(By.xpath(MenuXpath)).click();
		String submenuXpath="//ul[@class='page-sidebar-menu']//i/following-sibling::span[text()='"+menu+"']/ancestor::a/following-sibling::ul//span[text()='"+submenu+"']";
		DriverFactory.getInstance().getDriver().findElement(By.xpath(submenuXpath)).click();
	}

	public void checkIfDashBoardPageIsOpened() {
		Assert.assertTrue(isElementPresent_custom(DriverFactory.getInstance().getDriver().findElement(sidebarMenu_Dashboard), "DashBoardMenu"));
	}
	
	
	
	
	
	
	
	
	

}
