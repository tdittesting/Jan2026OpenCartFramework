package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleLanguageTest {
	
	static WebDriver driver;
	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
//		List<WebElement> langLinksList = driver.findElements(By.xpath("//div[@id=\"SIvCob\"]/a"));
//		System.out.println(langLinksList.size());
//		for(WebElement e: langLinksList) {
//			String text = e.getText();
//			System.out.println(text);
//			if(text.equals("हिन्दी")) {
//				e.click();
//				break;
//			}
//		}
		
		By langLocator = By.xpath("//div[@id=\"SIvCob\"]/a");
		clickElement(langLocator,"हिन्दी");
		
		

	}
	
	public static void clickElement(By locator, String value) {
		List<WebElement> eleList = driver.findElements(locator);
		System.out.println(eleList.size());
		for(WebElement e:eleList) {
			String text = e.getText();
			System.out.println(text);
			if(text.contains(value)) {
				e.click();
				break;
			}
		}
	}

}
