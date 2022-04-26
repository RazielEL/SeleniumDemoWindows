package com.syntax.class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class Advance2 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://syntaxprojects.com/window-popup-modal-demo.php");
        driver.manage().window().maximize();
        Thread.sleep(1000);
        String mainPageHandle = driver.getWindowHandle();

        WebElement instagram = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[1]/div/div[2]/div[1]/a"));
        instagram.click();

        WebElement facebook = driver.findElement(By.partialLinkText("Like us On Facebook"));
        facebook.click();

        WebElement FBI = driver.findElement(By.partialLinkText("Follow Instagram & Facebook"));
        FBI.click();

        Set<String> allWindowsHandles = driver.getWindowHandles();

        System.out.println(allWindowsHandles.size());

        Iterator<String> iterator = allWindowsHandles.iterator();
        while (iterator.hasNext()){
            String handle = iterator.next(); // zmienna ktora nam daje kolejne taby
            if(!mainPageHandle.equals(handle)) { // to nam daje ze glowna strona nie daje title do printowania
                driver.switchTo().window(handle); // zmieniamy na kolejne taby
                String title = driver.getTitle(); /// bierzemy tytuly tych tabow
                System.out.println(title);
                driver.close();
            }
        }
        driver.switchTo().window(mainPageHandle); //switching back to parent handle
        instagram.click();
    }
}