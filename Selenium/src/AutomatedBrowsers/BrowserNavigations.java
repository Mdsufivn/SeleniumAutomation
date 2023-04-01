package AutomatedBrowsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BrowserNavigations {

	public static void main(String[] args) throws InterruptedException {


		
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
		  

	}

}
