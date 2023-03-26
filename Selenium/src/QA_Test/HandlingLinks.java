package QA_Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingLinks {

	public static void main(String[] args) {
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.get("http://gcreddy.com/project/admin/login.php");
			
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement link = driver.findElement(By.xpath("//a[text()='Online Catalog']"));
		
		boolean status = link.isDisplayed();
		System.out.println(status);
		
		status = link.isEnabled();
		System.out.println(status);
		
		String linkText = link.getText();
		System.out.println("The label of the link is: " + linkText);
		
		link.click();
		String landingurl = driver.getCurrentUrl();
		String expectedurl  ="http://gcreddy.com/project/";
		if (landingurl.equalsIgnoreCase(expectedurl)) {
			System.out.println("Link worked");
		}else {
			System.out.println("Test Failed");
		}
		
		driver.quit();
				
		

	}

}
