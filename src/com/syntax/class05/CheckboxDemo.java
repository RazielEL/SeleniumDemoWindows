package com.syntax.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CheckboxDemo {

    public static String url = "https://syntaxprojects.com/basic-checkbox-demo.php";

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get(url);

        // lokalizowanie czekboksow i storowanie ich w liscie

        List<WebElement> optionCheckBoxes = driver.findElements(By.cssSelector("input[class = 'cb1-element']"));
        int size = optionCheckBoxes.size();
        System.out.println(size);

// looping przez wszystki element w tym przypadku zeby kliknac na kazdy

        for (WebElement option : optionCheckBoxes){

            String checkBoxText = option.getAttribute("value");
            if (checkBoxText.equals("Option-2")){
                option.click();  // jak chcemy wszystkie to bez if i break.
                break;
            }
        }




    }
}