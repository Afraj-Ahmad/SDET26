package com.crm.SDET02;

import org.testng.annotations.Test;

public class DataTest {
	@Test
	public void read() {
		System.out.println("read data from cmd line");
		String url = System.getProperty("url");
		String browser = System.getProperty("chrome");
		String username = System.getProperty("username");
		
		System.out.println(url);
		System.out.println(browser);
		System.out.println(username);
		
	}
}

