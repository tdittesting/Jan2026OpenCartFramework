package SeleniumSessions;


import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDownHandle {
	
	static WebDriver driver;
	public static void main(String[] args) {
		//dropdown:
		//htmltag: <select>  ---> Select class -- default class in selenium
		//select -- option
		//option - value; text
		//option - text
		
		driver = new ChromeDriver();
		driver.get("https://orangehrm.com/30-day-free-trial");
		
		By country = By.id("Form_getForm_Country");
//		WebElement cty = driver.findElement(By.id("Form_getForm_Country"));

		By month = By.id("input_7_month");
		By day = By.id("input_7_day");
		By year = By.id("input_7_year");
		
//		WebElement monEle = driver.findElement(month);
//		WebElement dayEle = driver.findElement(day);
//		WebElement yearEle = driver.findElement(year);
//		
//		Select select1 = new Select(monEle);
//		select1.selectByIndex(7);
//		
//		Select select2 = new Select(dayEle);
//		select2.selectByValue("17");
//		
//		Select select3 = new Select(yearEle);
//		select3.selectByVisibleText("2020");
		
//		doSelectDropDownByIndex(month, 6);
//		doSelectDropDownByValue(day, "20");
//		doSelectDropDownByValue(year, "2021");
		
//		boolean flag = doSelectDropDownByVisibleText(country, "TDIT");
//		System.out.println(flag);
		
		doSelectDropDownByIndex(country, 400);
		
	}
	
	private static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static boolean doSelectDropDownByIndex(By locator,int index) {
		Select select = new Select(getElement(locator));
		try {
		select.selectByIndex(index);
		return true;
		}
		catch(NoSuchElementException e) {
			System.out.println(index+" is not present in the dropdown");
			return false;
		}
	}
	
	public static boolean doSelectDropDownByValue(By locator,String value) {
		Select select = new Select(getElement(locator));
		try {
		select.selectByValue(value);
		return true;
		}
		catch(NoSuchElementException e) {
			System.out.println(value+" is not present in the dropdown");
			return false;
		}
		
	}
	
	public static boolean doSelectDropDownByVisibleText(By locator,String text) {
		Select select = new Select(getElement(locator));
		try {
		select.selectByVisibleText(text);
		return true;
		}
		catch(NoSuchElementException e) {
			System.out.println(text+" is not present in the dropdown");
			return false;
		}
	}

}
