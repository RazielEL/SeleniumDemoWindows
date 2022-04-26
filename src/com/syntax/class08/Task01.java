package com.syntax.class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Task01 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://syntaxprojects.com/dynamic-elements-loading.php");

        driver.findElement(By.id("startButton")).click(); // tam jest taki button start co jak go wlaczysz to czeka 5 sekund az sie welcome zaladuje, klikamy

        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"finish\"]/h4"))); // to jest juz po zalogowaniu, tj nazwa elementu ktory SZUKAMY, czekamy
                                                                                                     // az driver sprawdzi ze sie zaladuje

        WebElement welcome = driver.findElement(By.xpath("//*[@id=\"finish\"]/h4"));  // jak sie zaladowalo to to znajduje na serio
        System.out.println(welcome.getText()); // i printuje








    }
}
