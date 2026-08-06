package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElementConcept {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException{
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		By components = By.linkText("Components");
		By monitors = By.linkText("Monitors (2)");
		handleParentSubMenu(components, monitors);
		
	}

	public static void handleParentSubMenu(By parentMenu,By subMenu) throws InterruptedException {
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(parentMenu)).build().perform();
		Thread.sleep(2000);
		driver.findElement(subMenu).click();
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
}
