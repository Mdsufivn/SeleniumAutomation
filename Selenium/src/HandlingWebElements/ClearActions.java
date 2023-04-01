package HandlingWebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearActions {

	public static void main(String[] args) {
		

		        // Set system property for chromedriver executable
		        System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");

		        // Create an instance of the ChromeDriver
		        WebDriver driver = new ChromeDriver();

		        // Navigate to the website
		        driver.get("https://www.example.com");

		        // Find the search input element
		        WebElement searchInput = driver.findElement(By.name("q"));

		        // Enter a value into the search input
		        searchInput.sendKeys("Selenium");

		        // Wait for 2 seconds
		        try {
		            Thread.sleep(2000);
		        } catch (InterruptedException e) {
		            e.printStackTrace();
		        }

		        // Clear the search input
		        searchInput.clear();

		        // Wait for 2 seconds
		        try {
		            Thread.sleep(2000);
		        } catch (InterruptedException e) {
		            e.printStackTrace();
		        }

		        // Close the browser
		        driver.quit();
		    }
		}


	}

}
