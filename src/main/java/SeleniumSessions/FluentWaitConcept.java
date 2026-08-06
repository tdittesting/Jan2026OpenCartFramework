package SeleniumSessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FluentWaitConcept {

	static WebDriver driver;
	public static void main(String[] args) {

		//WebDriverWait (C) [no methods] --> FluentWait (C) [until(){} + other methods] --> Wait (I): until();
		//WebDriverWait IS - A FluentWait
		
		driver = new ChromeDriver();
		driver.get("https://classic.crmpro.com/");
		
		By username = By.name("username11");
		
//		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
//									.withTimeout(Duration.ofSeconds(10))
//									.pollingEvery(Duration.ofSeconds(2))
//									.ignoring(NoSuchElementException.class)
//									.ignoring(StaleElementReferenceException.class)
//									.withMessage("=====Element is not found====");
//		
//		WebElement un_ele = wait.until(ExpectedConditions.visibilityOfElementLocated(username));
//		un_ele.sendKeys("tdit123");
		
		waitForElementVisibleFluentWait(username, 10, 2).sendKeys("tdit123");
										

	}
	
	public static WebElement waitForElementVisibleFluentWait(By locator,int timeout,int pollingtime) {
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(timeout))
				.pollingEvery(Duration.ofSeconds(pollingtime))
				.ignoring(NoSuchElementException.class)
				.ignoring(StaleElementReferenceException.class)
				.withMessage("=====Element is not found====");
		
		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}
	
	public static WebElement waitForElementPresenceFluentWait(By locator,int timeout,int pollingtime) {
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(timeout))
				.pollingEvery(Duration.ofSeconds(pollingtime))
				.ignoring(NoSuchElementException.class)
				.ignoring(StaleElementReferenceException.class)
				.withMessage("=====Element is not found====");
		
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}

}
