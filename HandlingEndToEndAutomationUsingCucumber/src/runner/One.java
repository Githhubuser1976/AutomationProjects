package runner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class One {

	public static void main(String[] args) throws FindFailed {
	
		
		
		
		System.setProperty("webdriver.chrome.driver", "E:\\drivers\\chromedriver_win32 (12)\\chromedriver.exe");
	WebDriver 	driver =new ChromeDriver();
	driver.get("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Login.aspx?");
	
	Pattern username =new Pattern("F:\\sikuli\\usernames.png");
	Pattern password =new Pattern("F:\\sikuli\\passwords.png");
	Pattern login =new Pattern("F:\\sikuli\\logins.png");
	
	
	Screen a =new Screen();
	a.type(username,"Tester");
	
	a.type(password,"test");
	
	a.click(login);
	
	

	}

}
