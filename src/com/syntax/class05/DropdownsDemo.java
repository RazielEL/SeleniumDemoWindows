package com.syntax.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropdownsDemo {
    public static String url = "https://www.syntaxprojects.com/basic-select-dropdown-demo.php";

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();


        driver.get(url);

        WebElement daysDD = driver.findElement(By.id("select-demo"));
        Select select = new Select(daysDD);

        // 3 sposoby - by index

        select.selectByIndex(3); // indeksy sie od 0 zaczynaja, 0 please select, 1 sunday, 2 mond, 3 tue

        Thread.sleep(1000);

        // by visible value

        select.selectByVisibleText("Thursday");

        Thread.sleep(1000);

        // by value

        select.selectByValue("Sunday");


        List<WebElement> allOption = select.getOptions();

        int size = allOption.size();
        System.out.println(size); // 8 (7 days + disabled option)

        for (int i = 0; i < size; i++){
            String option = allOption.get(i).getText();
            System.out.println(option);
            select.selectByIndex(i);// klikamy na kazdy
            Thread.sleep(1000);
        } // o cie chuj.



    }
}