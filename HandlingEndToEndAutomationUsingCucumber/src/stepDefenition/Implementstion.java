package stepDefenition;

import java.io.FileInputStream;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Implementstion {

	 
	

@Given("^open the browser$")
public void open_the_browser() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
 
	FileInputStream fis =new FileInputStream("C:\\Users\\User\\eclipse-workspace\\HandlingEndToEndAutomationUsingCucumber\\src\\configuration\\ObjectRepository.properties");
	
	 prop =new Properties();
	
	prop.load(fis);

	
	
	System.setProperty("webdriver.chrome.driver", "E:\\drivers\\chromedriver_win32 (12)\\chromedriver.exe");
	driver =new ChromeDriver();
	
}

@Before("@selenium")
public void openLog()
{
	
}


@After
public void closeLog()
{
	
}



@When("^enter username$")
public void enter_username() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
  
	driver.findElement(By.xpath(prop.getProperty("username"))).sendKeys("Tester");
}





@When("^naviage into the application$")
public void naviage_into_the_application(DataTable data) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    // For automatic transformation, change DataTable to one of
    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
    // E,K,V must be a scalar (String, Integer, Date, enum etc)
   
	List<Map<String,String>> allDatas =data.asMaps(String.class,String.class);
	driver.get(allDatas.get(0).get("url"));
}

@When("^i enter username and password$")
public void i_enter_username_and_password(DataTable data) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    // For automatic transformation, change DataTable to one of
    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
    // E,K,V must be a scalar (String, Integer, Date, enum etc)
 List<Map<String,String>> allData =data.asMaps(String.class, String.class);
 
 driver.findElement(By.xpath(prop.getProperty("username"))).sendKeys(allData.get(0).get("username"));
 
 driver.findElement(By.xpath(prop.getProperty("password"))).sendKeys(allData.get(0).get("password"));
 
 
}





@When("^enter password$")
public void enter_password() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
   
	driver.findElement(By.xpath(prop.getProperty("password"))).sendKeys("test");
}

@When("^click login$")
public void click_login() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
   
	driver.findElement(By.xpath(prop.getProperty("loginbutton"))).click();
}

@Then("^verify login is sucess$")
public void verify_login_is_sucess() throws Throwable {
    // Write code here that turns the phrase above into concrete actions

}


}
