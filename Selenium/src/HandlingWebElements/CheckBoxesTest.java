package HandlingWebElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class CheckBoxesTest {

	public static void main(String[] args) {

		System.setProperty("webdriver.edge.driver", "C:\\Tools\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://testpages.herokuapp.com/styled/basic-html-form-test.html");

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement check1 = driver.findElement(By.xpath("//input[@value='cb1']"));

		// displayed
		check1.isDisplayed();
		// enabled
		check1.isEnabled();
		// selected status
		check1.isSelected();
		//All 3 condition must be met to then click on the check box
		if (check1.isDisplayed() && check1.isEnabled() && !check1.isSelected()) {
			check1.click();
		}
		System.out.println("Check Box Clicked " + check1.isSelected());
		
		driver.close();
		

	}

}
