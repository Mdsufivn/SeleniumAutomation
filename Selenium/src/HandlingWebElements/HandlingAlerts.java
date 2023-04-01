package HandlingWebElements;

import java.time.Duration;

import javax.swing.Popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandlingAlerts {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.edge.driver", "C:\\Tools\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
// adding page load timeout
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
//		maximize window
		driver.manage().window().maximize();
//		adding implicit wait		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		//clicking on login button
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(1000);
		
		//changing the focus of the driver to alert and saving alert under a variable
		Alert popUP = driver.switchTo().alert();

		//capturing the text that is present in the alert then printing it
		String alertMessage = popUP.getText();
		String expectedMessage = "Please enter a valid user name";
		
		if(alertMessage.equalsIgnoreCase(expectedMessage)) {
			System.out.println("Alert message is validate");
		}else {
			System.out.println("Alert did not match!");
		}
		//System.out.println(alertMessage);

		Thread.sleep(1000);

		popUP.accept();

		driver.close();

	}

}
