package com.qa.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class OpenInEdge {

	public static void main(String[] args) {

		  System.setProperty("webdriver.edge.driver", "C:\\Tools\\msedgedriver.exe");
		  WebDriver driver = new EdgeDriver(); 
		  driver.get("https://www.google.com");
	}

}
