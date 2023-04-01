package ActionItems;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class ActionItem6_2 {

	public static void main(String[] args) {
		/*
		 * 
		 * Navigate to https://testpages.herokuapp.com/styled/basic-html-form-test.html
		 * fill out the form
		 * 
		 * click on all three check boxes, 
		 * click on radio 3
		 * select Selection
		 * Item 4, select drop down Item 5, click on submit button. Capture all the
		 * submitted values from the landing page.
		 */

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

		if (check1.isDisplayed() && check1.isEnabled() && !check1.isSelected()) {
			check1.click();
		}
		System.out.println("Check Box1 Selected: " + check1.isSelected());
		
		WebElement check2 = driver.findElement(By.xpath("//input[@value='cb2']"));

		// displayed
		check2.isDisplayed();
		// enabled
		check2.isEnabled();
		// selected status
		check2.isSelected();

		if (check2.isDisplayed() && check2.isEnabled() && !check2.isSelected()) {
			check2.click();
		}
		System.out.println("Check Box2 Selected: " + check2.isSelected());
		
		WebElement check3 = driver.findElement(By.xpath("//input[@value='cb3']"));

		// displayed
		check3.isDisplayed();
		// enabled
		check3.isEnabled();
		// selected status
		check3.isSelected();

		if (check3.isDisplayed() && check3.isEnabled() && !check3.isSelected()) {
			check3.click();
		}
		System.out.println("Check Box2 Selected: " + check3.isSelected());
		
		WebElement radio3 = driver.findElement(By.xpath("//input[@value='rd3']"));

		// displayed
		radio3.isDisplayed();
		// enabled
		radio3.isEnabled();
		// selected status
		radio3.isSelected();
		//All 3 condition must be met to then click on the radio button
		if (radio3.isDisplayed() && radio3.isEnabled() && !radio3.isSelected()) {
			radio3.click();
		}
		System.out.println("Radio Button Selected " + radio3.isSelected());
	}

}
