//import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.time.Duration;

public class signIn_class {
    WebDriver driver;
    @BeforeTest
    public void goToSignINPage() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://user-dashboard-smartsaving-beta.dafa.sa/sign-in");
    }
        @Parameters({"mobileNumber","pass"})
        @Test
        public void Sign_in (String mobileNumber,String pass)
        {
            driver.findElement(By.id("mobile-number")).sendKeys(mobileNumber);
            driver.findElement(By.id("password")).sendKeys(pass);
            driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/div/div/main/div[2]/form/div[4]/button/span")).click();
            WebDriverWait OTPWait=new WebDriverWait(driver, Duration.ofSeconds(10));
            WebElement otp=OTPWait.until(ExpectedConditions.presenceOfElementLocated(By.id("code")));
            otp.sendKeys("1234");
            WebElement proceedButton= driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/div/div/main/div[2]/form/div[2]/button"));
             proceedButton.click();
        }
    @Test
    public void testFillKYB() throws InterruptedException {
        KYBTestclass a= new KYBTestclass();
        a.KYBTestClass(driver);
    }



}
