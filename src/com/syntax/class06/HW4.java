package com.syntax.class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW4 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://syntaxprojects.com/bootstrap-iframe.php");
        driver.manage().window().maximize();
        WebElement header = driver.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul[1]/li/a"));
        if (header.isDisplayed()){
            System.out.println("Header is displayed");
        }

        driver.switchTo().frame("FrameOne");
        Thread.sleep(4000);


        WebElement register = driver.findElement(By.id("makaha-ButtonElement--XMO5BoJfiAVGcnXXwIIj"));
        System.out.println("Is register button enabled : " + register.isEnabled());



















    }
}