package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StringLocator {
	
	static WebDriver driver;
	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		String firstName_ID = "input-firstname";
		String lastName_ID = "input-lastname";
		String email_NAME = "email";
		String telephone_XPATH = "//input[@placeholder='Telephone']";
		String checkBox_NAME = "agree";
		
//		getElement("ID",firstName_ID).sendKeys("TDIT");
//		getElement("ID",lastName_ID).sendKeys("Testing");
//		getElement("NAME", email_NAME).sendKeys("tdit@gmail.com");
//		getElement("XPATH",telephone_XPATH).sendKeys("788978979");
		
		ElementUtil eleUtil = new ElementUtil(driver);
		eleUtil.doSendKeys("ID", firstName_ID, "TDIT");
		eleUtil.doSendKeys("XPATH",telephone_XPATH,"56667676");
		eleUtil.doClick("NAME",checkBox_NAME);
		
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static WebElement getElement(String locatorType, String locatorValue) {
		return driver.findElement(getBy(locatorType, locatorValue));
	}
	
	public static By getBy(String locatorType, String locatorValue) {
		
		By locator = null;
		
		switch(locatorType.toUpperCase()) {
		case "ID":
			locator = By.id(locatorValue);
			break;
		case "NAME":
			locator = By.name(locatorValue);
			break;
		case "CLASS":
			locator = By.className(locatorValue);
			break;
		case "TAG":
			locator = By.tagName(locatorValue);
			break;
		case "XPATH":
			locator = By.xpath(locatorValue);
			break;
		case "CSS":
			locator = By.cssSelector(locatorValue);
			break;
		case "LINKTEXT":
			locator = By.linkText(locatorValue);
			break;
		case "PARTIALLINKTEXT":
			locator = By.partialLinkText(locatorValue);
			break;
			
		default:
			System.out.println("Pls pass the right locator "+locatorType);
			break;
		}
		return locator; 
		
	}

}
