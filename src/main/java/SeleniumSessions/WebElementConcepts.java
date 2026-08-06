package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementConcepts {
	
	static WebDriver driver; //123

	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://demoqa.com/text-box");
		
		// create a web element (with the help of attributes) + perform action (click, sendKeys, isDisplayed, getText)
		
		
		//1.
//		driver.findElement(By.id("userName")).sendKeys("TDITSolutions");
//		driver.findElement(By.id("userEmail")).sendKeys("tdit@gmail.com");
//		driver.findElement(By.id("currentAddress")).sendKeys("Warje Pune");
//		driver.findElement(By.id("permanentAddress")).sendKeys("Warje Pune");
//		driver.findElement(By.id("submit")).click();
		
		//2.
//		WebElement userName = driver.findElement(By.id("userName"));
//		WebElement userEmail = driver.findElement(By.id("userEmail"));
//		WebElement currentAddress = driver.findElement(By.id("currentAddress"));
//		WebElement permanentAddress = driver.findElement(By.id("permanentAddress"));
//		WebElement submit = driver.findElement(By.id("submit"));
//		
//		userName.sendKeys("TDITSolutions");
//		userEmail.sendKeys("tdit@gmail.com");
//		currentAddress.sendKeys("Warje Pune");
//		permanentAddress.sendKeys("Warje Pune");
//		submit.click();
		
		//3. By locator
		
//		By userNameField = By.id("userName");
//		By userEmailField = By.id("userEmail");
//		By currentAddressField = By.id("currentAddress");
//		By permanentAddressField = By.id("permanentAddress");
//		By submitButton = By.id("submit");
//		
//		
//		WebElement userName = driver.findElement(userNameField);
//		WebElement userEmail = driver.findElement(userEmailField);
//		WebElement currentAddress = driver.findElement(currentAddressField);
//		WebElement permanentAddress = driver.findElement(permanentAddressField);
//		WebElement submit = driver.findElement(submitButton);
//
//
//		userName.sendKeys("TDITSolutions");
//		userEmail.sendKeys("tdit@gmail.com");
//		currentAddress.sendKeys("Warje Pune");
//		permanentAddress.sendKeys("Warje Pune");
//		submit.click();
		
		//4. By locator + generic function to get the element
		
//		By userNameField = By.id("userName");
//		By userEmailField = By.id("userEmail");
//		By currentAddressField = By.id("currentAddress");
//		By permanentAddressField = By.id("permanentAddress");
//		By submitButton = By.id("submit");
//		
//		getElement(userNameField).sendKeys("TDITSolutions");
//		getElement(userEmailField).sendKeys("tdit@gmail.com");
//		getElement(currentAddressField).sendKeys("Warje");
//		getElement(permanentAddressField).sendKeys("Warje Pune");
//		getElement(submitButton).click();
		
		
		//5. By locator + generic function to get the element + perform action
//		By userNameField = By.id("userName");
//		By userEmailField = By.id("userEmail");
//		By currentAddressField = By.id("currentAddress");
//		By permanentAddressField = By.id("permanentAddress");
//		By submitButton = By.id("submit");
//			
//		doSendKeys(userNameField,"TDITSolutions");
//		doSendKeys(userEmailField,"tdit@yahoo.com");
//		doSendKeys(currentAddressField,"PUNE");
//		doSendKeys(permanentAddressField,"PUNE");
		
		//6. By locator + generic function to get the web element + Perform action -- ElementUtil
		By userNameField = By.id("userName");
		By userEmailField = By.id("userEmail");
		By currentAddressField = By.id("currentAddress");
		By permanentAddressField = By.id("permanentAddress");
		By submitButton = By.id("submit");
		
		ElementUtil elUtil = new ElementUtil(driver);
		elUtil.doSendKeys(userNameField, "TDITSolutions");
		elUtil.doSendKeys(userEmailField, "TDITSolutions@yahoo.com");
		elUtil.doSendKeys(currentAddressField, "PUNE");
		elUtil.doSendKeys(permanentAddressField, "PUNE");
		elUtil.doClick(submitButton);
//		driver.findElement(By.id("submit")).click();
		
		//7.Everything as generic and called via utility 
		
	}
	
//	public static void doSendKeys(By locator, String value) {
//		getElement(locator).sendKeys(value);
//	}
//	
//	public static WebElement getElement(By locator) {
//		return driver.findElement(locator);
//	}

}
