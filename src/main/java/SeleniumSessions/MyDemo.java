package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MyDemo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://html.com/attributes/select-multiple/");
//		driver.findElement(By.className("mr-sm-2 form-control")).sendKeys("sump1@gmail.com");
//		driver.findElement(By.name("username")).sendKeys("sump1");
//		driver.findElement(By.name("password")).sendKeys("techfin@12");
//		driver.findElement(By.name("login")).click();
//		driver.findElement(By.linkText("Add Security")).click();
//		driver.findElement(By.className("form-control")).sendKeys("TATA123");
//		driver.findElement(By.className("btn-primary")).click();
//		driver.findElement(By.xpath("//*[@id=\"myInput\"]")).sendKeys("TATA123");
		
		
//		driver.findElement(By.name("Select Home")).click();
		
//		driver.findElement(By.id("userName")).sendKeys("TDIT");
//		driver.findElement(By.id("userEmail")).sendKeys("TDIT@gmail.com");
//		driver.findElement(By.id("currentAddress")).sendKeys("Warje");
//		driver.findElement(By.id("permanentAddress")).sendKeys("Warje");
//		driver.findElement(By.name("submit")).click();
		

			driver.get("https://html.com/attributes/select-multiple/");
			WebElement dropDownEle = driver.findElement(By.xpath("//select[@multiple]"));
			Select select = new Select(dropDownEle);

			System.out.println(select.isMultiple());//true
			if(select.isMultiple()) {
			System.out.println("multi selection is possible ... ");
			select.selectByVisibleText("American flamingo");
			select.selectByVisibleText("Chilean flamingo");
			select.selectByVisibleText("Lesser flamingo");
			select.selectByVisibleText("James's flamingo");
			}
	
	}
}
