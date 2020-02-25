package com.jbkBase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class TestBase {
	public static WebDriver driver;
	public static Properties config = new Properties();
	public static Properties OR = new Properties();
	public static FileInputStream fis;
	
	
	@BeforeSuite
	public void setUp() {
		if(driver==null) {
			
			try {
				fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\Properties\\Config.properties");
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				config.load(fis);
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			try {
				fis =new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\Properties\\OR.properties");
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				OR.load(fis);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(config.getProperty("browser").equals("firefox")) {
				//System.setProperty("webdriver.gecko.driver","gecko.exe");
				driver = new FirefoxDriver();
				
			}else if(config.getProperty("browser").equals("Chrome")) {
				System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\src\\test\\resources\\executable\\chrome.exe");
				driver = new ChromeDriver();
			} else if(config.getProperty("browser").equals("ie")) {
				System.setProperty("webdriver.ie.driver",System.getProperty("user.dir")+"\\src\\test\\resources\\executable\\IEDriverServer.exe");
				driver = new InternetExplorerDriver();
			}
			//driver.findElement(By.xpath("https://javaclassesinpune.com/projects/eprocbiling/index.php"));
			driver.get(config.getProperty("testsiteurl"));
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Integer.parseInt(config.getProperty("implicit.wait")), TimeUnit.SECONDS);
		}
		
	}
	@AfterSuite
	public  void tearDown() {
		
		if(driver!=null) {
			driver.quit();
		}
		
	}

}
