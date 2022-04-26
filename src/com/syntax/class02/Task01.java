package com.syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task01 {
        public static void main (String[] args) throws InterruptedException {

            System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
            WebDriver driver = new ChromeDriver();

            driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
            driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
            driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
            driver.findElement(By.id("ctl00_MainContent_login_button")).click();
            String title = driver.getTitle();
            if (title.equals("Web Orders")){
                System.out.println("Correct");
            } else {
                System.out.println("Incorrect");
            }
            Thread.sleep(2000);
            driver.findElement(By.linkText("Logout")).click();
            Thread.sleep(2000);
            driver.quit();




        }

}

