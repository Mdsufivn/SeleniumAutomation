package ActionItems;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ActionItem6_1 {

	public static void main(String[] args) {
		/*
		 * Navigate to https://testpages.herokuapp.com/styled/alerts/alert-test.html
		 * site. Click on every green buttons, capture the text of alerts, handle all
		 * the alerts and print all the text that is shown after every button once you
		 * handled each and every alerts.
		 */

		System.setProperty("webdriver.edge.driver", "C:\\Tools\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://testpages.herokuapp.com/styled/alerts/alert-test.html");

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// 1st Green box located and clicked
		driver.findElement(By.xpath("//input[@id='alertexamples']")).click();
		Alert alert1 = driver.switchTo().alert();
		System.out.println(alert1.getText());
		alert1.accept();

		// 2nd Green box located and clicked
		driver.findElement(By.xpath("//input[@id='confirmexample']")).click();
		Alert alert2 = driver.switchTo().alert();
		System.out.println(alert2.getText());
		alert2.accept();
		String second = driver.findElement(By.xpath("//p[@id='confirmexplanation']")).getText();
		System.out.println(second);

		// 3nd Green box located and clicked
		driver.findElement(By.xpath("//input[@id='promptexample']")).click();
		Alert alert3 = driver.switchTo().alert();
		System.out.println(alert3.getText());
		alert3.accept();
		String third = driver.findElement(By.xpath("//p[@id='promptexplanation']")).getText();
		System.out.println(third);
		driver.close();
	}
}
