package spoke12988.Homework1;// Generated by Selenium IDE
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
public class FromgoogletojavaguruTest {
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
  public void fromgoogletojavaguru() {
    driver.get("https://www.google.com/");
    driver.manage().window().setSize(new Dimension(958, 1039));
    driver.findElement(By.name("q")).click();
    driver.findElement(By.name("q")).sendKeys("javaguru.lv");
    driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
    driver.findElement(By.cssSelector(".tF2Cxc > .yuRUbf .LC20lb")).click();
    driver.findElement(By.cssSelector(".themes-block-2")).click();
    driver.findElement(By.cssSelector(".reversed-default-button")).click();
    driver.findElement(By.cssSelector(".accordion-tab:nth-child(1) .status-closed")).click();
    driver.findElement(By.cssSelector("#tab-0 li:nth-child(1)")).click();
    driver.findElement(By.cssSelector(".accordion-tab:nth-child(2) .status")).click();
    driver.findElement(By.cssSelector(".accordion-tab:nth-child(3) .status-closed")).click();
    driver.findElement(By.cssSelector(".collapsed .status-closed")).click();
    driver.findElement(By.name("form-name")).click();
    driver.findElement(By.name("form-name")).sendKeys("132277");
    driver.findElement(By.name("form-email")).click();
    driver.findElement(By.name("form-email")).sendKeys("132277");
    driver.findElement(By.name("form-phone")).click();
    driver.findElement(By.name("form-phone")).sendKeys("132277");
    driver.findElement(By.cssSelector(".label")).click();
    driver.findElement(By.cssSelector(".last")).click();
    driver.findElement(By.cssSelector(".checkbox-mark > img")).click();
    driver.findElement(By.cssSelector(".default-button-submit")).click();
  }
}