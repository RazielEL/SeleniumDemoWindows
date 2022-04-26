package com.syntax.class11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//TC 2: HRMS blank username and password validation
//        Navigate to "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login"
//        Leave username and password field empty
//        Click on login button
//        Verify error message with text "Username cannot be empty" is displayed

public class HW2 {
    public static void main (String[] args) {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.manage().window().maximize();

        WebElement username = driver.findElement(By.id("txtUsername"));

        WebElement password = driver.findElement(By.id("txtPassword"));

        WebElement button = driver.findElement(By.id("btnLogin"));
        button.click();

        WebElement text = driver.findElement(By.id("spanMessage"));

        System.out.println(text.getText());







    }
}
