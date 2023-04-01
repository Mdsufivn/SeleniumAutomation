package HandlingWebElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingRadioButtons {

	public static void main(String[] args) {

		System.setProperty("webdriver.edge.driver", "C:\\Tools\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://testpages.herokuapp.com/styled/basic-html-form-test.html");

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement radio1 = driver.findElement(By.xpath("//input[@value='rd1']"));

		// displayed
		radio1.isDisplayed();
		// enabled
		radio1.isEnabled();
		// selected status
		radio1.isSelected();
		//All 3 condition must be met to then click on the radio button
		if (radio1.isDisplayed() && radio1.isEnabled() && !radio1.isSelected()) {
			radio1.click();
		}
		System.out.println("Radio Button Selected " + radio1.isSelected());
		
		driver.close();
		
		

	}

}
