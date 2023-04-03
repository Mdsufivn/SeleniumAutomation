package Session13;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Scrolling {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.edge.driver", "C:\\Tools\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.target.com/");

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		WebElement target1 = driver.findElement(By.xpath("//span[text()='Save on, saver']"));

		JavascriptExecutor js = (JavascriptExecutor) driver;

		// Scroll down
		js.executeScript("window.scrollBy(0, 2000)");
		Thread.sleep(2000);

		// Scroll Up
		js.executeScript("window.scrollBy(0, -1000)");
		Thread.sleep(2000);

		// Scroll to a targeted element
		js.executeScript("arguments[0].scrollIntoView()", target1);
		Thread.sleep(2000);

		// Scroll to the bottom
		js.executeScript("window.scrollBy(0, document.body.scrollHeight)");
		Thread.sleep(2000);

		//driver.close();

		System.out.println("Success in scrolling");

	}

}
