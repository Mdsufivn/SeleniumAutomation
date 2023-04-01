package AutomatedBrowsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class OpenEdge {

	public static void main(String[] args) {
		/*
		 * The first line sets a system property named "webdriver.edge.driver" to the
		 * path of the Microsoft Edge Driver executable file on your local machine. This
		 * property is required by Selenium to locate and use the Edge Driver to
		 * interact with the Microsoft Edge browser.
		 */
		System.setProperty("webdriver.edge.driver", "C:\\Tools\\msedgedriver.exe");
		/*
		 * The second line creates a new instance of the EdgeDriver class, which is a
		 * WebDriver implementation that controls the Microsoft Edge browser. The driver
		 * variable is assigned to this instance.
		 */
		WebDriver driver = new EdgeDriver();
		/*
		 * The third line uses the get() method of the driver object to navigate to the
		 * Google website by passing the website URL as a parameter. This will open a
		 * new Microsoft Edge browser window and load the Google homepage.
		 */
		driver.get("https://www.google.com");
		/*
		 * So, in summary, this code sets up the Edge Driver executable, creates a new
		 * instance of the EdgeDriver class, and navigates to the Google website using
		 * the driver object.
		 */
	}

}
