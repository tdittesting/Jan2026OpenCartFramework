package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementEnabledDisabledSelected {

	static WebDriver driver;
	public static void main(String[] args) {
		
		//isDisplayed / isEnabled / isSelected
		
		driver = new ChromeDriver();
		driver.get("https://seleniumpractise.blogspot.com/2016/09/how-to-work-with-disable-textbox-or.html");
		WebElement password = driver.findElement(By.id("pass"));
		
		boolean f1 = password.isDisplayed();
		System.out.println(f1);//true
	
		
		boolean f2 = password.isEnabled();
		System.out.println(f2);//false
		
		System.out.println("-------------------------");
		
		driver.navigate().to("https://demoqa.com/automation-practice-form");
		WebElement gendermale = driver.findElement(By.id("gender-radio-1"));
		
		System.out.println(gendermale.isSelected());//false
		gendermale.click();
		
		System.out.println(gendermale.isSelected());//true

	}

}
