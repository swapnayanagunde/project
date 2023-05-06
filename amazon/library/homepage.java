package amazon.library;

import AppUtils.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class homepage extends Utils
{
    public boolean logout() throws  InterruptedException
    {
        Actions Action=new Actions(driver);
        WebElement ele=driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']"));
        Action.moveToElement(ele).build().perform();
        driver.findElement(By.xpath("//span[normalize-space()='Sign Out']")).click();
       if(driver.findElement(By.xpath("//h1[@class='a-spacing-small']")).isDisplayed())
      {
         return true;
        }else
      {
          return false;
       }
  //  return false;
    }

}
