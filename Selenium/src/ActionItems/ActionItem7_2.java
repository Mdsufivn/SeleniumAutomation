package ActionItems;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class ActionItem7_2 {

	public static void main(String[] args) {

		System.setProperty("webdriver.edge.driver", "C:\\Tools\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://demo.guru99.com/test/web-table-element.php");

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Find the table element
		WebElement table = driver.findElement(By.xpath("//table[@class='dataTable']"));
		// Find all rows in the table
		List<WebElement> rows = table.findElements(By.tagName("tr"));
		// Print the total number of rows
		System.out.println("Total number of rows: " + rows.size());
		// Find all columns in the first row
		List<WebElement> columns = rows.get(0).findElements(By.tagName("th"));
		// Print the total number of columns
		System.out.println("Total number of columns: " + columns.size());
		// Find the row with IDFC Bank and print all values in that row
		for (WebElement row : rows) {
			List<WebElement> cells = row.findElements(By.tagName("td"));
			if (cells.size() > 0 && cells.get(0).getText().equals("IDFC Bank")) {
				for (WebElement cell : cells) {
					System.out.print(cell.getText() + "\t");
				}
				break;
			}
		}
		driver.quit();

	}

}
