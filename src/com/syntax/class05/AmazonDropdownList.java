package com.syntax.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class AmazonDropdownList {
    public static String url = "https://amazon.com";

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        WebElement categoriesDD = driver.findElement(By.id("searchDropdownBox"));

        Select select = new Select(categoriesDD);

        List<WebElement> options = select.getOptions();

        for (WebElement i : options){
            String option = i.getText(); // tutaj to zmieniamy webelement na string.
            System.out.println(option); // zebysmy mogli to wyprintowac tutaj
        }

        select.selectByValue("search-alias=appliances"); // zaznaczamy tam w amazonie zeby wyszukiwalo w appliances












    }
}