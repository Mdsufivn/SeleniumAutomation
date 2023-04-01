package WebDriverManager;

public class Methods {

	public static void main(String[] args) {
		
		get(String url): This method loads a new web page in the current browser window.
		Example: driver.get("https://www.google.com");

		getTitle(): This method gets the title of the current web page.
		Example: String title = driver.getTitle();

		getCurrentUrl(): This method gets the URL of the current web page.
		Example: String url = driver.getCurrentUrl();

		findElement(By by): This method finds the first element in the web page matching the specified locator.
		Example: WebElement searchBox = driver.findElement(By.name("q"));

		findElements(By by): This method finds all elements in the web page matching the specified locator.
		Example: java.util.List<WebElement> links = driver.findElements(By.tagName("a"));

		sendKeys(CharSequence... keysToSend): This method simulates typing keys into an element.
		Example: searchBox.sendKeys("Selenium Java Tutorial");

		click(): This method clicks the element.
		Example: searchBox.click();

		getText(): This method gets the visible text of the element.
		Example: String linkText = link.getText();

		getAttribute(String name): This method gets the value of the specified attribute of the element.
		Example: String href = link.getAttribute("href");

		isDisplayed(): This method determines whether the element is displayed on the web page.
		Example: boolean isDisplayed = link.isDisplayed();

		isEnabled(): This method determines whether the element is enabled.
		Example: boolean isEnabled = searchBox.isEnabled();

		isSelected(): This method determines whether the element is selected.
		Example: boolean isSelected = radioButton.isSelected();

		clear(): This method clears the text in the element.
		Example: searchBox.clear();

		submit(): This method submits the form containing the element.
		Example: searchBox.submit();

		navigate().refresh(): This method refreshes the current web page.
		Example: driver.navigate().refresh();

		navigate().to(String url): This method loads a new web page in the current browser window.
		Example: driver.navigate().to("https://www.google.com");

		navigate().back(): This method navigates back to the previous web page.
		Example: driver.navigate().back();

		navigate().forward(): This method navigates forward to the next web page.
		Example: driver.navigate().forward();

		




	}

}
