import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.sql.SQLOutput;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class KYBTestclass {
    WebDriver driver;
      public void KYBTestClass(WebDriver driver){
          //WebDriver driver = new ChromeDriver();
          this.driver = driver;
          driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
          driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/main/div/div[1]/div/div[1]/button")).click();
//          WebDriverWait wathaqWait=new WebDriverWait(driver, Duration.ofSeconds(10));
//          WebElement wathaq=wathaqWait.until(ExpectedConditions.presenceOfElementLocated(By.id("registration_id")));
//          wathaq.sendKeys("7001234567");
//          driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div[2]/div/form/button")).click();
          WebDriverWait wait1=new WebDriverWait(driver,Duration.ofSeconds(10));
          System.out.println("Year_invest");
          WebElement Year_invest=wait1.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='kyb_1_8']")));
          System.out.println(Year_invest);
          Year_invest.sendKeys("8");
          WebDriverWait wait2=new WebDriverWait(driver,Duration.ofSeconds(10));
          WebElement Country_invest=wait2.until(ExpectedConditions.presenceOfElementLocated(By.id("pv_id_12")));
          Country_invest.click();
          driver.findElement(By.xpath("//*[contains(text(),'Egypt')]")).click();
          System.out.println("Country invest");
          WebDriverWait wait3=new WebDriverWait(driver,Duration.ofSeconds(15));
          WebElement Country_deal=wait3.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@id='kyb_1_9']//svg")));
          //Country_invest.click();
          JavascriptExecutor js = (JavascriptExecutor) driver;
          js.executeScript("arguments[0].click();", Country_deal);
          System.out.println("invest");
          driver.findElement(By.xpath("//*[contains(text(),'Egypt')]")).click();

      }
}
