package com.thetestingacademy.ex0502_Actions_Windows_Iframe;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class JavaSriptExecutor {
    EdgeDriver driver;
    @BeforeTest
    public void openBrowser(){
        EdgeOptions edgeoptions = new EdgeOptions();
        edgeoptions.addArguments("--guest");
        driver =new EdgeDriver(edgeoptions);

    }
    @Description("Verify JS")
    @Test
    public void test_actions() throws InterruptedException {
        driver.get("https://selectorshub.com/xpath-practice-page/");
        driver.manage().window().maximize();

        WebElement Scroll_bar = driver.findElement(By.xpath("//div[@id='userName']"));
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window-scrollTo(0,1300)");

        Thread.sleep(3000);


        Scroll_bar.sendKeys("Sachin");







    }




    @AfterTest
    public void closeBrowser() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();


    }
}
