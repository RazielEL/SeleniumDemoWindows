package com.syntax.class06;

//TC 1: Facebook dropdown verification
//        Open chrome browser
//        Go to "https://www.facebook.com"
//        click on create new account
//        Verify:
//        month dd has 12 month options
//        day dd has 31 day options
//        year dd has 115 year options
//        Select your date of birth
//        Quit browser


import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class HW1 {
    public static void main (String[] args ) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://facebook.com");
        driver.findElement(By.linkText("Create new account")).click();
        Thread.sleep(2000);

        WebElement months = driver.findElement(By.xpath("//select[@id = 'month']"));
        Select selectMonths = new Select(months);
        List<WebElement> allOptionsMonths = selectMonths.getOptions();
        int sizeMonths = allOptionsMonths.size();
        System.out.println("Months: " + sizeMonths);

        WebElement days = driver.findElement(By.cssSelector("select#day"));
        Select selectDays = new Select(days);
        List<WebElement> allOptionsDays = selectDays.getOptions();
        int sizeDays = allOptionsDays.size();
        System.out.println("Days: " + sizeDays);

        WebElement years = driver.findElement(By.cssSelector("select#year"));
        Select selectYears = new Select(years);
        List<WebElement> allOptionsYears = selectYears.getOptions();
        int sizeYears = allOptionsYears.size();
        System.out.println("Years: " + sizeYears);







    }
}
