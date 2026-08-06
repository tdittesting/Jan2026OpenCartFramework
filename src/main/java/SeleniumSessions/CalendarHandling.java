package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarHandling {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		Thread.sleep(3000);
		
		driver.findElement(By.id("datepicker")).click();
		futureDate("April 2026", "31");
//		driver.findElement(By.linkText("17")).click();

	}
	
	public static void futureDate(String expMonYear, String day) {//August 2026
		if(Integer.parseInt(day)>31 || Integer.parseInt(day)<=0) {
			System.out.println("Wrong day is passed, please pass the correct day range between 1 to 31");
			return;
		}
		
		String actMonYear = driver.findElement(By.className("ui-datepicker-title")).getText();
		System.out.println(actMonYear);//June 2026
		
		while(!actMonYear.equalsIgnoreCase(expMonYear)) {
			//click next button
			driver.findElement(By.xpath("//span[text()='Next']")).click();
			actMonYear = driver.findElement(By.className("ui-datepicker-title")).getText();//November 2026
			System.out.println(actMonYear);
		}
		driver.findElement(By.linkText(day)).click();
	}

}
