package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsUseCases {
	static WebDriver driver;
	public static void main(String[] args) {
		//Diff of findElement v/s findElements:
		//One element v/s one or multiple elements
		//Return type: WebElement v/s List WebElement
		//if incorrect locator passed: exception v/s empty list
		
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
//		List<WebElement> eleList = driver.findElements(By.name("username"));
//		System.out.println(eleList.size());
		
//		By un = By.name("username_11");
//		System.out.println(checkElementDisplayed(un));
		
		By forgotPwdLink = By.linkText("Forgotten Password");
		if(checkElementDisplayed(forgotPwdLink, 2)) {
			System.out.println("Forgotton password present 2 times on page -- Pass");
		}

	}
	
	public static boolean checkElementDisplayed(By Locator) {
		if(getElements(Locator).size()==1) {
			System.out.println("Element: "+Locator+" is displayed on the page one time");
			return true;
		}
		return false;
	}
	
	public static boolean checkElementDisplayed(By Locator,int expElementCount) {
		if(getElements(Locator).size()==expElementCount) {
			System.out.println("Element: "+Locator+" is displayed on the page "+expElementCount+ " times");
			return true;
		}
		return false;
	}
	
	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}

}
