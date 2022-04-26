package com.syntax.class11;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSExecutor {
    public static void main (String[] args){

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.manage().window().maximize();

       WebElement username =  driver.findElement(By.id("txtUsername"));
       username.sendKeys("Admin");

       WebElement password = driver.findElement(By.id("txtPassword"));
       password.sendKeys(("Hum@nhrm123"));
//

        JavascriptExecutor js = (JavascriptExecutor)driver; //robimy obiekt js, downcasted to driver, zeby cokolwiek robic
        // tu sa tylko 2 albo 3 metody

        js.executeScript("arguments[0].style.backgroundColor='blue'", username);
        js.executeScript("arguments[0].style.backgroundColor='yellow'", password);

        WebElement button = driver.findElement(By.id("btnLogin"));

        js.executeScript("arguments[0].click()", button);







    }
}
