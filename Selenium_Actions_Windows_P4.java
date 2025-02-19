package com.thetestingacademy.ex0502_Actions_Windows_Iframe;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.Set;

public class Selenium_Actions_Windows_P4 {

    EdgeDriver driver;
    @BeforeTest
    public void openbrowser(){
        EdgeOptions edgeoptions = new EdgeOptions();
        edgeoptions.addArguments("--guest");
       driver = new EdgeDriver(edgeoptions);

    }

    
    @Description("verify windows")
    @Test
    public void test_windows_P4(){

//        WebDriver driver = new EdgeDriver();
        driver.get("https://the-internet.herokuapp.com/windows");

        driver.manage().window().maximize();
        driver.getCurrentUrl();

        driver.getWindowHandle();

        WebElement link = driver.findElement(By.linkText("Click Here"));
        link.click();

        Set<String> windows = driver.getWindowHandles();
        for(String win : windows){
            driver.switchTo().window(win);
         //   if(driver.getPageSource().contains("New window")){



        }


        }
        @AfterTest
        public void close_browser() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();


    }

}


