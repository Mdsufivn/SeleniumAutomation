package AutomatedWait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {

		System.setProperty("webdriver.edge.driver", "C:\\Tools\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://theautomationzone.blogspot.com/");

		driver.manage().window().maximize();

		driver.findElement(By.xpath("//button[contains(text(), 'with small delay')]")).click();

		// p[contains(text(), 'with small delay')]

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		String message = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//p[contains(text(), 'with small delay')]")))
				.getText();

		System.out.println(message);

	}

}
