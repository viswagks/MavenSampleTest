package test;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.Properties;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.test.framework.test_base;

import io.github.bonigarcia.wdm.WebDriverManager;
import javafx.util.Duration;

public class test extends test_base
{
	@FindBy(how=How.ID, id="name")
	WebElement testElement;
	@FindBy(id="name")
	WebElement testElement1;
	By xpath = By.xpath("");
	
	protected static Logger log = Logger.getLogger(test.class);
	public test()
	{
		super();
	}
	
	
	public static void main(String[] args) throws Exception
	{
		//test obtest = new test();
		
		//log.info("Inside Test");
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\91897\\Documents\\Softwares\\Techincal\\Selenium\\drivers\\chromedriver.exe");
		
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver = new ChromeDriver();
//		driver.navigate().to("https://www.google.com/");
//		driver.get("https://www.google.com/");
//		JavascriptExecutor jse = (JavascriptExecutor)driver;
//		jse.executeScript("document.body.style.zoom = '50%';");
//		Thread.sleep(20000);
//		jse.executeScript("document.body.style.zoom = '100%';");
//		
//		driver.findElement(By.id("v"));
//		
//		TakesScreenshot s = (TakesScreenshot)driver;
//		s.getScreenshotAs(OutputType.FILE);
//		
//		HSSFWorkbook wb = new HSSFWorkbook(new FileInputStream(new File("")));
//		HSSFSheet ws = wb.getSheet("");
//		ws.getRow(1).getCell(0);
//		
//		XSSFWorkbook wb1 = new XSSFWorkbook(new File(""));
//		XSSFSheet ws1 = wb1.getSheet("");
//		ws1.getRow(1).getCell(1).setCellValue("");
		//driver.switchTo().alert().
		
		//driver.manage().timeouts().i
		//new Actions(driver).
		
//		Select s = new Select(driver.findElement(By.xpath("a")));
//		WebDriverWait w = new WebDriverWait(driver, 200, 500);
//		w.ignoring(NoSuchElementException.class);
//		w.until(ExpectedConditions.presenceOfElementLocated(By.xpath("")));
//		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
//		String str_Pattern = "[^a-zA-Z]";
//		Pattern p = Pattern.compile(str_Pattern);
//		Matcher m = p.matcher("This is a test string");
//		System.out.println(m.groupCount());
//		///System.out.println(p.split("This is a new string").toString());
//		List<String> li = new ArrayList<String>();
//		List<String> ll = new LinkedList<String>();
//		
//		Set<String> a = null;
//		//a.
//		//new Properties().lo
//		
//		ArrayList hs = new ArrayList();
//		hs.add(1);
//		hs.add("String");
//		hs.remove(1);
//		System.out.println(hs);
//		
//		Connection c = DriverManager.getConnection("dsd", "", "");
//		Statement s = c.createStatement();
//		boolean d = s.execute("");
//		//s.executeQuery("").siz
//		
//		
//		
//		PriorityQueue pq = new PriorityQueue();
//		//pq.
//		
//		//new WebDr
//		//ExpectedConditions.
//		
//		DesiredCapabilities ds = DesiredCapabilities.chrome();
//		ds.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
//		
//	
//		driver.findElement(By.xpath(""));
//		
//		Robot rb = new Robot();
//		
//		*/
		
//		String s = "1 2 3 4 5";
//		System.out.println(s.substring(s.length() - (2*2)));
		
//		driver.get("https://www.guru99.com/scroll-up-down-selenium-webdriver.html");
//		WebElement e = driver.findElement(By.xpath("(//*[text()='Output analysis: '])[1]"));
//		System.out.println(e.getLocation());
//		new Actions(driver).moveToElement(e).build().perform();
//		System.out.println(e.getLocation());
//		//e.sendKeys(Keys.PAGE_DOWN);
//		
//		driver.switchTo().frame(1).getTitle();
//		///driver.get
		
		//System.out.println("test");
//		System.out.println(Calendar.getInstance(TimeZone.getTimeZone("EST")).getTime());
//		Calendar o = Calendar.getInstance();
//		o.setTimeZone(TimeZone.getTimeZone("EST"));
//		System.out.println(o.getTime());
//		
//		System.out.println(Calendar.getInstance(Locale.US).getTime());
//		System.out.println(new SimpleDateFormat("hh:mm:ss").format("07:32:36"));
		
//		TimeZone.setDefault(TimeZone.getTimeZone("EST"));
//		//SimpleDateFormat sdf = new SimpleDateFormat("MM/DD/YYYY").parse("03/10/2021");
//		System.out.println(Calendar.getInstance().getTime());
//		long str_CurrentTime = Calendar.getInstance().getTimeInMillis();
//		long str_TransactionTime = new SimpleDateFormat("hh:mm:ss MM/dd/yyyy").parse("10:19:36 03/10/2021").getTime();
//		System.out.println(TimeUnit.MINUTES.convert(str_CurrentTime - str_TransactionTime, TimeUnit.MILLISECONDS));
		
		//String s = "01010101111111111111111111111110101010100101001010100011111111111";
		
		//System.out.println("num".equals(null));
		
		//driver.switchTo()
		
//		driver.get("https://www.google.co.in");
//		driver.switchTo().newWindow(WindowType.TAB);
//		driver.navigate().to("https://www.facebook.com");
//		System.out.println("Hi");
		
		//DriverManager.
		
		//Concurre
		System.out.println("c".compareTo("c"));
	} 
}
