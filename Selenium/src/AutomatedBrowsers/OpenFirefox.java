package AutomatedBrowsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenFirefox {

	public static void main(String[] args) {

		/*
		 * In the first line, the code creates a new instance of the FirefoxDriver
		 * class, which is a WebDriver implementation that controls the Firefox browser.
		 * The driver variable is assigned to this instance.
		 */
		
		WebDriver driver = new FirefoxDriver();

		/*
		 * In the second line, the code uses the get() method of the driver object to
		 * navigate to the Facebook website by passing the website URL as a parameter.
		 */

		driver.get("https://facebook.com/");

		/*
		 * So, in summary, this code opens a new Firefox browser window and navigates to
		 * the Facebook website.
		 * 
		 */

	}

}
