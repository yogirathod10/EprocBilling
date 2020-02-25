package com.jbkRough;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Properties {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("D:\\Java and testing\\LiveProject\\EprocBill\\src\\test\\resources\\Properties\\Config.properties");
		Properties  properties = new Properties();
		Properties.load(fis);
		System.out.println(Properties.getproperty("Config.properties"));
		
	}

	private static char[] getproperty(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	private static void load(FileInputStream fis) {
		// TODO Auto-generated method stub
		
	}

}
