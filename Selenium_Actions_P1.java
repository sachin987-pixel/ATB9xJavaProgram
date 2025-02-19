package com.thetestingacademy.ex0502_Actions_Windows_Iframe;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Selenium_Actions_P1 {
    @Description("Enter Uppercase letter")
    @Test
    public void test_usernamefield() throws InterruptedException {
        WebDriver driver = new EdgeDriver();
        driver.get("https://awesomeqa.com/practice.html");
        driver.manage().window().maximize();

        WebElement firstname = driver.findElement(By.name("firstname"));

        Actions a =new Actions(driver);
        a.keyDown(Keys.SHIFT).sendKeys(firstname,"THE TESTING ACADEMY").keyUp(Keys.SHIFT).build().perform();
        Thread.sleep(1000);




    }
}
