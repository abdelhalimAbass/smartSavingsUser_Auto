import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class KYBTestclass {
    WebDriver driver;
      public void KYBTestClass(WebDriver driver){
          //WebDriver driver = new ChromeDriver();
          this.driver = driver;
          driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
          driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/main/div/div[1]/div/div[1]/button")).click();

      }
}
