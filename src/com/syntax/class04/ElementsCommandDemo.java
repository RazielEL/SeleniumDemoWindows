package com.syntax.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementsCommandDemo {
    public static void main (String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://www.uitestpractice.com/Students/Form");
        WebElement marriedRadioButton = driver.findElement(By.xpath("(//input[@name = 'optradio'])[1]")); // dziala!! to sie nazywa indexing. taka skladnia jest. Numeracja od 1

        if (marriedRadioButton.isEnabled()){
            System.out.println("Enabled");
        } else {
            System.out.println("Not Enabled");
        }

        System.out.println(marriedRadioButton.isSelected());
        marriedRadioButton.click();
        System.out.println(marriedRadioButton.isSelected());













    }
}
