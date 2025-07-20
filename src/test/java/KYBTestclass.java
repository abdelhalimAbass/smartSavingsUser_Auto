import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class KYBTestclass {
    WebDriver driver;
      public void KYBTestClass(WebDriver driver){
          //WebDriver driver = new ChromeDriver();
          this.driver = driver;
          driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
          driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/main/div/div[1]/div/div[1]/button")).click();
          WebDriverWait wathaqWait=new WebDriverWait(driver, Duration.ofSeconds(10));
          WebElement wathaq=wathaqWait.until(ExpectedConditions.presenceOfElementLocated(By.id("registration_id")));
          wathaq.sendKeys("7001234567");
          driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div[2]/div/form/button")).click();

      }
}
