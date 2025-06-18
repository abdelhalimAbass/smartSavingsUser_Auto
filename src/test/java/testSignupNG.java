import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class testSignupNG {
    WebDriver driver; // 👈 هنا بنعرف driver عام على مستوى الكلاس

    @BeforeTest
    public void goToSignupPage() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://user-dashboard-smartsaving-beta.dafa.sa/sign-up");
    }

    @Parameters({"phoneNumber", "password"})
    @Test
    public void signUp(String phoneNumber, String password) {
        driver.findElement(By.id("phone")).sendKeys(phoneNumber);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.id("confirm-password")).sendKeys(password);

        driver.findElement(By.xpath("//*[@id=\"pv_id_3\"]/div")).click();
        WebElement corporateOption = driver.findElement (By.id("pv_id_3_1"));
        corporateOption.click();

        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/div/div/main/div[2]/form/div[5]/div/input")).click();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/div/div/main/div[2]/form/div[6]/button")).click();
        driver.findElement(By.id("code")).sendKeys("1234");
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/div/div/main/div[2]/form/div[2]/button")).click();
        try {
            if (driver.findElement(By.xpath("/html/body/div[2]/div")).isDisplayed()) {
                driver.findElement(By.id("password")).clear();
                driver.findElement(By.id("password")).sendKeys("Abas$$123456");
            }
        } catch (NoSuchElementException e) {
            System.out.println("No error popup displayed.");
        }
    }
    @Test
    public void testFillKYB(){
        KYBTestclass a= new KYBTestclass();
        a.KYBTestClass(driver);
    }

//    @AfterTest
//    public void closeBrowser() {
//        if (driver != null) {
//            driver.quit();
//        }
//    }
    //556677987
}
