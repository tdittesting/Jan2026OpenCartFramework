package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDownMiddleValue {

	static WebDriver driver;
	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://orangehrm.com/30-day-free-trial");
		By country = By.id("Form_getForm_Country");
		WebElement cty = driver.findElement(country);
		Select select = new Select(cty);
		int middleIndex = select.getOptions().size()/2;
		select.selectByIndex(middleIndex);
		
		//to select the last element from dropdown
		select.selectByIndex(select.getOptions().size()-1);
		
		//select the first element
		select.selectByIndex(1);
	}

}
