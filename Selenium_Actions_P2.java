package com.thetestingacademy.ex0502_Actions_Windows_Iframe;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Selenium_Actions_P2 {
   @Description("Verify mouseover actions")
    @Test
    public void test_action_p2() throws InterruptedException {

       WebDriver driver = new EdgeDriver();
       driver.get("https://www.spicejet.com/");

       driver.manage().window().maximize();



       WebElement source = driver.findElement(By.xpath("//input[@type='text'][1]"));



       Actions a =new Actions(driver);
      // a.moveToElement(source).click().build().perform();
       a.moveToElement(source).click().sendKeys("BLR").build().perform();


// //input[@data-focusvisible-polyfill='true']




    }

}
