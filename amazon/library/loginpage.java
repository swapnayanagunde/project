package amazon.library;

import AppUtils.Utils;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

public class loginpage extends Utils
{
    public boolean verifylogin(String Mnumber,String pwd)
    {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//div[@class='nav-line-1-container']")).click();
        driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys(Mnumber);
        driver.findElement(By.xpath("//input[@id='continue']")).click();
        driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys(pwd);
        driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
      if(driver.findElement(By.xpath("//a[@id='nav-logo-sprites']")).isDisplayed())
     {
          return true;
           }else
       {
        return false;
       }
       // return true;

    }
}
