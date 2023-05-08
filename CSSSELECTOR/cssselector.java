package amazon;

import AppUtils.Utils1;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.io.IOException;

import static AppUtils.Utils1.ConfigReader.*;

@Test

public class cssselector
        
{
    public static void main(String[] args) throws InterruptedException, IOException {
    WebDriverManager.chromedriver().setup();
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.get(getUrlMethod());
        driver.findElement(By.cssSelector("#nav-link-accountList-nav-line-1")).click();
        driver.findElement(By.cssSelector("#ap_email")).sendKeys(getMnumber());
        driver.findElement(By.cssSelector("body > div:nth-child(4) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > form:nth-child(1) > div:nth-child(7) > div:nth-child(1) > div:nth-child(1) > div:nth-child(4) > span:nth-child(1) > span:nth-child(1) > input:nth-child(1)")).click();


        driver.findElement(By.cssSelector("#ap_password")).sendKeys(getPassword());
        driver.findElement(By.cssSelector("#signInSubmit")).click();
        Thread.sleep(5000);
       Actions Action=new Actions(driver);
        WebElement ele =driver.findElement(By.cssSelector("span[class='nav-line-2 ']"));
        Action.moveToElement(ele).build().perform();
        driver.findElement(By.cssSelector("a[id='nav-item-signout'] span[class='nav-text']")).click();
}
}
