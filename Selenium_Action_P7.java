package com.thetestingacademy.ex0502_Actions_Windows_Iframe;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Selenium_Action_P7 {
    @Description("Verify file Uploaded")
    @Test

    public void tes_file_upload() throws InterruptedException {

        WebDriver driver = new EdgeDriver();
        driver.get("https://awesomeqa.com/selenium/upload.html\"");
        driver.manage().window().maximize();

        WebElement upload = driver.findElement(By.id("fileToUpload"));
       String dir =  System.getProperty("user.dir");
     //  System.out.println(dir);

        Thread.sleep(10000);


        upload.sendKeys(dir+ "/src/test/java/com/thetestingacademy/ex0502_Actions_Windows_Iframe/Hello.txt");

        Thread.sleep(10000);

        WebElement button = driver.findElement(By.name("submit"));
        button.click();


        //       WebElement upload = driver.findElement(By.id("fileToUpload"));
//       / String dir=System.getProperty("user.dir");
//        System.out.println(dir);
//
//
//        upload.sendKeys(dir+"/src/test/java/com/thetestingacademy/ex0502_Actions_Windows_Iframe/Hello.txt");
//
//        Thread.sleep(10000);
//
//       WebElement button = driver.findElement(By.name("submit"));
//        button.click();










    }

}
