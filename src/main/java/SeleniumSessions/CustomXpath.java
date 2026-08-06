package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomXpath {

	static WebDriver driver;
	public static void main(String[] args) {
		//xpath: address of the element in the html DOM
		//not an attribute
		
		//1. Absolute xpath: /
		//html/body/div/div[2]/ul/li[2]/div/div/input
		// /html/body/div/form/div/input[1]
		
		
		//2. relative xpath / custom xpath: //
		//htmltag[@attr='value']
		//input[@name='username']
		//input[@placeholder='Enter Username']
		
		//If i want to use multiple attributes:
		//htmltag[@attr1='value' and @attr2='value' and @attr3='value'...]
		//input[@type='text' and @placeholder='Enter Username' ]
		//input[@type='text' and @placeholder='Enter Username' and @name='username']
		
		//input[@type and @placeholder and @name]
		
		//parent to child:
		//direct association: / --> direct
		//indirect association: // --> Works for direct+indirect
		
		//footer//a
		//footer//h5
		
		//form/input --> 3
		//form//input --> 5
		
		
		//div[@class = 'practice-form-wrapper']/form//input[@id='firstName']
		//div[@class = 'practice-form-wrapper']/form//input[@placeholder='First Name']
		
		
		//select[@name='Country']/option
		
		
		//text(): p, links, span, div, header h1,h2,h3
		//h2[text()='New Customer']
		//h2[text()='Returning Customer']
		//a[text()='Reward Points']
		//label[text()='E-Mail Address']
		
		
		//text() and attribute:
		//htmltag[@attr='value' and text()='value']
		//htmltag[text()='value' and @attr='value']
		
		//label[@for='input-email' and text()='E-Mail Address']
		//label[text()='E-Mail Address' and @class='control-label']
		//a[@class='list-group-item' and text()='Recurring payments']
		
		//htmltag[@attr1='value' and @attr2 = 'value' and text()='value']
		
		
		//contains():partial attribute, partial text value
		//htmltag[contains(text(),'value')]
		//h2[contains(text(),'New')]
		//h2[contains(text(),'Returning')]
		
		//p[contains(text(),'previously made')]
		
		//htmltag[contains(@attr,'value')]
		//input[contains(@placeholder,'E-Mail')]
		//input[contains(@id,'email')]
		
		
		//htmltag[contains(@attr,'value') and contains(text(),'value')]
		//a[contains(@href,'?route=account/recurring') and contains(text(),'payments')]
		
		//htmltag[contains(@attr1,'value') and contains(@attr2,'value')]
		//a[contains(@href,'?route=account/recurring') and contains(@class,'list')]
		
		//htmltag[contains(@attr1,'value') and contains(@attr2,'value') and contains(text(),'value')]
		//a[contains(@href,'?route=account/recurring') and contains(@class,'list') and contains(text(),'payments')]

		//When to use contains:
		//1. Text is lengthy
		//2. Dynamic attributes(name, id, class) /text- This may change whenever your screen refresh
		
//		<input id = "firstname_123">
//		<input id = "firstname_456">
//		<input id = "firstname_567">
		
		By.id("firstname_123");//won't work..
		By.xpath("//input[contains(@id,'firstname_')]");
		
		//<div>your order id is 12345</div>
		By order = By.xpath("//div[contains(text(),'your order id is')]");
//		String orderText = driver.findElement(order).getText();
		//orderText = your order id is 12345
		
		
		//starts-with();
		//htmltag[starts-with(@attr,'value')]
		//htmltag[starts-with(text(),'value')]
		
		//p[starts-with(text(),'By creating an account')]
		//for scenario below - If you're very particular to have text with starting keyword match, use starts-with
		//Your order id is: 12345
		//Congratulations!! - Get more discount on Your order id
		
		
		//starts-with() and contains()
		//htmltag[starts-with(@attr,'value') and contains(@attr,'value')]
		
		
		// index in xpath:
		// (//a[text()='Forgotten Password'])[1]
		// (//a[text()='Forgotten Password'])[2]
		
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
//		driver.findElement(By.xpath("(//a[text()='Forgotten Password'])[1]")).click();
		
		// (//form//input[@class='form-control'])[last()]
		// (//form//input[@class='form-control'])[last()-1]
		
		// (//form//input[@class='form-control'])[position()=1]
		// (//form//input[@class='form-control'])[position()=last()]
		
		//Scenario: Capture last column, last link in amazon footer.
//		driver.findElement(By.xpath("((//div[contains(@class,'navFooterLinkCol')])[last()]//a)[last()]")).isDisplayed();
		
		// (//a[@class='list-group-item'])[1]
		// (//a[@class='list-group-item'])[last()]
		
		// (//select[@id='Form_getForm_Country']/option)[4]
		// (//select[@id='Form_getForm_Country']/option)[last()]
		
	}

}
