package com.syntax.class10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.nio.channels.WritableByteChannel;

public class DragAndDrop {
    public static void main (String[] args){
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/drag_and_drop");
        driver.manage().window().maximize();

        Actions action = new Actions(driver);

        WebElement boxA = driver.findElement(By.id("column-a"));
        WebElement boxB = driver.findElement(By.id("column-b"));

        action.clickAndHold(boxA).moveToElement(boxB).release(boxA).build().perform();

       // cos nie chce sie buildowac, chwyta ale nie puszcza. ale skladania taka ma byc.


        // class 11, HW4 - dziala. nie wiem czemu tu nie dziala










    }
}
