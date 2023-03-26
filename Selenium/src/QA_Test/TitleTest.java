package QA_Test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class TitleTest {

	public static void main(String[] args) {

		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		// Maximize the window
		driver.manage().window().maximize();
		// wait implicitly for 15seconds
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		// open URL
		driver.get("https://target.com");

		// Get expected title
		String expectedTitle = "Target : Expect More. Pay Less.";
// equalsIgnoreCase() is used when comparing String to String
		
		// Get actual title
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		
		if (expectedTitle.equalsIgnoreCase(actualTitle)) {
			System.out.println("Title validation passed");
		} else {
			System.out.println("Title validation failed!!");
		}
		driver.close();
	}

}
