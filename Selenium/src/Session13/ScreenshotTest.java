package Session13;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import com.google.common.io.Files;

import static org.openqa.selenium.support.locators.RelativeLocator.*;
// adding Static and "." & "*" i don't need to added the word Relativelocator

public class ScreenshotTest {

	public static void main(String[] args) throws Exception {

		/*
		 * Go to https://theautomationzone.blogspot.com/2022/01/calculator.html
		 * Using relative locators do a calculation -> 3X8 and capture the result.
		 */

		System.setProperty("webdriver.edge.driver", "C:\\Tools\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://theautomationzone.blogspot.com/2022/01/calculator.html");

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Clicking 3
		driver.findElement(with(By.tagName("input")).toRightOf(By.xpath("//input[@value='2']")))
		.click();
		// Clicking * sign
		driver.findElement(with(By.tagName("input")).toRightOf(By.xpath("//input[@value='=']")))
		.click();
		// Clicking 8
		driver.findElement(with(By.tagName("input")).below(By.xpath("//input[@value='5']")))
		.click();
		// Clicking = sign
		driver.findElement(with(By.tagName("input")).below(By.xpath("//input[@value='9']")))
		.click();
		// Identify Result Field
		WebElement result =
		driver.findElement(with(By.tagName("input")).above(By.xpath("//input[@value='1']")));
		
		//Capturing the result
		String finalresult = result.getAttribute("value");
		System.out.println("Result is: " + finalresult);
		
		captureScreenshot(driver);
		
		driver.close();
	}

	
	
	
	public static void captureScreenshot(WebDriver driver) throws Exception {
		//Capturing the screenshot and capturing under src variable data type
	File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	//
	Files.copy(src, new File("C:\\Users\\Mdsufian Ahmed\\Downloads\\Sample\\image.png"));
	System.out.println("Screenshot Captured");
		
	}
}
