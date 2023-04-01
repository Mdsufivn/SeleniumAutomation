package ActionItems;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActionItem6_1 {

	public static void main(String[] args) {

		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");

		WebDriver driver = new ChromeDriver(co);
		driver.get("https://theautomationzone.blogspot.com/2022/01/calculator.html");
		
		driver.manage().window().maximize();

		WebElement input1 = driver.findElement(By.xpath("//table/tbody/tr[2]/td[3]/input"));

		input1.click();

		WebElement input2 = driver.findElement(By.xpath("//table/tbody/tr[5]/td[4]/input"));

		input2.click();

		WebElement input3 = driver.findElement(By.xpath("//table/tbody/tr[4]/td[2]/input"));

		input3.click();

		WebElement input4 = driver.findElement(By.xpath("//table/tbody/tr[5]/td[3]/input"));

		input4.click();
		
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(1000));

		String message = wait
		        .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='result']")))
		        .getText();
		

		System.out.println("Result: " + message);

		//driver.quit();
	}
}
