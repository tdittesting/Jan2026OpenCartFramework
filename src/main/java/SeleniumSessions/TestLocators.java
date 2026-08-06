package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestLocators {
	
	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://tdittesting.co.in/tool1/login.php");
//		driver.findElement(By.linkText("Links")).click();
//		driver.findElement(By.linkText("Home")).click();
		
		//No of attributes..
		//1. id: Unique attribute - Pref # 1
		//seen multiple examples for By.id
		
		//2. name: attribute - Can be duplicate ; Approach is similar as that of id - Pref # 2
		driver.findElement(By.name("username")).sendKeys("sump1");
		driver.findElement(By.name("password")).sendKeys("techfin@12");
		driver.findElement(By.name("login")).click();
//		driver.findElement(By.linkText("Add Security")).click();
		
		//3. class name: attribute : can be duplicate (most of the time it can be duplicate) - Pref # 3 (if it is unique)
//		driver.findElement(By.className("form-control")).sendKeys("TATA123");
//		driver.findElement(By.className("main")).click();
		
		//4. xpath : It is not an attribute: Address of the element in DOM
//		driver.findElement(By.xpath("//*[@id=\"acc_number\"]")).sendKeys("101023");
//		driver.findElement(By.xpath("//*[@id=\"myInput\"]")).sendKeys("Tata123");
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/form/input[3]")).sendKeys("10");
		
		//5. cssSelector: Not an attribute
//		driver.findElement(By.cssSelector("#acc_number")).sendKeys("112233");
//		driver.findElement(By.cssSelector("#myInput")).sendKeys("RELIND");
//		driver.findElement(By.cssSelector("body > div.main > div.buy > form > input[type=number]:nth-child(6)")).sendKeys("50");
		
		//6. linkText: only for links
		//htmltag: <a> with attribute as href
//		driver.findElement(By.linkText("Add Security")).click();
		
		//7.partialLinkText: Only for links
//		driver.findElement(By.partialLinkText("View")).click();
		
		//8.tagName:
//		String header = driver.findElement(By.tagName("h2")).getText();
//		System.out.println(header);
		
		By header = By.tagName("h2");
		String actHeader = doElementGetText(header);
		
		if(actHeader.equals("TDIT Solutions")) {
			System.out.println("Correct header -- Pass");
		}
		
		
		
	}
	
	public static String doElementGetText(By locator) {
		String eleText = getElement(locator).getText();
		System.out.println("Element text ==>"+eleText);
		return eleText;
	}
	
	
	private static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

}
