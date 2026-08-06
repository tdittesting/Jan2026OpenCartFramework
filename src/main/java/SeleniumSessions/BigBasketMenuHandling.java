package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BigBasketMenuHandling {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException{
		driver = new ChromeDriver();
		driver.get("https://www.bigbasket.com/");
		
		By level1Menu = By.xpath("(//span[text()='Shop by'])[2]");
		By level2Menu = By.linkText("Beverages");
		By level3Menu = By.linkText("Tea");
		By level4Menu = By.linkText("Green Tea");
		handle4LevelMenu(level1Menu, level2Menu, level3Menu, level4Menu);
		
	}
	
	public static void handle4LevelMenu(By level1Menu,By level2Menu,By level3Menu, By level4Menu) throws InterruptedException {
		Actions act = new Actions(driver);
		driver.findElement(level1Menu).click();
		Thread.sleep(1000);
		act.moveToElement(driver.findElement(level2Menu)).build().perform();
		Thread.sleep(1000);
		act.moveToElement(driver.findElement(level3Menu)).build().perform();
		Thread.sleep(1000);
		driver.findElement(level4Menu).click();
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

}
