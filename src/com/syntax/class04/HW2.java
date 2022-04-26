package com.syntax.class04;

//TC 1: Amazon link count:
//        Open chrome browser
//        Go to "https://www.amazon.com/"
//        Get all links
//        Get number of links that has text
//        Print to console only the links that has text


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class HW2 {
    public static void main (String[] args){

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        int counter = 0;

        driver.get("https://amazon.com");
        driver.findElements(By.tagName("a"));
        List<WebElement> allLinks = driver.findElements(By.tagName("a"));

        for (WebElement lacze : allLinks) {

            String laczeTekstowe = lacze.getText();
            String pelneLacze = lacze.getAttribute("href");

            if (!laczeTekstowe.isEmpty()) {
                counter = counter + 1;
                System.out.println(laczeTekstowe + "------------------" + pelneLacze);

            }
        }

        System.out.println("Number of links which are not empty: " + counter);

    }
}
