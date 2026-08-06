package SeleniumSessions;

public class StringCharSequenceConcept {

	public static void main(String[] args) {
		
		String s1 = "java";
		String s2 = new String("java");
		String s3 = new String("playwright");
		String s4 = "playwright";
		
		String str = "Automation";
		str.concat("Testing");
		System.out.println(str);
		
		//StringBuffer and StringBuilder
		StringBuilder sb = new StringBuilder("selenium");
		sb.append("Testing");
		System.out.println(sb);
		
		System.out.println("-------------");
		
		StringBuffer sbf = new StringBuffer("Cypress");
		sbf.append("API");
		System.out.println(sbf);
	}

}
