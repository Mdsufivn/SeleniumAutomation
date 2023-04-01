package AutomatedBrowsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class OpenChrome {

	public static void main(String[] args) {

		/*
		 * The first line sets a system property named "webdriver.chrome.driver" to the
		 * path of the ChromeDriver executable file on your local machine. This property
		 * is required by Selenium to locate and use the ChromeDriver to interact with
		 * the Chrome browser.
		 */
		System.setProperty("webdriver.chrome.driver", "C:\\Tools\\chromedriver.exe");
		/*
		 * The second line creates a new instance of the ChromeOptions class, which is
		 * used to customize the behavior of the Chrome browser. In this case, the code
		 * adds a command line argument to allow requests from any origin. This is
		 * useful for testing web applications that require cross-origin requests.
		 */
		ChromeOptions co = new ChromeOptions();
		/*
		 * The third line creates a new instance of the ChromeDriver class with the
		 * options specified in the ChromeOptions object. The driver variable is
		 * assigned to this instance.
		 */
		co.addArguments("--remote-allow-origins=*");
		/*
		 * The fourth line uses the get() method of the driver object to navigate to the
		 * Google website by passing the website URL as a parameter. This will open a
		 * new Chrome browser window and load the Google homepage.
		 */
		WebDriver driver = new ChromeDriver(co);
		driver.get("https://www.google.com");
		/*
		 * So, in summary, this code sets up the ChromeDriver executable, configures the
		 * ChromeOptions to allow requests from any origin, creates a new instance of
		 * the ChromeDriver with the specified options, and navigates to the Google
		 * website using the driver object.
		 */
	}

}
