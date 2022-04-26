package com.syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automation {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://fb.com");
        driver.findElement(By.id("email")).sendKeys("adamo91@gmail.com"); // jak znajdziesz to pole id "email" to masz wpisac to tam.
        driver.findElement(By.id("pass")).sendKeys("blendzior"); // to samo z haslem
        driver.findElement(By.name("login")).click();

        driver.findElement(By.linkText("Forgot password?")).click();
        driver.findElement(By.partialLinkText("Forgot")).click();
        driver.quit();
    }
}
