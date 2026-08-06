package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AttributeConcept {

	static WebDriver driver; 
	public static void main(String[] args) {
		
		//WebElement:
		//1. DOM Attribute
		//2. Property
		
		driver = new ChromeDriver();
		driver.get("https://tdittesting.co.in/tool1/login.php");
		
		WebElement username = driver.findElement(By.name("username"));
		
//		String placeHolderVal = username.getAttribute("placeholder");
//		System.out.println(placeHolderVal);
		
		String placeHolderVal = username.getDomAttribute("placeholder");
		System.out.println(placeHolderVal);
		
		String propertyValue = username.getDomProperty("validationMessage");
		System.out.println(propertyValue);
		
		String nameSpcURI = username.getDomProperty("namespaceURI");
		System.out.println(nameSpcURI);
		
	}
	
	public static String getElementDomAttributeValue(By locator, String attrName) {
		return getElement(locator).getDomAttribute(attrName);
	}
	
	public static String getElementDomPropertValue(By locator, String propName) {
		return getElement(locator).getDomProperty(propName);
	}
	
	private static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

}
