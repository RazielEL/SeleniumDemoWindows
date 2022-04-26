package com.syntax.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ManageMethod {
    public static void main (String[] args){

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();


        driver.navigate().to("https://amazon.com");
        driver.manage().window().maximize();  // to bardziej
        driver.manage().window().fullscreen(); // tego nie bedziemy uzywac bo to w ogole robi jak steam fullscreen




    }
}
