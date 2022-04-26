package academy.learnprogramming;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class HW2 {
    public static String url = "https://demoqa.com/browser-windows";

    public  static void  main (String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();

        String mainWindow = driver.getWindowHandle();

        Thread.sleep(2000);

        WebElement newTabButton = driver.findElement(By.id("tabButton"));
        newTabButton.click();




        WebElement newWindowButton = driver.findElement(By.id("windowButton"));
        newWindowButton.click();

        WebElement newWindowMessageButton = driver.findElement(By.id("messageWindowButton"));
        newWindowMessageButton.click();

        Set<String> allWindowHandles = driver.getWindowHandles();

        Iterator<String> iterator = allWindowHandles.iterator();

        while (iterator.hasNext()){
            String childWindow = iterator.next();
            System.out.println(driver.getTitle());
            System.out.println(childWindow.toString());
        }








    }
}