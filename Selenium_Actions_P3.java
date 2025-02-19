package com.thetestingacademy.ex0502_Actions_Windows_Iframe;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class Selenium_Actions_P3 {

    @Description("Verify mouseover actions")
    @Test
    public void test_action_p3() throws InterruptedException {

        WebDriver driver = new EdgeDriver();
        driver.get("https://www.makemytrip.com/");

        driver.manage().window().maximize();

//        WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(10));
//        w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@data-cy='closeModal']")));

        WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(20));
        w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@data-cy='closeModal']")));

        driver.findElement(By.xpath("//span[@data-cy='closeModal']")).click();

          WebElement fromCity = driver.findElement(By.id("fromCity"));

           Thread.sleep(10000);


        Actions a = new Actions(driver);
        a.moveToElement(fromCity).click().sendKeys("Del").build().perform();


//        List<WebElement> list_auto_options = driver.findElements(By.xpath("//span[text()='New Delhi']"));
//        for (WebElement e : list_auto_options) {
//            if (e.getText().contains("New Delhi")) {
//                e.click();
//                break;
            a.moveToElement(fromCity).keyDown(Keys.ARROW_DOWN).keyDown(Keys.ENTER).perform();
            a.moveToElement(fromCity).keyDown(Keys.ARROW_DOWN).keyDown(Keys.ENTER).perform();

//
//
//            }
//        }











         




    }

}
