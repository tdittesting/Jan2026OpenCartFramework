package SeleniumSessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForFrame {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException{
		driver = new ChromeDriver();
		driver.get("https://www.formsite.com/templates/registration-form-templates/vehicle-registration-form/");//parent
		
		By image = By.xpath("//img[@title = 'Vehicle-Registration-Forms-and-Examples']");
		By frame = By.xpath("//iframe[contains(@id,'frame-one')]");
		By name = By.id("RESULT_TextField-1");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(image)).click();
		
//		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frame));
		waitForFrameAndSwitchToIt(frame, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(name)).sendKeys("tdit");
		
		//switch back to main page
		driver.switchTo().defaultContent();
		String header = driver.findElement(By.cssSelector("h3.details__form-preview-title")).getText();
		System.out.println(header);
		
	}
	
	public static void waitForFrameAndSwitchToIt(By locator, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(locator));
		
	}
	public static void waitForFrameAndSwitchToIt(int index, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(index));
		
	}
	public static void waitForFrameAndSwitchToIt(String locator, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(locator));
		
	}
	public static void waitForFrameAndSwitchToIt(WebElement frame, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frame));
		
	}
}
