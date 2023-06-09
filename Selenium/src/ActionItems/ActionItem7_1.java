package ActionItems;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class ActionItem7_1 {

	public static void main(String[] args) {
		/*
		 * Navigate to https://testpages.herokuapp.com/styled/basic-html-form-test.html
		 * fill out the form
		 * 
		 * click 2nd check box click on radio 3 select Selection Item 3 select drop down
		 * Item 6, click on submit button. Capture all the submitted values from the
		 * landing page.
		 */

		System.setProperty("webdriver.edge.driver", "C:\\Tools\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://testpages.herokuapp.com/styled/basic-html-form-test.html");

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Mdsufivn");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Password123");
		driver.findElement(By.xpath("//textarea[@name='comments']")).sendKeys("If reading this, then success");

		WebElement check1 = driver.findElement(By.xpath("//input[@value='cb1']"));

		// displayed
		check1.isDisplayed();
		// enabled
		check1.isEnabled();
		// selected status
		check1.isSelected();

		if (check1.isDisplayed() && check1.isEnabled() && check1.isSelected()) {
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

		if (check3.isDisplayed() && check3.isEnabled() && check3.isSelected()) {
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
		// All 3 condition must be met to then click on the radio button
		if (radio3.isDisplayed() && radio3.isEnabled() && !radio3.isSelected()) {
			radio3.click();
		}
		System.out.println("Radio Button Selected " + radio3.isSelected());

		WebElement chart = driver.findElement(By.xpath("//select[@name='multipleselect[]']"));
		chart.isDisplayed();
		chart.isEnabled();
		Select chartSelect = new Select(chart);

		chartSelect.selectByValue("ms4");

		WebElement dropdown = driver.findElement(By.xpath("//select[@name='dropdown']"));

		dropdown.isDisplayed();
		dropdown.isEnabled();
		// Create a reference variable
		Select dropdownSelect = new Select(dropdown);

		// Select by visible text
		dropdownSelect.selectByVisibleText("Drop Down Item 6");

		driver.findElement(By.xpath("//input[@type='submit']")).click();

	}

}
