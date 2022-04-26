package com.syntax.class06;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesDemo {
    public static String url = "http://uitestpractice.com/Students/Switchto";

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);

        driver.switchTo().frame(0); // switching focus to the first frame available on the page. we can inspect which is which.

        WebElement textbox = driver.findElement(By.id("name")); //textbox we frejmie

        textbox.sendKeys("Batch12 4ever");

        driver.switchTo().defaultContent(); // wracamy spowrotem na strone, z tej frejmy.

        WebElement alertButton = driver.findElement(By.id("alert"));
        driver.manage().window().maximize();
        Thread.sleep(2000);

        alertButton.click();  // tu zesmy chcieli sobie kliknac na ALERT button.
        Alert alert = driver.switchTo().alert();
        alert.accept();
        Thread.sleep(2000); // zeby wrocic na frejme musimy wylaczyc ten button
        // wracamy znowu na frejme

        driver.switchTo().frame("iframe_a"); // teraz uzywamy webelement name or id
        textbox.clear();
        textbox.sendKeys("we are back to frame");

        driver.switchTo().defaultContent(); // i spowrotem na glowna

        WebElement frameElement = driver.findElement(By.xpath("//iframe[@src ='/Demo.html']"));

        driver.switchTo().frame(frameElement);

        textbox.clear();

        textbox.sendKeys("kult baranek");


















    }
}
