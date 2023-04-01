package HandlingWebElements;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropDowns {

	public static void main(String[] args) {

		System.setProperty("webdriver.edge.driver", "C:\\Tools\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://testpages.herokuapp.com/styled/basic-html-form-test.html");

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		WebElement dropdown = driver.findElement(By.xpath("//select[@name='dropdown']"));

		dropdown.isDisplayed();
		dropdown.isEnabled();
		
		// Create a reference variable for Select
		Select dropdownSelect = new Select(dropdown);

		// Select by visible text
//		dropdownSelect.selectByVisibleText("Drop Down Item 5");

		// Select by Value
//		dropdownSelect.selectByValue("dd6");

		// Select by Index
		// dropdownSelect.selectByIndex(0);

//		Capture how many options available under a drop down
		List<WebElement> dropdowntOptions = dropdownSelect.getOptions();

		int totaloptions = dropdowntOptions.size();
		System.out.println("Available options are " + totaloptions);

//		Printing all options
		for (WebElement opt : dropdowntOptions) {
			System.out.println(opt.getText());
		}

		// driver.close();

	}

}
