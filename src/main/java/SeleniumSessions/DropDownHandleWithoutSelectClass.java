package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDownHandleWithoutSelectClass {

	static WebDriver driver;
	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://orangehrm.com/30-day-free-trial");
//		By country = By.id("Form_getForm_Country");
		
		//no select class to be used..
		
		List<WebElement> optionsList = driver.findElements(By.cssSelector("select#Form_getForm_Country > option"));
		System.out.println(optionsList.size());//233
		
		for(WebElement e: optionsList) {
			String text = e.getText();
//			System.out.println(text);
			if(text.equals("Turkey")) {
				e.click();
				break;
			}
		}
		

	}

}
