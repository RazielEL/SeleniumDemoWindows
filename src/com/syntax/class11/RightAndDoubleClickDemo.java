package com.syntax.class11;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class RightAndDoubleClickDemo {
    public static void main (String[] args){

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/test/simple_context_menu.html");
        driver.manage().window().maximize();
        WebElement rightClick = driver.findElement(By.xpath("//*[@id=\"authentication\"]/span"));
        Actions action = new Actions(driver);

        action.contextClick(rightClick).perform();
        
        WebElement editOption = driver.findElement(By.xpath("//span[text() = 'Edit']"));
        editOption.click();
//        action.click(editOption).perform(); to jest to samo co wyzej, ale to zawsze dziala a to wyzej czasami nie
        Alert edit = driver.switchTo().alert();
        edit.accept();

        WebElement doubleClick = driver.findElement(By.cssSelector("#authentication > button"));
        action.doubleClick(doubleClick).perform();
        Alert dbclk = driver.switchTo().alert();
        System.out.println(edit.getText());
        edit.accept();                        // wiem ze to edit, ale wychodzi na to ze na alerty tylko 1 obiekt tworzymy, ten co poprzednio zle nazwalem wlasnie






    }
}
