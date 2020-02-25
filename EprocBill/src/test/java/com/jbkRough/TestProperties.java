package com.jbkRough;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import com.mysql.cj.jdbc.Driver;

public class TestProperties {
	public static void main(String[] args) throws IOException {
		System.out.println(System.getProperty("user.dir"));
		Properties config = new Properties();
		Properties OR = new Properties();
		FileInputStream fis =new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\Properties\\Config.properties");
		config.load(fis);
		fis =new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\Properties\\OR.properties");
		OR.load(fis);
		System.out.println(config.getProperty("browser"));
		
		System.out.println(OR.getProperty("Login"));
	
	}

}
