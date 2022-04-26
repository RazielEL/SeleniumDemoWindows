package com.syntax.class11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadDocuments {

    public static void main (String[] args){

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/upload");
        driver.manage().window().maximize();

        WebElement uploadLink = driver.findElement(By.xpath("//*[@id=\"file-upload\"]"));
        uploadLink.click();

        WebElement chooseFile = driver.findElement(By.id("file-upload"));
        chooseFile.sendKeys("/home/razz/Documents/zraziklupa.xlsx");
        WebElement uploadButton = driver.findElement(By.id("file-submit"));
        uploadButton.click();









    }
}
