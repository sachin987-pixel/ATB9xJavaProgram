package com.thetestingacademy.ex0502_Actions_Windows_Iframe;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;
import java.util.Set;

public class Selenium_Ac_Win_Iframe_P5 {

    @Description("Verify Heatmap (app.vwo.com)")
    @Test

    public void tes_Heatmap_click() throws InterruptedException {

        WebDriver driver = new EdgeDriver();
        driver.get("https://app.vwo.com/#/test/ab/13/heatmaps/1?token=eyJhY2NvdW50X2lkIjo2NjY0MDAsImV4cGVyaW1lbnRfaWQiOjEzLCJjcmVhdGVkX29uIjoxNjcxMjA1MDUwLCJ0eXBlIjoiY2FtcGFpZ24iLCJ2ZXJzaW9uIjoxLCJoYXNoIjoiY2IwNzBiYTc5MDM1MDI2N2QxNTM5MTBhZDE1MGU1YTUiLCJzY29wZSI6IiIsImZybiI6ZmFsc2V9&isHttpsOnly=1");
        driver.manage().window().maximize();
        String Parentwindow = driver.getWindowHandle();




        Thread.sleep(5000);


        WebElement button = driver.findElement(By.xpath("//li[2]//div[2]//div[1]//div[3]"));

        Actions a = new Actions(driver);
        a.moveToElement(button).click().build().perform();

        Thread.sleep(13000);

        Set<String> windows = driver.getWindowHandles();
        for (String win : windows) {
            if (!win.equals(Parentwindow)) {
                driver.switchTo().window(win);
                System.out.println("Child browser" +driver.getTitle());



                driver.switchTo().frame("heatmap-iframe");

                WebElement clickmap = driver.findElement(By.xpath("//span[@data-qa='refoyekife']"));
                clickmap.click();

//                driver.switchTo().defaultContent();




            }


        }
    }
}










            

