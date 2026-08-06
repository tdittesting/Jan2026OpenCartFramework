package SeleniumSessions;

import java.util.Arrays;

public class CharSequenceConcepts {

	public static void sendKeys(CharSequence... data) {
		System.out.println(Arrays.toString(data));
	}
	
	public static void main(String[] args) {
		
		String data = "TDIT";
		StringBuilder sb = new StringBuilder("Automation");
		StringBuffer sbf = new StringBuffer("Testing");
		
		sendKeys(data,sb,sbf);
	}

}
