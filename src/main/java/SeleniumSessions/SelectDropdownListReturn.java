package SeleniumSessions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropdownListReturn {
	
	static WebDriver driver;
	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://www.jotform.com/42382403598964");
		By month = By.id("input_7_month");
		By day = By.id("input_7_day");
		By year = By.id("input_7_year");
		
		List<String> actMonList = getDropDownValueList(month);
		System.out.println(actMonList);
		
		List<String> expMonList = Arrays.asList("January","February","July","TDIT");
		System.out.println(expMonList);
		
		if(actMonList.containsAll(expMonList)) {
			System.out.println("Pass");
		}
		else {
			System.out.println("Fail");
		}

	}

	public static List<String> getDropDownValueList(By locator) {
		Select select = new Select(driver.findElement(locator));
		List<WebElement> optionsList = select.getOptions();
		System.out.println(optionsList.size());
		
		List<String> optionsValList = new ArrayList<String>();//pc=0
		
		for(WebElement e: optionsList) {
			String text = e.getText();
			optionsValList.add(text.trim());
		}
		
		return optionsValList;
	}
}
