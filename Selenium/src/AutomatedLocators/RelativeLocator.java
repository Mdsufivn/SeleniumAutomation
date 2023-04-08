package AutomatedLocators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class RelativeLocator {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "C:\\Tools\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));

		/*
		 * This line finds the <label> element on the webpage that contains the text
		 * "Password" and assigns it to the label variable. The By.xpath() method is
		 * used to locate the element using an XPath expression.
		 */
		WebElement label = driver.findElement(By.xpath("//label[text()='Password']"));
		/*
		 * This line finds the <input> element that is located above the label element,
		 * and enters the string "Admin" into the field. The RelativeLocator.with()
		 * method is used to specify the locator for the <input> element, and the
		 * above() method is used to specify that the element should be located above
		 * the label element.
		 */
		driver.findElement(RelativeLocator.with(By.tagName("input")).above(label)).sendKeys("Admin");
		/*
		 * This line finds the <input> element that is located below the label element,
		 * and enters the string "admin123" into the field. The RelativeLocator.with()
		 * method is used again to specify the locator for the <input> element, and the
		 * below() method is used to specify that the element should be located below
		 * the label element.
		 */
		driver.findElement(RelativeLocator.with(By.tagName("input")).below(label)).sendKeys("admin123");
		/*
		 * In summary, the code uses the above() and below() methods of Selenium's
		 * RelativeLocator class to locate input fields relative to a specific label
		 * element on a webpage. This allows the code to interact with the correct input
		 * fields even if their positions change relative to other elements on the page.
		 */
	}

}
