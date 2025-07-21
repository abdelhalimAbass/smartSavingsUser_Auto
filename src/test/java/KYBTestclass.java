import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.sql.SQLOutput;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class KYBTestclass {
    WebDriver driver;

    public void KYBTestClass(WebDriver driver) throws InterruptedException {
        //WebDriver driver = new ChromeDriver();
        this.driver = driver;
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/main/div/div[1]/div/div[1]/button")).click();

        WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
        System.out.println("Year_invest");
        WebElement Year_invest = wait1.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='kyb_1_8']")));
        System.out.println(Year_invest);
        Year_invest.sendKeys("8");
        WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement Country_invest = wait2.until(ExpectedConditions.presenceOfElementLocated(By.id("pv_id_12")));
        Country_invest.click();
        driver.findElement(By.xpath("//*[contains(text(),'Egypt')]")).click();
        System.out.println("Country invest");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        WebElement svgIcon = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//*[local-name()='svg' and ancestor::div[@id='kyb_1_9']]")));
        svgIcon.click();
        driver.findElement(By.xpath("//*[contains(text(),'Saudi Arabia')]")).click();
        driver.findElement(By.xpath("//*[contains(text(),'Less than 1000')]")).click();
        driver.findElement(By.id("headlessui-radiogroup-option-6")).click();
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/main/div/div/form/div[9]/div/button")).click();
        WebDriverWait wait4 = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement page2 = wait4.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[contains(text(),'Medium')]")));
        page2.click();
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/main/div/div/form/div[5]/div/button[2]")).click();

        System.out.println("print anything");
        driver.findElement(By.xpath("//*[local-name()='svg' and ancestor::div[@id='pv_id_20']]")).click();
        driver.findElement(By.xpath("//*[contains(text(),'Iraq')]")).click();


        WebDriverWait wait5 = new WebDriverWait(driver, Duration.ofSeconds(15));

        List<WebElement> inputs = wait5.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("input.p-inputtext")));
        inputs.get(0).sendKeys("شركه تكنولوجيا المعلومات");
        inputs.get(1).sendKeys("second input");


    }
}
