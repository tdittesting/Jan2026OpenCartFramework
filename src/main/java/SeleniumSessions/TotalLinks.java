package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalLinks {

	public static void main(String[] args) {
		//Find total number of links on the page..
		//Print the text of each link on the console
		//html tag <a>
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.redbus.com/");
		
		By links = By.tagName("a");
		ElementUtil eleUtil = new ElementUtil(driver);
		int linkCount = eleUtil.getElementsCount(links);
		if(eleUtil.getElementsCount(links)>160) {
			System.out.println("Proper links present -- Pass");
		}
		System.out.println("---------------");
		List<String> linkTextList = eleUtil.getElementTextList(links);
		if(linkTextList.contains("Plovdiv to Sofia Bus")) {
			System.out.println("Pass");
		}
		
		
//		List<WebElement> linksList = driver.findElements(By.tagName("a"));
//		System.out.println("Total Links: "+linksList.size());
		
		//For loop using index
//		for(int i=0;i<linksList.size();i++) {
//			String text = linksList.get(i).getText();
//			if(text.length()!=0) {
//			System.out.println(text);
//			}
//		}
		
		//for each loop
//		for(WebElement e:linksList) {
//			String text = e.getText();
//			if(text.length()!=0) {
//				System.out.println(text);
//			}
//		}

	}

}
