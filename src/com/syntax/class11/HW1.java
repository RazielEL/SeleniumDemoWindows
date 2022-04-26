package com.syntax.class11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//HW: TestNG and use assertions
//        TC 1: HRMS blank password validation
//        Navigate to "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login"
//        Enter valid username and leave password field empty
//        Click on login button
//        Verify error message with text "Password cannot be empty" is displayed

public class HW1 {
    public static void main (String[] args) {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.manage().window().maximize();

        WebElement username = driver.findElement(By.id("txtUsername"));
        username.sendKeys("Admin");
        WebElement password = driver.findElement(By.id("txtPassword"));
        WebElement button = driver.findElement(By.id("btnLogin"));
        button.click();

        WebElement text = driver.findElement((By.id("spanMessage")));
        System.out.println(text.getText());

        if (text.isDisplayed()){
            System.out.println("Password is empty");
        }


    }
}
