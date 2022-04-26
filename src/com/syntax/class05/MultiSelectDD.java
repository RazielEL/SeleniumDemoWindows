package com.syntax.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class MultiSelectDD {
    public static String url = "https://www.syntaxprojects.com/basic-select-dropdown-demo.php";

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);

        WebElement multiselectDD = driver.findElement(By.id("multi-select"));

        Select select = new Select(multiselectDD);
        boolean isMultiple = select.isMultiple(); //funkcja ktora sprawdza czy lista jest multiple choice. to bulin
        System.out.println(isMultiple); //daje true/false

        if (isMultiple){
            List<WebElement> options = select.getOptions();
            for (WebElement option : options) {
                String optionText = option.getText();
                select.selectByVisibleText(optionText);
                Thread.sleep(1000);  // zaznacza wszustko po koljei z 1s przerwa
            }
        }

        // deselecting goes same as selecting

        select.deselectByIndex(5);
























    }
}