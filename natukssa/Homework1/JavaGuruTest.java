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
public class JavaGuruTest {
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
  public void javaGuru() {
    driver.get("https://www.google.com/search?q=javaguru&sxsrf=AJOqlzXsYP-273Ml_m1QKhPoyZLsm8IKRQ%3A1678821551888&source=hp&ei=r8gQZNHmM5aUrwTYjJqoAw&iflsig=AK50M_UAAAAAZBDWv0WK8swHM1R1DDRB7ejMX5UJ4VEj&ved=0ahUKEwiR-vTRkdz9AhUWyosKHViGBjUQ4dUDCAg&uact=5&oq=javaguru&gs_lcp=Cgdnd3Mtd2l6EAMyAggmOgQIABBDOgUIABCABDoLCAAQgAQQsQMQgwE6DgguEIAEELEDEMcBENEDOggIABCABBCxAzoPCAAQgAQQsQMQgwEQChABOgcIABCABBAKUABY6ApgnyZoAHAAeACAAWyIAZ4FkgEDNi4ymAEAoAEB&sclient=gws-wiz");
    driver.manage().window().setSize(new Dimension(1280, 720));
    js.executeScript("window.scrollTo(0,400)");
    driver.findElement(By.cssSelector("div:nth-child(2) > .tF2Cxc .LC20lb")).click();
    driver.findElement(By.cssSelector(".home-courses-button > .default-button")).click();
    driver.findElement(By.linkText("Курс QA 2.0.")).click();
    driver.findElement(By.cssSelector(".benefit-button > .default-button")).click();
    driver.findElement(By.name("form-name")).click();
    driver.findElement(By.name("form-name")).sendKeys("*76asdjKASHd");
    driver.findElement(By.name("form-code")).click();
    driver.findElement(By.name("form-code")).sendKeys("+371dfas");
    driver.findElement(By.name("form-phone")).click();
    driver.findElement(By.name("form-phone")).sendKeys("dasda");
    driver.findElement(By.name("form-email")).click();
    driver.findElement(By.name("form-email")).click();
    driver.findElement(By.name("form-email")).sendKeys("Asjd@dasjod.com");
    driver.findElement(By.cssSelector(".label")).click();
    driver.findElement(By.cssSelector(".last")).click();
    driver.findElement(By.cssSelector(".checkbox-mark > img")).click();
    driver.findElement(By.cssSelector(".default-button-submit")).click();
  }
}
