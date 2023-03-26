package WebDriverManager;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstDemo {

	public static void main(String[] args) {
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get("https://theautomationzone.blogspot.com/");
		
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://theautomationzone.blogspot.com/");
		
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
