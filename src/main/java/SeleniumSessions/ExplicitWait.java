package SeleniumSessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	static WebDriver driver;
	public static void main(String[] args) {
		//ExplicitWait : concept
		//Wait(I) - A generic interface for waiting until a condition is true or not null.
		
		
		//Wait(I): until() <---implements FluentWait(C): until(){} + other methods <--- extends WebDriverWait(C) : no methods
		
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		
		By emailId = By.id("input-email");
		By password = By.id("input-password");
		By loginBtn = By.xpath("//input[@value = 'Login']");
		
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		WebElement email_ele = wait.until(ExpectedConditions.presenceOfElementLocated(emailId));
//		email_ele.sendKeys("tdit@gmail.com");
////		driver.findElement(emailId).sendKeys("tdit@gmail.com");
//		driver.findElement(password).sendKeys("tdit@123");
//		driver.findElement(loginBtn).click();
		
		waitForElementPresence(emailId, 10).sendKeys("tdit@gmail.com");
		getElement(password).sendKeys("Tdit@123");
		getElement(loginBtn).click();
		
		
	}
	
	public static WebElement waitForElementPresence(By locator,int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

}
