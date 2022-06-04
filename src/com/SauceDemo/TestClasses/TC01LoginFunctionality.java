package com.SauceDemo.TestClasses;

import java.io.IOException;
import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.SauceDemo.POMClasses.HomePagePOMClass;
import com.SauceDemo.POMClasses.LoginPagePOMClass;
import com.SauceDemo.Utility.ScreenshotClass;

public class TC01LoginFunctionality extends TestBaseClass
{
	
	@Test
	public void loginFunctionalityTest() throws IOException
	{
		
	String expectedTitle = "Swag Labs";
	String actualTitle = driver.getTitle();        
	                                               //Test  change test cases
	                                               
//	if(expectedTitle.equals(actualTitle))
//	{
//		System.out.println("Test Case is Passed");
//	}
//	else
//	{
//		System.out.println("Test Case is Failed");
//	}
	
	// Hard Assert
	Assert.assertEquals(actualTitle, expectedTitle);
	
	
	
	//take Screenshot
		ScreenshotClass.takeScreenshot(driver);
		
		HomePagePOMClass hp = new HomePagePOMClass(driver);
		hp.clickMenuButton();
		System.out.println("Click on MenuButton");
		hp.clickLogoutButton();
		System.out.println("Click on LogoutButton");
		
	}
	
	
}
