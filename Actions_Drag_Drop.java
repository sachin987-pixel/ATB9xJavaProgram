   package com.thetestingacademy.ex0502_Actions_Windows_Iframe;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Actions_Drag_Drop {
    EdgeDriver driver;
    @BeforeTest
    public void openBrowser(){
        EdgeOptions edgeoptions = new EdgeOptions();
        edgeoptions.addArguments("--guest");
        driver =new EdgeDriver(edgeoptions);

    }

          @Description("Drag and Drop")
          @Test
          public void  test_Actions() throws InterruptedException {
         driver.get("https://the-internet.herokuapp.com/drag_and_drop");
         driver.manage().window().maximize();

         Thread.sleep(3000);


         WebElement from = driver.findElement(By.id("column-a"));
         WebElement To = driver.findElement(By.id("column-b"));

         //Saurce and Destinatios
              Actions a =  new Actions(driver);
              a.dragAndDrop(from,To).build().perform();


    }
    @AfterTest
    public void closeBrowser() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();


    }




}
