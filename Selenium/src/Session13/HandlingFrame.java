package Session13;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingFrame {

	public static void main(String[] args) throws Exception {

//		driver.switchTo().defaultContent(); // Takes you to the main page
//		driver.switchTo().parentFrame(); // Takes back to parent frame
//		driver.switchTo().frame(0); // Index
//		driver.switchTo().frame("Name of frame") // String
//		driver.switchTo().frame("WebElement"); // WebElement

		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");

		// adding page load timeout
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		// maximizing the window
		driver.manage().window().maximize();
		// adding implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Switching the focus on the driver to the desired frame
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@name='classFrame']")));

		// Printing the text if the desired element
		System.out.println(driver.findElement(By.xpath("//a[text()='org.openqa.selenium']")).getText());
		// Clicking on the link
		driver.findElement(By.xpath("//a[text()='org.openqa.selenium']")).click();
		Thread.sleep(1000);
		// Capturing Landing page
		System.out.println(driver.findElement(By.xpath("//span[text()='Interface Summary']")).getText());

		driver.close();

		System.out.println("Frame practice is over");

	}

}
