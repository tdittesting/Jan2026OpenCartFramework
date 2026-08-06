package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementClassConcept {

	static WebDriver driver;
	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://app.hubspot.com/login");
		
		//1. By.class name - Multiple class or compound class : InvalidSelectorException
//		driver.findElement(By.className("TextInput__StyledInput-dZxQPg eaGEy")).sendKeys("tdit@gmail.com");
		
		//2. css selector - valid
//		driver.findElement(By.cssSelector("input.TextInput__StyledInput-dZxQPg.eaGEy")).sendKeys("tdit@mail.com");
		
		//3. xpath
//		driver.findElement(By.xpath("//input[@class = 'TextInput__StyledInput-dZxQPg eaGEy']")).sendKeys("tdit@mail.com");
		
		//4. One classname
//		driver.findElement(By.className("TextInput__StyledInput-dZxQPg")).sendKeys("tdit@mail.com");
		
		//5. 
		driver.findElement(By.xpath("///@@TxtPatter_11")).sendKeys("tdit@mail.com");
		
		
	}

}
