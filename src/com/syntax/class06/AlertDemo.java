package com.syntax.class06;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDemo {


        public static String url = "http://uitestpractice.com/Students/Switchto";

        public static void main(String[] args) throws InterruptedException {

            System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.get(url);

            driver.manage().window().maximize();

            Thread.sleep(2000);  // tu musialem zrobic bo sie nie wczytywaly okienka

            WebElement simpleAlertButton = driver.findElement(By.id("alert"));
            simpleAlertButton.click();

            Alert simpleAlert = driver.switchTo().alert(); // switch focus to alert
            Thread.sleep(2000);
            simpleAlert.accept(); // klika ok

            Thread.sleep(2000);
            WebElement confirmationAlertButton = driver.findElement(By.id("confirm"));

            confirmationAlertButton.click();
            Thread.sleep(2000);

            Alert confirmationAlert = driver.switchTo().alert();
            confirmationAlert.accept();
            Thread.sleep(2000);

            confirmationAlertButton.click();
            Thread.sleep(2000);
            String alertText = confirmationAlert.getText();
            System.out.println(alertText);

            confirmationAlert.dismiss();
            Thread.sleep(2000);

            WebElement promptAlertButton = driver.findElement(By.cssSelector("button#prompt"));
            promptAlertButton.click();
            Thread.sleep(2000);
            Alert promptAlert = driver.switchTo().alert();
            promptAlert.sendKeys("Batch 12");
            Thread.sleep(2000);
            promptAlert.accept();



















        }
}
