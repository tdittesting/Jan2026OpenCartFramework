package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalMenuLinks {
	static WebDriver driver;
	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
//		List<WebElement> menuLinksList = driver.findElements(By.className("list-group-item"));
//		System.out.println(menuLinksList.size());
//		
//		for(WebElement e:menuLinksList) {
//			String text = e.getText();
//			if(text.equals("Register")) {
//				System.out.println(text);
//				e.click();
//				break;
//			}
//		}

		By menuLinks = By.className("list-group-item");
		if(getElementCount(menuLinks)==13) {
			System.out.println("Menu links matched with expected item -- Pass");
		}
		else {
			System.out.println("Menu links count not correct - Fail");
		}
		
		List<String> actMenuList = getElementTextList(menuLinks);
		if(actMenuList.contains("My Account")) {
			System.out.println("Pass");
		}
		if(actMenuList.contains("Order History")) {
			System.out.println("Pass");
		}
	}
	
	public static List<String> getElementTextList(By Locator) {
		List<WebElement> eleList = getElements(Locator);
		List<String> eleTextList = new ArrayList<String>();
		for(WebElement e:eleList) {
			String text = e.getText();
			if(text.length()!=0) {
				System.out.println(text);
				eleTextList.add(text);
			}
		}
		return eleTextList;
	}
	
	public static int getElementCount(By Locator) {
		int eleCount = getElements(Locator).size();
		System.out.println("Element count ==>" + eleCount);
		return eleCount;
	}
	
	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}

}
