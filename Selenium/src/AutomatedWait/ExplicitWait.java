package AutomatedWait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {

		// Opening Browser & Navigating to Web page
		System.setProperty("webdriver.edge.driver", "C:\\Tools\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://theautomationzone.blogspot.com/");
		// Maximize the current window on WebDriver instance
		driver.manage().window().maximize();

		/*
		 * The driver object represents the current WebDriver instance that controls the
		 * browser window. The findElement() method of the driver object is used to
		 * locate a web element on the current web page using the specified locator
		 * strategy. In this case, the By.xpath() method is used to locate the web
		 * element using an XPath expression.
		 * 
		 * The XPath expression used in this code is //button[contains(text(), 'with
		 * small delay')], which selects a <button> element that contains the text
		 * "with small delay" in its inner text.
		 * 
		 * Once the web element is located, the click() method is called on it to
		 * simulate a click event. This will trigger any associated JavaScript events or
		 * page transitions as if the button was clicked manually by the user.
		 */
		driver.findElement(By.xpath("//button[contains(text(), 'with small delay')]")).click();
// So, in summary, this code finds a <button> element on the current web page using an XPath expression, and clicks on it using the click() method.

		/*
		 * The WebDriverWait class is used to wait for a specific condition to occur
		 * before performing the next action. The wait object is created by passing the
		 * driver object and a Duration object as parameters. The Duration object
		 * specifies the maximum amount of time to wait for the condition to be met
		 * before timing out.
		 */
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		/*
		 * WebDriverWait class in Selenium WebDriver to wait for a specific web element
		 * to become clickable on the current web page, and then retrieve the text
		 * content of that web element.
		 * 
		 * The wait object represents an instance of the WebDriverWait class that is
		 * configured to wait for a maximum of 10 seconds. The until() method of the
		 * wait object is used to wait until a specific condition is met before
		 * continuing with the script. In this case, the condition is specified using
		 * the ExpectedConditions.elementToBeClickable() method, which waits for the web
		 * element located by the By.xpath("//p[contains(text(), 'with small delay')]")
		 * XPath expression to become clickable.
		 *
		 * Once the web element becomes clickable, the until() method will return the
		 * web element as an WebElement object. The getText() method is then called on
		 * the WebElement object to retrieve the text content of the web element.
		 *
		 * The retrieved text content is then stored in the message variable, which is
		 * declared as a String type.
		 */
		String message = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//p[contains(text(), 'with small delay')]")))
				.getText();
// 		In summary, this code waits for a web element to become clickable on the current web page, retrieves the text content of that web element, and stores it in a String variable named message.

		System.out.println(message);

	}

}
