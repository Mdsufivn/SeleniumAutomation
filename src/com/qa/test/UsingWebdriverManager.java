package com.qa.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UsingWebdriverManager {

	public static void main(String[] args) {

//		//import WebdriverManager then setting up edge driver
//		WebDriverManager.edgedriver().setup();
//		//Create a web driver instance of EdgeDriver
//		WebDriver driver = new EdgeDriver();
		
		//Setting up ChromeDriver
		WebDriverManager.chromedriver().setup();	
//				ChromeOptions co = new ChromeOptions();
//				co.addArguments("--remote-allow-origins=*");

				WebDriver driver = new ChromeDriver();
				//With the help of the driver reference we are getting the URL
				driver.get("https://www.google.com");
		

		
		
		
		
		

	}

}
