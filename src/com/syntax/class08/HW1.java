package com.syntax.class08;

//        go to https://the-internet.herokuapp.com/dynamic_controls
//        click on checkbox and click on remove
//        verify the text
//        click on enable verify the textbox is enabled
//        enter text and click disable
//        verify the textbox is disabled

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class HW1 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/dynamic_controls");
        driver.manage().window().maximize();

        WebElement checkbox = driver.findElement(By.cssSelector("#checkbox > input[type=checkbox]"));
        checkbox.click();

        WebElement removeButton = driver.findElement(By.xpath("//*[@id=\"checkbox-example\"]/button"));
        removeButton.click();

        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"message\"]")));

        WebElement goneText = driver.findElement(By.xpath("//*[@id=\"message\"]"));
        String goneTextString = goneText.getText();
        System.out.println(goneTextString);

        WebElement enableButton = driver.findElement(By.xpath("//*[@id=\"input-example\"]/button"));
        enableButton.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"message\"]")));

        WebElement textbox = driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/form[2]/input"));
        if(textbox.isEnabled()){
            System.out.println("Is enabled");
        } else {
            System.out.println("Is disabled");
        }

        textbox.sendKeys("Janusz Maj Zyje");
        Thread.sleep(2000);

        WebElement disableButton = driver.findElement(By.xpath("//*[@id=\"input-example\"]/button"));
        disableButton.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"message\"]")));
        if(textbox.isEnabled()){
            System.out.println("Is enabled");
        } else {
            System.out.println("Is disabled");
        }

    }
}
