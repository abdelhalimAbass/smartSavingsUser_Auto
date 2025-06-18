package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support. ui. WebDriverWait;
import java.time.Duration;
import java.util.Set;
import org.openqa.selenium.Cookie;

//import static sun.security.jgss.GSSUtil.login;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    String key="";
    String value=System.getProperty("user.dir")+"";
    //System.setproperty(key,value);

    public static void main(String[] args) {
       login();
        // signup();
        //WebDriver driver1= new ChromeDriver();
        //driver1.get("https://user-dashboard-smartsaving-beta.dafa.sa/verify");
        // WebElement nextPageButton = driver.findElement(By.id("next-page-button"));
        //WebDriverWait(driver, 10).until(ExpectedCondition.class((By.id("code"));
        // nextPageButton.click();


    }

    public static void login() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://user-dashboard-smartsaving-beta.dafa.sa/sign-in");
        driver.findElement(By.id("mobile-number")).sendKeys("551266321");
        driver.findElement(By.id("password")).sendKeys("P@ssw0rd");
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/div/div/main/div[2]/form/div[4]/button")).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement fieldInPage2 = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("code")));
        driver.findElement(By.id("code")).sendKeys("1234");
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/div/div/main/div[2]/form/div[2]/button")).click();

        Set<Cookie> cookies = driver.manage().getCookies();
        for (Cookie cookie : cookies) {
            System.out.println(cookie.getName() + ": " + cookie.getValue());
        }
    }

    public static void signup() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://user-dashboard-smartsaving-beta.dafa.sa/sign-up");

        driver.findElement(By.id("phone")).sendKeys("123456789");
        driver.findElement(By.id("password")).sendKeys("Abas123456");
        driver.findElement(By.id("confirm-password")).sendKeys("Abas123456");
        //Select selec = new Select(driver.findElement(By.xpath("//*[@id=\"pv_id_4\"]")));
      //  selec.Click();
        driver.findElement(By.xpath("//*[@id=\"pv_id_3\"]/div")).click();
        WebElement corporateOption = driver.findElement(By.xpath("//*[@id=\"pv_id_3_0\"]"));
        corporateOption.click();
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/div/div/main/div[2]/form/div[5]/div/input")).click();
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/div/div/main/div[2]/form/div[6]/button")).click();
        if (driver.findElement(By.xpath("/html/body/div[2]/div")).isDisplayed()){
            driver.findElement(By.id("password")).sendKeys("Abas$$123456");
        }


    }
}