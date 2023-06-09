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
public class Homework1Test {
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
  public void homework1() {
    driver.get("https://www.google.com/");
    driver.manage().window().setSize(new Dimension(809, 818));
    driver.findElement(By.name("q")).sendKeys("javaguru");
    driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
    {
      WebElement element = driver.findElement(By.cssSelector("div:nth-child(2) > .tF2Cxc .LC20lb"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    driver.findElement(By.cssSelector("div:nth-child(2) > .tF2Cxc .LC20lb")).click();
    {
      WebElement element = driver.findElement(By.tagName("body"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element, 0, 0).perform();
    }
    driver.findElement(By.linkText("LV")).click();
    driver.findElement(By.cssSelector(".wrapper")).click();
    driver.findElement(By.linkText("Kursi")).click();
    driver.findElement(By.cssSelector(".single-list:nth-child(1) .single-course:nth-child(2) .default-button")).click();
    js.executeScript("window.scrollTo(0,6200)");
    driver.findElement(By.name("form-name")).click();
    driver.findElement(By.name("form-name")).sendKeys("Paula Cvikova");
    driver.findElement(By.name("form-phone")).sendKeys("1111");
    driver.findElement(By.name("form-email")).click();
    driver.findElement(By.name("form-email")).sendKeys("1111");
    driver.findElement(By.cssSelector(".label")).click();
    driver.findElement(By.cssSelector(".checkbox-mark")).click();
    driver.findElement(By.cssSelector(".default-button-submit")).click();
  }
}
