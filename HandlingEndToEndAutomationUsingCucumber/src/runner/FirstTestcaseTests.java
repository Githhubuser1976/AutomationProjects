// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class FirstTestcaseTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void firstTestcase() {
    driver.get("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Login.aspx");
    driver.manage().window().setSize(new Dimension(1323, 720));
    driver.findElement(By.cssSelector(".login")).click();
    driver.findElement(By.id("ctl00_MainContent_username")).click();
    driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
    driver.findElement(By.id("ctl00_MainContent_password")).click();
    driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
    driver.findElement(By.id("ctl00_MainContent_login_button")).click();
    driver.findElement(By.id("ctl00_MainContent_login_button")).click();
    driver.findElement(By.linkText("Order")).click();
    driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtName")).click();
    driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtName")).sendKeys("babu");
    driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox2")).sendKeys("chennai");
    driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox3")).sendKeys("chennai");
    driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox4")).sendKeys("tamilnadu");
    driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox5")).sendKeys("69");
    driver.findElement(By.id("ctl00_MainContent_fmwOrder_cardList_0")).click();
    driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox6")).click();
    driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox6")).sendKeys("444r4");
    driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox1")).click();
    driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox1")).sendKeys("66");
    driver.findElement(By.id("ctl00_MainContent_fmwOrder_InsertButton")).click();
  }
}