package AutomatedLocators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Locators {

	public static void main(String[] args) {

		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		// Maximize the application window
		driver.manage().window().maximize();
		// wait implicitly for 15seconds
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		// open URL
		driver.get("https://ultimateqa.com/simple-html-elements-for-automation/");

		// Using the driver function with findElement to get the String ID value
		// validated
		// Identifying click me element with the attribute ID
//		WebElement clickMeButton = driver.findElement(By.id("button1"));
//		clickMeButton.click();

		// Using attribute className function
//		WebElement Button = driver.findElement(By.className("buttonClass"));
//		Button.click();

		// Using attribute name function
//		WebElement nameButton = driver.findElement(By.name("button1"));
//		nameButton.click();

		// Using attribute link function
//		WebElement link = driver.findElement(By.linkText("Click this link"));
//		link.click();

		// Using attribute partialLink function
//		WebElement Plink = driver.findElement(By.partialLinkText("Click this "));
//		Plink.click();

		// Using attribute tag name function
		int totalLinks = driver.findElements(By.tagName("a")).size();
		System.out.println("This page contains " + totalLinks + " links.");

	}

}
