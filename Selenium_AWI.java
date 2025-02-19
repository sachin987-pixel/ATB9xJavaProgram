package com.thetestingacademy.ex0502_Actions_Windows_Iframe;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.sql.Driver;
import java.util.Set;

public class Selenium_AWI {

    EdgeDriver driver;

    @BeforeTest
     public void openBrowser(){
        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--guest");
        driver  = new EdgeDriver(edgeOptions);

    }

    @Description("Verify Actions")
    @Test
    public void test_actions() throws InterruptedException {

        driver.get("https://app.vwo.com/#/test/ab/13/heatmaps/1?token=eyJhY2NvdW50X2lkIjo2NjY0MDAsImV4cGVyaW1lbnRfaWQiOjEzLCJjcmVhdGVkX29uIjoxNjcxMjA1MDUwLCJ0eXBlIjoiY2FtcGFpZ24iLCJ2ZXJzaW9uIjoxLCJoYXNoIjoiY2IwNzBiYTc5MDM1MDI2N2QxNTM5MTBhZDE1MGU1YTUiLCJzY29wZSI6IiIsImZybiI6ZmFsc2V9&isHttpsOnly=true");
        driver.manage().window().maximize();
        Thread.sleep(10000);
      String parentWindow  =  driver.getWindowHandle();
        System.out.println("Parent -> " + parentWindow);

           WebElement button = driver.findElement(By.xpath("//li[2]//div[2]//div[1]//div[3]"));
          Actions a = new Actions(driver);
          a.moveToElement(button).click().build().perform();

          Thread.sleep(13000);

          Set<String> windows = driver.getWindowHandles();
          for(String win: windows) {
              if (!win.equals(parentWindow)) {
                  driver.switchTo().window(win);
                  System.out.println("Child browser" +driver.getTitle());

                  driver.switchTo().frame("heatmap-iframe");
                  WebElement clickmap = driver.findElement(By.xpath("//span[@data-qa='refoyekife']"));
                  clickmap.click();


              }
          }

    }
            @AfterTest
       public void CloseBrowser() throws InterruptedException {
        Thread.sleep(10000);

        driver.quit();

            }

}
