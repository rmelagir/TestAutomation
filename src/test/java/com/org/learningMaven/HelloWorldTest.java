package com.org.learningMaven;

import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HelloWorldTest {
	public static WebDriver driver;
	@Test
	public void test()
	{
		System.out.println("welcom");
		 if (driver == null)
	        {   
			 System.out.println("I am here");
			 
			// System.out.println("FF is selected");
			// System.setProperty("webdriver.gecko.driver","D:\\softwares\\FFDRiver\\geckodriver.exe");
	        	System.setProperty("webdriver.chrome.driver", "D:\\softwares\\chromedriver 72\\chromedriver.exe");
	        	ChromeOptions chromeOptions= new ChromeOptions();
	        	chromeOptions.setBinary("C:\\Users\\rmelagir\\AppData\\Local\\Google\\Chrome\\Application\\chrome.exe");
	        	
	        	driver = new ChromeDriver(chromeOptions);
			// DesiredCapabilities cap = DesiredCapabilities.firefox();
		   //     cap.setCapability("marionette", true);
		   //     cap.setBrowserName("firefox");
			// driver = new FirefoxDriver();
	        //	driver.manage().window().maximize();
	     		driver.get("http://10.10.11.191:8055/login");
	     		driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);                       
	        }
	        driver.findElement(By.id("username")).sendKeys("ladmin");
		    driver.findElement(By.id("password")).sendKeys("ladmin");
		    driver.findElement(By.xpath("//input[@value='LOGIN']")).click();
		    assertEquals("e-PHAB", driver.getTitle());
		   
	}

}
