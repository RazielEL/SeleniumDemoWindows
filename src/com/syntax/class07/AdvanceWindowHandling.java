package com.syntax.class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

// click on buttons and open new windows (tabs)
// switch to windows and perform different actions

public class AdvanceWindowHandling {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://syntaxprojects.com/window-popup-modal-demo.php");
        driver.manage().window().maximize();
        Thread.sleep(1000);
        String mainPageHandle = driver.getWindowHandle();

        WebElement instagram = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[1]/div/div[2]/div[1]/a"));
        instagram.click();
        Thread.sleep(1000);

//        driver.switchTo().window(mainPageHandle);
        WebElement facebook = driver.findElement(By.partialLinkText("Like us On Facebook"));
        facebook.click();
        Thread.sleep(1000);

//        driver.switchTo().window(mainPageHandle);
        WebElement FBI = driver.findElement(By.partialLinkText("Follow Instagram & Facebook"));
        FBI.click();
        Thread.sleep(1000);

        driver.close();

        driver.switchTo().window(mainPageHandle);


// jak skomentuje te switch to po kazdym kliknieciu to wtedy 3 okna wyskakuja. jak zmieniam to sie to samo okno 1 co wyskoczylo zmienia.






    }
}