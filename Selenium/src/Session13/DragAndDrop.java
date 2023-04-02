package Session13;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws Exception{
		
		System.setProperty("webdriver.edge.driver", "C:\\Tools\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://jqueryui.com/droppable/");

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Switching to respective frame within WebElement
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe")));
		
		//Saving WebElements under variables
		WebElement draggable = driver.findElement(By.id("draggable"));
		WebElement droppable = driver.findElement(By.id("droppable"));
		Thread.sleep(2000);
		//Create an object of Action Class
		Actions drag = new Actions(driver);
		
		drag.clickAndHold(draggable).moveToElement(droppable).build().perform();
		
		Thread.sleep(2000);
		System.out.println("Drag and drop successful.");
		
	}

}
