package AutomatedBrowsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class OpenBrowsers {

	public static void main(String[] args) throws InterruptedException {

//      Open Chrome with google browser	.	
		//System.setProperty("webdriver.chrome.driver", "C:\\Tools\\chromedriver.exe");
		//ChromeOptions co = new ChromeOptions();
		//co.addArguments("--remote-allow-origins=*");

		//WebDriver driver = new ChromeDriver(co); Test
		//driver.get("https://www.google.com");
		
		  // Open Edge with google browser //
		  System.setProperty("webdriver.edge.driver", "C:\\Tools\\msedgedriver.exe");
		  
		  WebDriver driver = new EdgeDriver(); 
		  //Browser Navigation Commands
		  driver.get("https://www.google.com");
		  Thread.sleep(1000);
		  driver.get("https://facebook.com");
		  Thread.sleep(1000);
		  driver.get("https://target.com");
		  
		  //Method Chaining
		  driver.navigate().back();
		  Thread.sleep(1000);
		  driver.navigate().forward();
		  Thread.sleep(1000);
		  
		  //Refresh Webpage
		  driver.navigate().refresh();
		  
		  driver.close();
		  
//		Open Fire fox with google page
		// WebDriver driver = new FirefoxDriver();
		// driver.get("https://www.google.com");

	}

}
