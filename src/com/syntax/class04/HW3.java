package com.syntax.class04;
//
//HW 2
//        HRMS Application Negative Login:
//        Open chrome browser
//        Go to "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login"
//        Enter valid username and password (username - Admin, password - Hum@nhrm123 -- DONT ENTER PASSWORD)
//        Enter valid username
//        Leave password field empty
//        Click on login button
//        Verify error message with text "Password cannot be empty" is displayed.


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW3 {
    public static void main (String[] args) {


        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();


        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        WebElement username = driver.findElement(By.cssSelector("input#txtUsername"));
        username.sendKeys("Admin");
        WebElement password = driver.findElement(By.cssSelector("input#txtPassword"));
        password.sendKeys("");
        WebElement loginButton = driver.findElement(By.cssSelector("input#btnLogin"));
        loginButton.click();
       WebElement emptyMessage = driver.findElement(By.cssSelector("span#spanMessage"));

        if (emptyMessage.isDisplayed()){
            System.out.println("Password cannot be empty message has been displayed");
        } else {
            System.out.println("There is no empty password message");
        }



    }
}
