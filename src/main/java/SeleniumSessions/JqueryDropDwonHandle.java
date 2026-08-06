package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JqueryDropDwonHandle {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		Thread.sleep(2000);
		By choice = By.id("justAnInputBox");
		By choiceList = By.xpath("(//div[@class='comboTreeDropDownContainer'])[1]//li/span[@class='comboTreeItemTitle']");
		
		//TC_1: Single selection
//		selectChoice(choice,choiceList,"choice 2 3");
		
		//TC_2: Multiple selection
		selectChoice(choice, choiceList, "choice 1","choice 2 3","choice 3");
		selectChoice(choice, choiceList, "choice 1","choice 2 3","choice 3");
		
		//TC_3: 
//		selectChoice(choice, choiceList, "all");
		
	}
	
	/**
	 * This method is used to select the choices with three different use cases:
	 * 1. Single selection: Ex - selectChoice(choice,choiceList,"choice 2 3");
	 * 2. Multiple selection: Ex - selectChoice(choice, choiceList, "choice 1","choice 2 3","choice 3","choice 7");
	 * 3. All selection: Use "all/All/ALL" to select the all choices.. Ex- selectChoice(choice, choiceList, "all");
	 * @param choice
	 * @param choiceList
	 * @param choiceValue
	 * @throws InterruptedException
	 */
	
	public static void selectChoice(By choice,By choiceList, String... choiceValue) throws InterruptedException{
		driver.findElement(choice).click();
		Thread.sleep(2000);
		
		List<WebElement> choices = driver.findElements(choiceList);
		System.out.println(choices.size());
		
		if(choiceValue[0].equalsIgnoreCase("all")) {
			//logic to select all choices
			for(WebElement e:choices) {
				e.click();
			}
		}
		else {
			for(WebElement e:choices) {
				String text = e.getText();
				System.out.println(text);
				
					for(String value:choiceValue) {
						if(text.trim().equals(value)) {
							e.click();
							break;
						}
					}
			}
		}
	}
}
