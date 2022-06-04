package com.SauceDemo.TestClasses;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.SauceDemo.POMClasses.LoginPagePOMClass;

public class TestBaseClass 
{
	WebDriver driver;

	@BeforeMethod
	public void setUp()
	{
		
	System.setProperty("webdriver.chrome.driver", "C:\\SeleniumChrome\\chromedriver.exe");
	driver = new ChromeDriver();
	
	System.out.println("Browser Open");
	
	driver.manage().window().maximize();
	driver.get("https://www.saucedemo.com/");
	
	System.out.println("URL Open");
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	LoginPagePOMClass lp = new LoginPagePOMClass(driver);
	lp.sendUsername();
	System.out.println("Enter the Username");
	lp.sendPassword();
	System.out.println("Enter the Password");
	lp.clickLoginButton();
	System.out.println("Click on LoginButton");
	
	}
	
	@AfterMethod
	public void tearDown() throws IOException
	{
	
	driver.quit();
	System.out.println("End of Program");
}
}
