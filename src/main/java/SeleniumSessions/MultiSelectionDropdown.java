package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectionDropdown {

	static WebDriver driver;
	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://html.com/attributes/select-multiple/");
		WebElement dropdownEle = driver.findElement(By.xpath("//select[@multiple]"));
		
		Select select = new Select(dropdownEle);
		System.out.println(select.isMultiple());//true
		
		if(select.isMultiple()) {
			System.out.println("Multi selection is possible");
			select.selectByVisibleText("Andean flamingo");
			select.selectByVisibleText("James's flamingo");
			select.selectByVisibleText("Lesser flamingo");
			select.selectByValue("Greater");
		}
		select.deselectByVisibleText("Greater flamingo");
		select.deselectAll();
		
	}

}
