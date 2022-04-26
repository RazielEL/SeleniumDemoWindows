package com.syntax.class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

// zaloz konto na fb.

public class HW2 {
    public static void main (String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://facebook.com");
        driver.findElement(By.linkText("Create new account")).click();
        Thread.sleep(2000);

        driver.findElement(By.name("firstname")).sendKeys("Lukasz");
        driver.findElement(By.name("lastname")).sendKeys("Stanislawowski");
        driver.findElement(By.name("reg_email__")).sendKeys("krzysztofmariusz13@gmail.com");
        Thread.sleep(1000);
        driver.findElement(By.name("reg_email_confirmation__")).sendKeys("krzysztofmariusz13@gmail.com");
        driver.findElement(By.name("reg_passwd__")).sendKeys("CzerwonyWewior12");
        Thread.sleep(1000);
        WebElement months = driver.findElement(By.cssSelector("select#month"));
        Select selectMonth = new Select(months);
        selectMonth.selectByIndex(2);
        WebElement days = driver.findElement(By.cssSelector("select#day"));
        Select selectDay = new Select(days);
        selectDay.selectByIndex(15);
        WebElement years = driver.findElement(By.cssSelector("select#year"));
        Select selectYear = new Select(years);
        selectYear.selectByValue("1991");

        WebElement gender = driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[7]/span/span[2]/input"));
        gender.click();

        driver.findElement(By.name("websubmit")).click();









    }
}
