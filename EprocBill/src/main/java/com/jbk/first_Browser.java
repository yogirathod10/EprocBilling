package com.jbk;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class first_Browser {
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.javaclassesinpune.com/projects/eprocbilling/index.php");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("/html/body/div/div[2]/form/div/input[2]")).sendKeys("admin");
		driver.findElement(By.xpath("/html/body/div/div[2]/form/div/input[3]")).sendKeys("password");
		driver.findElement(By.xpath("/html/body/div/div[2]/form/div/input[4]")).click();
	}

}
