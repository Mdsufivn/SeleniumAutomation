package HandlingWebElements;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class HandlingWebTable {

	public static void main(String[] args) {

		System.setProperty("webdriver.edge.driver", "C:\\Tools\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Identify Element
		WebElement customer = driver.findElement(By.xpath("//table[@id='customers']/child::tbody"));

		// Capturing all the rows of a table
		List<WebElement> rows = customer.findElements(By.tagName("tr"));

		for (WebElement row : rows) {

			List<WebElement> cells = row.findElements(By.tagName("td"));

			for (WebElement cell : cells) {
				System.out.print(cell.getText() + "\t");
			}
			System.out.println();
		}
		driver.close();

	}
//		// Capturing all the cells of a table
//		List<WebElement> cells = customer.findElements(By.tagName("th"));
//		System.out.println(cells.size());
}
