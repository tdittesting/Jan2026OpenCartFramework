package SeleniumSessions;

public class WaitConcept {

	public static void main(String[] args) {
		//wait -> Static wait & Dynamic wait..
		
		// Static wait: Thread.Sleep(10000) - Java library. Asynchronized wait.
		//e1: 2 secs - total timeout : 10 secs - 8secs wasted
		//e2: 0 secs - total timeout : 10 secs - 10secs wasted
		//e3: 15 secs - total timeout : 10 secs - nosuchelement exception
		
		//There is no concept of auto wait mechanism in Selenium
		//Dynamic wait: Synchnozied between your script/code v/s application
		//10 secs - 2 secs --> 2secs : saved 8 secs
		//10 secs - 15 secs --> 10secs - U will get nosuchelement exception after 10secs
			//a. implicitly wait
			//b. explicit wait
				//b.1: WebDriverWait
				//b.2: FluentWait

	}

}
