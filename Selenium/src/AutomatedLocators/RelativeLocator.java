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

		WebElement label = driver.findElement(By.xpath("//label[text()='Password']"));

		driver.findElement(RelativeLocator.with(By.tagName("input")).above(label)).sendKeys("Admin");
		
		driver.findElement(RelativeLocator.with(By.tagName("input")).below(label)).sendKeys("admin123");

	}

}
