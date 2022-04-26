package com.syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW2 {
    public static void main (String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.navigate().to("https://fb.com");
        driver.findElement(By.linkText("Create new account")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("firstname")).sendKeys("Lukasz");
        driver.findElement(By.name("lastname")).sendKeys("Stanislawowski");
        driver.findElement(By.name("reg_email__")).sendKeys("lukasz.stanislawowski@yahoo.com");
        Thread.sleep(2000);
        driver.findElement(By.name("reg_email_confirmation__")).sendKeys("lukasz.stanislawowski@yahoo.com");
        driver.findElement(By.name("reg_passwd__")).sendKeys("LegiaOstroviaKrakowiaArka");
        Thread.sleep(2000);
        driver.quit();



    }
}
