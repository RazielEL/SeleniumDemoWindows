package com.syntax.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathDemo {
    public static void main (String[] args){

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");

        WebElement username = driver.findElement(By.xpath("//input [contains(@name, 'ctl00')]"));
        username.sendKeys("Tester");

        WebElement password =  driver.findElement(By.xpath("//input [contains(@id, 'password')]"));
        password.sendKeys("test");
        driver.findElement(By.xpath("//input[@type = 'submit']")).click();
    }
}
