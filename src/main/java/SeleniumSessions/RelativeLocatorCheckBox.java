package SeleniumSessions;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class RelativeLocatorCheckBox {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		WebElement ele = driver.findElement(By.cssSelector("a.agree"));
		
		driver.findElement(with(By.name("agree")).toRightOf(ele)).click();
		
		String msg = driver.findElement(with(By.tagName("div")).near(ele)).getText();
		System.out.println(msg);
	}

}
