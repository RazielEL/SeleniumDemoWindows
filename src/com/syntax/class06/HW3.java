package com.syntax.class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.Iterator;
import java.util.List;

//Go to ebay.com
//        get all the categories and print them in the console
//        select Computers/Tables & Networking
//        click on search
//        verify the header

public class HW3 {
    public static void main (String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://ebay.com");
        Thread.sleep(2000);

        WebElement catButton = driver.findElement(By.id("gh-cat"));
        catButton.click();

        Select categories = new Select(catButton);
        List<WebElement> cats = categories.getOptions();

        System.out.println("Number of categories: " + cats.size());
        System.out.println(catButton.getText());





















    }
}
