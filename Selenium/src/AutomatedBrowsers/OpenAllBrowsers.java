package AutomatedBrowsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenAllBrowsers {

	public static void main(String[] args) {
		
		// Open Chrome
	    ChromeOptions options = new ChromeOptions();
	    options.addArguments("--remote-allow-origins=*");
	    WebDriver driver = new ChromeDriver(options);
	    driver.get("https://www.google.com");

//		  // Open Firefox
//		  WebDriver driver = new FirefoxDriver(); 
//		  driver.get("https://www.google.com");

//		  // Open Edge
//		  WebDriver driver = new EdgeDriver(); 
//		  driver.get("https://www.google.com");

	}

}
