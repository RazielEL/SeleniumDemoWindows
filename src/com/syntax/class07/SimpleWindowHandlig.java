package com.syntax.class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class SimpleWindowHandlig {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://accounts.google.com/signup");

        String mainPageHandle = driver.getWindowHandle(); //TO MUSIMY ROBIC ZEBY MIEC ODNOSNIK DO STRONY GLOWNEJ ZEBY POTEM SWITCHOWAC DO NIEJ
        System.out.println(mainPageHandle); // zwraca ID current page
        WebElement helpLink = driver.findElement(By.linkText("Help"));
        helpLink.click();

        Set<String> allWindowHandles = driver.getWindowHandles(); // bierze wszystkie tabs on session/browser do listy
        System.out.println(allWindowHandles.size());

        Iterator<String> iterator = allWindowHandles.iterator(); // mamy iterator zeby przechodzic przez handles
        mainPageHandle = iterator.next(); // main page handle // take the first step and assign the main handle
        String childHandle = iterator.next(); // child handle // take the second step and have a child handle

        System.out.println(childHandle);
        Thread.sleep(2000);
        driver.switchTo().window(mainPageHandle); // przeskakuje przez taby
        Thread.sleep(2000); // jak zrobimy ze zamkniemy main page to zeby interaktowac z child page to musimy switch zrobic.
        driver.close(); // tu nam zamyka main page, bo przeszlismy. Musimy teraz przejsc na child page zeby moc na niej operowac
        // to ze zamykajac glowna strone na ktorej bylismy przeskoczylo nam na child z automatu (no bo co mialo zrobic)
        // to nie znaczy ze selenium kuma to. Tak jak wyzej - otworzylismy glowna, potem na help przeskoczylo, to swiych na glowna
        // zamykamy tym glowna i tyle, musimy wrocic na child zeby cos operowac tam.
        driver.switchTo().window(childHandle);



















    }
}
