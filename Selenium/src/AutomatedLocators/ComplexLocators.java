package AutomatedLocators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ComplexLocators {

	public static void main(String[] args) {

		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		// Maximize the application window
		driver.manage().window().maximize();
		// wait implicitly for 15seconds
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		// open URL
		driver.get("https://ultimateqa.com/simple-html-elements-for-automation/");
		
		//Click variable added with "." due to code being a CSS element (Tag name + ID)
//		driver.findElement(By.cssSelector("a#idExample")).click();
		
		// Tag name is optional
//		driver.findElement(By.cssSelector("a#idExample")).click();

		//Clicking on button with Tag name + class 
//		driver.findElement(By.cssSelector("button.buttonClass")).click();
		
		// Clicking on button with Tag name + attribute 
//		driver.findElement(By.cssSelector("button[class=buttonClass]")).click();
	
		driver.findElement(By.cssSelector("button.buttonClass[type=submit]")).click();
		
		
		

	}

}
