package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.locators.RelativeLocator;

public class ActionsScrolling {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException{
		driver = new ChromeDriver();
		driver.get("https://selectorshub.com/xpath-practice-page/");
		Thread.sleep(1000);
		Actions act = new Actions(driver);
		
		//Partial scrolling
//		act.sendKeys(Keys.PAGE_DOWN).perform();
//		Thread.sleep(1000);
//		act.sendKeys(Keys.PAGE_DOWN).perform();
//		Thread.sleep(1000);
//		act.sendKeys(Keys.PAGE_DOWN).perform();
//		Thread.sleep(1000);
//		act.sendKeys(Keys.PAGE_UP).perform();
		
		//Go to the footer of the page:
//		act.sendKeys(Keys.CONTROL).sendKeys(Keys.END).perform();
//		
//		Thread.sleep(2000);
		
		//Go to top of the page:
//		act.sendKeys(Keys.CONTROL).sendKeys(Keys.HOME).perform();
		
		WebElement baseEle = driver.findElement(By.xpath("//a[text()='Joe.Root']"));
		
		//Scroll to element:
		act.scrollToElement(baseEle).pause(200)
		.click(driver.findElement(RelativeLocator.with(By.tagName("td")).toLeftOf(baseEle)))
		.build().perform();
		
		
		
		
	}

}
