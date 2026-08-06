package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementDisplayed {

	static WebDriver driver;
	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://tdittesting.co.in/tool1/login.php");
		
//		WebElement un = driver.findElement(By.name("usernameun"));
		
//		boolean b1 = un.isDisplayed();
//		System.out.println(b1);
		
//		boolean b1 = driver.findElement(By.name("usernameun")).isDisplayed();
//		System.out.println(b1);
		
//		By un = By.name("usernameun");
		By logo = By.tagName("h2");
		
		if(isElementDisplayed(logo)) {
			System.out.println("Element displayed -- PASS");
		}
		else {
			System.out.println("Element not displayed -- FAIL");
		}

	}
	
	public static boolean isElementDisplayed(By locator) {
		try {
			return getElement(locator).isDisplayed();
		}
		catch (NoSuchElementException e) {
			System.out.println("Element is not present on page");
			return false;
		}
		
	}
	
	private static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

}
