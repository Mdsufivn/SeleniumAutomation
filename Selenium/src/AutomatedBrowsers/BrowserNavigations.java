package AutomatedBrowsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BrowserNavigations {

	public static void main(String[] args) throws InterruptedException {

		/*
		 * This line sets the system property for the Microsoft Edge driver. The driver
		 * is the component that allows Selenium to communicate with the Microsoft Edge
		 * browser. The path provided here is the location of the Microsoft Edge driver
		 * executable file on the local machine.
		 */
		System.setProperty("webdriver.edge.driver", "C:\\Tools\\msedgedriver.exe");
		/*
		 * This line creates a new instance of the EdgeDriver class, which represents
		 * the Microsoft Edge browser. This driver instance is used throughout the rest
		 * of the code to control the browser.
		 */
		WebDriver driver = new EdgeDriver();
		/*
		 * This line tells the driver to navigate to the Google website.
		 */
		driver.get("https://www.google.com");
		/*
		 * This line pauses the execution of the code for 1000 milliseconds (1 second)
		 * to allow time for the website to load.
		 */
		Thread.sleep(1000);
		driver.get("https://facebook.com");
		Thread.sleep(1000);
		driver.get("https://target.com");

		// Method Chaining
		/*
		 * This line tells the driver to go back to the previously visited website
		 * (Facebook in this case).
		 */
		driver.navigate().back();
		Thread.sleep(1000);
		driver.navigate().forward();
		Thread.sleep(1000);

		/*
		 * This line tells the driver to refresh the current webpage.
		 */
		driver.navigate().refresh();

		driver.close();

	}

}
