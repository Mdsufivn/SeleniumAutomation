package com.qa.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class OpenInChrome {

	public static void main(String[] args) {


		//Open Chrome with google browser		
		System.setProperty("webdriver.chrome.driver", "C:\\Tools\\chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");

		WebDriver driver = new ChromeDriver(co);
		driver.get("https://www.google.com");

	}

}
