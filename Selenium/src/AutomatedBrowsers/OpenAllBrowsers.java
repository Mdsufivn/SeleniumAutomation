package AutomatedBrowsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenAllBrowsers {

	public static void main(String[] args) {
		
		// Open Chrome
		System.setProperty("webdriver.chrome.driver", "C:\\Tools\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		  driver.get("https://www.google.com");
		  ChromeOptions co = new ChromeOptions();
			co.addArguments("--remote-allow-origins=*");

//		  // Open Firefox
//		  WebDriver driver = new FirefoxDriver(); 
//		  driver.get("https://www.google.com");

//		  // Open Edge
//		  WebDriver driver = new EdgeDriver(); 
//		  driver.get("https://www.google.com");

	}

}
