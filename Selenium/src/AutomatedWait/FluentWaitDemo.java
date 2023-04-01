package AutomatedWait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FluentWaitDemo {

	public static void main(String[] args) {
		// Open Browser & Navigate to URL
		System.setProperty("webdriver.edge.driver", "C:\\Tools\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://theautomationzone.blogspot.com/");
		// Maximize current window
		driver.manage().window().maximize();
		// Find driver element button using xpath then clicking it
		driver.findElement(By.xpath("//button[contains(text(), 'with small delay')]")).click();

		/*
		 * The FluentWait class is a type of Wait interface that provides a fluent
		 * interface for waiting for a certain condition to be met on the web page. In
		 * this code, the FluentWait object is created by passing the driver object and
		 * a Duration object as parameters, which set the maximum amount of time to wait
		 * for a condition to be met and the polling interval respectively.
		 * 
		 * The withTimeout() method is used to set the maximum amount of time to wait
		 * for a condition to be met before timing out. In this case, a timeout of 10
		 * seconds is set using the Duration.ofSeconds(10) method.
		 *
		 * The pollingEvery() method is used to set the polling interval, which
		 * specifies how frequently the condition should be checked. In this case, the
		 * condition will be checked every 2 seconds using the Duration.ofSeconds(2)
		 * method.
		 *
		 * The ignoring() method is used to specify exceptions that should be ignored
		 * during the wait. In this case, the NoSuchElementException exception is
		 * ignored, which means that if the element is not found on the web page, the
		 * wait will not be interrupted by a NoSuchElementException.
		 *
		 * Once the FluentWait object is configured, it can be used to wait for a
		 * specific condition to be met on the web page, using a fluent API.
		 */
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofSeconds(2)).ignoring(NoSuchElementException.class);
// In summary, the code creates a FluentWait object with a specified timeout period, polling interval, 
		// and exceptions to ignore, which can be used to wait for a specific condition
		// to be met on the web page using a fluent API style.

		/*
		 * The until() method of wait is called with the argument
		 * ExpectedConditions.elementToBeClickable(By.
		 * xpath("//p[contains(text(), 'with small delay')]")). This means that it will
		 * wait until the element located by the XPath expression //p[contains(text(),
		 * 'with small delay')] becomes clickable.
		 * 
		 * When the element becomes clickable, the until() method returns the WebElement
		 * object for that element.
		 *
		 * The getText() method is then called on the WebElement object to retrieve the
		 * text content of the web element.
		 *
		 * The retrieved text content is then stored in the message variable, which is
		 * declared as a String type.
		 */
		String message = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//p[contains(text(), 'with small delay')]")))
				.getText();

//In summary, this code waits for a specific web element to become clickable and then retrieves its text content, 
		// which is stored in the message variable as a string.

		System.out.println(message);

	}

}
