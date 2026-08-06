package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomCSSSelectors {

	static WebDriver driver;
	public static void main(String[] args) {
		//1. id: #id or tag_name#id
		// #input-email
		// input#input-email
		
		//2. class: .class_name or tag_name.class_name
		// .list-group-item
		// a.list-group-item
		// img.img-responsive
		
//		By image = By.cssSelector("img.img-responsive");
		
		//3. Combination of id and class:
		// #id.class_name    or   tag#id.class_name
		// #input-email.form-control
		// input#input-email.form-control
		
		//4. Combination of class and id:
		// .class_name#id   or  tag_name.class_name#id
		// .form-control#input-email
		// input.form-control#input-email
		
		//5. .class1.class2.class3....classn
		// .ds-flex.ds-cursor-pointer.ds-items-center
		
		//6. tag_name.class1.clas2.class3...classn
		// div.ds-flex.ds-cursor-pointer.ds-items-center
		
		// 7. Combination of id and class name
		// .class1.class2.class3....classn#id  or  tag_name.class1.class2.class3....classn#id
		// #id.class1.class2.class3....classn  or  tag_name#id.class1.class2.class3....classn
		
		
		//.adSlotCnt.ad-slot-cnt.ci-ad-gpt-slot-cnt#ad-incontentnewtop-246589-cnt
		//div.adSlotCnt.ad-slot-cnt.ci-ad-gpt-slot-cnt#ad-incontentnewtop-246589-cnt
		
		//#ad-incontentnewtop-246589-cnt.adSlotCnt.ad-slot-cnt.ci-ad-gpt-slot-cnt
		//div#ad-incontentnewtop-246589-cnt.adSlotCnt.ad-slot-cnt.ci-ad-gpt-slot-cnt
		
		
		//other attributes
		// [attr='value']  or  tag_name[attr='value']
		// [placeholder='E-Mail Address']
		// input[placeholder='E-Mail Address'] -- css
		//  //input[@placeholder='E-Mail Address']  -- xpath
		
		// input[name='email']
		// input[id='input-email']
		
		//Multiple attributes
		// html_tag[attr1='value'][attr2='value'][attr3='value']...
		// input[name='email'][placeholder='E-Mail Address'][type='text']
		// input[name='email'][placeholder='E-Mail Address'][type='text']#input-email
		// input[name='email'][placeholder='E-Mail Address'][type='text'].form-control
		// input[name='email'][placeholder='E-Mail Address'][type='text'].form-control#input-email
		// input[name='email'][placeholder='E-Mail Address'][type='text']#input-email.form-control
		// input#input-email[name='email'][placeholder='E-Mail Address'][type='text'].form-control
		
		
		//contains:
		// tag_name[attr *= 'value']
		// input[placeholder *= 'E-Mail']
		// input[placeholder *= 'Address']
		// input[placeholder *= 'Address']#input-email
		// input[placeholder *= 'Address']#input-email.form-control
		// input[placeholder *= 'Address']#input-email[class *= 'control']
		
		
		// starts-with:
		// tag_name[attr ^= 'value']
		// input[placeholder ^= 'E-Mail']
		// input[id ^= 'input']
		
		
		//ends-with:
		// tag_name[attr $= 'value']
		// input[class $= 'control']
		// input[placeholder $= 'Address']
		
		
		//text in css : Not applicable
		

		//parent to child
		// direct child: >
		// parent_tag > child_tag
		// div.list-group > a
		
		// direct + indirect: space
		// parent_tag child_tag
		// div#content input -- 11 results (direct + indirect)
		// div#content > input  -- 0 result (direct child)
		
		
		//child to parent : Not applicable backward traversing in css, not supported
		
		//sibling - only following sibling can be accessed
		// immediate one following sibling  or following all siblings
		// immediate sibling: + tag_name
		// option[value='Algeria'] + option
		
		// following all siblings: ~ tag_name
		// option[value='Algeria'] ~ option
		
		// Indexing :
		// select#Form_getForm_Country > option:nth-of-type(2)  --2nd index child. You can provide any index
		// select#Form_getForm_Country > option:nth-of-type(n) -- all elements
		
		// select#Form_getForm_Country > option:nth-child(10)
		// select#Form_getForm_Country > option:nth-child(100)
		
		// select#Form_getForm_Country > option:first-child -- first child
		// select#Form_getForm_Country > option:last-child  -- last child
		
		//select#Form_getForm_Country > option:nth-last-child(5)  -- last 5th element
		
		// select#Form_getForm_Country > option:nth-child(n+6)-- get elements from 6th position onwards
		// select#Form_getForm_Country > option:nth-child(5n)
		// select#Form_getForm_Country > option:nth-child(10n)
		// select#Form_getForm_Country > option:nth-child(odd)
		// select#Form_getForm_Country > option:nth-child(even)
		
		// Odd even in xpath:
		//select[@id='Form_getForm_Country']/option[position() mod 2 = 1] -- odd
		//select[@id='Form_getForm_Country']/option[position() mod 2 = 0] -- Even
		
		
		// comma in css:
		// input[name='username'],input[name='password'],.login_button
		
		driver = new ChromeDriver();
		driver.get("https://tdittesting.co.in/tool1/login.php");
		
		By loginFields = By.cssSelector("input[name='username'],input[name='password'],.login_button");
		int loginFieldsCount = driver.findElements(loginFields).size();
		if(loginFieldsCount == 3) {
			System.out.println("All login fields are available -- PASS");
		}
		else {
			System.out.println("FAIL");
		}
		

		
		// not in css:
		// input.form-control:not(input[name='search']) -- exclude one element
		// input.form-control:not(input[name='search'],input#input-firstname)  -- exclude 2 elements
		
		
		//normalize space in xpath:
		//select[@id='Form_getForm_Country']/option[normalize-space()='Angola']
		
		
		
		//                     xpath      vs       css
		//1. Syntax            complex             simple
		//2. Performance       good                good
		//3. text              yes                 N/A
		//4. parent to child   yes                 yes
		//5. child to parent   yes                 N/A
		//6. preceding-sibling yes                 N/A
		//7. following-sibling yes                 yes
		//8. dynamic elements  yes                 yes
		//9. ends-with         N/A                 yes
		//10. space            yes                 N/A
		//11. comma            N/A                 yes
		//12. index            yes                 yes(+1)
		
	}

}
