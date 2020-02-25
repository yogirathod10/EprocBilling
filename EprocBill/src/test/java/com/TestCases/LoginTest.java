package com.TestCases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.jbkBase.TestBase;

public class LoginTest extends TestBase {
	
	@Test
	public void Login() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"login_box\"]/form/div/input[4]")).click();
		Thread.sleep(3000);
		
	}

}
