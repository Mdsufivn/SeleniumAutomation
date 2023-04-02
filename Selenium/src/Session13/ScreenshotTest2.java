package Session13;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import com.google.common.io.Files;

import static org.openqa.selenium.support.locators.RelativeLocator.*;
// adding Static and "." & "*" i don't need to added the word Relativelocator

public class ScreenshotTest2 {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.edge.driver", "C:\\Tools\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.google.com");

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
// google searching for selenium and hitting enter
		driver.findElement(By.name("q")).sendKeys("Youtube", Keys.ENTER);
// Calling capturescreenshot method and passing two arguments
		captureScreenshot(driver, currentTime());

		driver.close();
	}

	public static void captureScreenshot(WebDriver driver, String time) throws Exception {
		// Capturing the screenshot and capturing under src variable data type
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		//
		Files.copy(src, new File("C:\\Users\\Mdsufian Ahmed\\Downloads\\Sample\\image"+time+".png"));
		System.out.println("Screenshot Captured");
	}

	public static String currentTime() {

		Date date = new Date();

		return new SimpleDateFormat("yyyy_MM_dd_hh_mm_ss").format(date);

	}
}
