package com.syntax.class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ImpliciteWaitDemo {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://syntaxprojects.com/index.php");
        driver.manage().timeouts().implicitlyWait(20000, TimeUnit.MILLISECONDS);
        WebElement startPracticingButton = driver.findElement(By.id("btn_basic_exple")); // dziala normalnie jak jest dobre id "btn_basic_example" ale je zepsujemy i juz nie
        startPracticingButton.click();













    }
}
