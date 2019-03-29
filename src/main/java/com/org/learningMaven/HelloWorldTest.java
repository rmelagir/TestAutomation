package com.org.learningMaven;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class HelloWorldTest {
	public static WebDriver driver;
	@Test
	public void test()
	{
		System.out.println("welcom");
		 if (driver == null)
	        {   
			 System.out.println("I am here");
	        	System.setProperty("webdriver.chrome.driver", "D:\\softwares\\chromedriver_win32\\chromedriver.exe");
				driver = new ChromeDriver();
	        	driver.manage().window().maximize();
	     		driver.get("http://10.10.11.191:8055/login");
	     		driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);                       
	        }
	        driver.findElement(By.id("username")).sendKeys("ladmin");
		    driver.findElement(By.id("password")).sendKeys("ladmin");
		    driver.findElement(By.xpath("//input[@value='LOGIN']")).click();
		    assertEquals("e-PHAB", driver.getTitle());
		   
	}

}
