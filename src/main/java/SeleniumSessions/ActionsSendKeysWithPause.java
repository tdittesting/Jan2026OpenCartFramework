package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsSendKeysWithPause {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException{
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		WebElement firstname = driver.findElement(By.id("input-firstname"));
		String value = "TestAutomation";
//		char val[] = value.toCharArray();
		
		//CharSequence: String, string builder, string buffer
//		Actions act = new Actions(driver);
//		
//		for(char ch:val) {//T -->"T"
//			act.sendKeys(firstname, String.valueOf(ch)).pause(200).perform();
//		}
		
		By fstNm = By.id("input-firstname");
		
		doSendKeysWithPause(fstNm, value, 300);

	}

	public static void doSendKeysWithPause(By locator, String value, long pauseTime) {
		Actions act = new Actions(driver);
		char val[] = value.toCharArray();
		for(char ch:val) {
			act.sendKeys(getElement(locator), String.valueOf(ch)).pause(pauseTime).perform();
		}
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
}
