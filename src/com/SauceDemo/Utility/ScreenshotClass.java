 package com.SauceDemo.Utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotClass 
 {
	public static void takeScreenshot(WebDriver driver) throws IOException
	{
	 
		
	 TakesScreenshot ts = (TakesScreenshot)driver;
	 File sourceFile = ts.getScreenshotAs(OutputType.FILE);
	 
	 File destFile = new File ("C:\\Users\\ImmorTaL\\Desktop\\Screenshot\\Login.jpg");
	 
	 FileHandler.copy(sourceFile, destFile);
	 
	 System.out.println("Screenshot is Taken");
	}
 }
