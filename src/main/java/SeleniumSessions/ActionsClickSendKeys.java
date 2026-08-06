package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClickSendKeys {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException{
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
	
		WebElement firstname = driver.findElement(By.id("input-firstname"));
		WebElement checkbox = driver.findElement(By.name("agree"));
		
		Actions act = new Actions(driver);
//		act.sendKeys("Testing").perform();
		
		
		//Equivalent to calling: Actions.click(element).sendKeys(keysToSend)
//		act.sendKeys(firstname, "Testing").perform();
		
		
		//Equivalent to: Actions.moveToElement(onElement).click()
//		act.click(checkbox).perform();
		
		
		//Sequence: 1. Normal click ; 2. Ac.click-> Move to element ; 3. js executor click

		doActionsSendKeys(By.id("input-firstname"), "Testing");
	}

	public static void doActionsSendKeys(By locator,String value) {
		Actions act = new Actions(driver);
		act.sendKeys(getElement(locator), value).perform();
	}
	
	public static void doActionsClick(By locator) {
		Actions act = new Actions(driver);
		act.click(getElement(locator)).perform();
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
}
