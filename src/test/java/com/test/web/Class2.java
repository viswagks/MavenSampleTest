package com.test.web;
import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.bcel.classfile.Field;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Class2
{
	WebDriver driver;
	
	@BeforeTest
	public void setUp()
	{
		//	ChromeOptions co = new ChromeOptions().setBinary("C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe");
		System.setProperty("webdriver.chrome.driver", "C:/Users/91897/Documents/Softwares/Techincal/Selenium/drivers/chromedriver.exe");
//		driver = new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
//		driver.manage().timeouts().pageLoadTimeout(5000, TimeUnit.MILLISECONDS);
	}
	
	@DataProvider(name="datap")
	public String[][] dat()
	{
		String[][] arr = {{"11", "12"}, {"21", "22"}};
		return arr;
	}
	
	@Test()
	public void test1() throws Exception
	{
		driver = new ChromeDriver();
		driver.get("https://www.google.co.in");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@title='Search']")).sendKeys("Class2 Test1");		
	}
	
	@Test()
	public void test2() throws Exception
	{
		WebDriver driver2 = new ChromeDriver();
		driver2.get("https://www.google.co.in");
		Thread.sleep(5000);
		driver2.findElement(By.xpath("//*[@title='Search']")).sendKeys("Class2 Test2");
	}
	
	@AfterTest
	public void tearDown()
	{
		//driver.quit();
	}
}
