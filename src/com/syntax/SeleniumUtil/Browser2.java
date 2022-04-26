package com.syntax.SeleniumUtil;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Browser2 {

    void openBrowser(String path, WebDriver driver){
        driver.get(path);
        driver.manage().window().maximize();
    }

    void closeBrowser(WebDriver driver){
        driver.close();
    }

}
class Main {
    public static void main (String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");
        WebDriver driver = new ChromeDriver();

        Browser2 a = new Browser2();

        a.openBrowser("https://wykop.pl", driver);
        Thread.sleep(2000);
        a.closeBrowser(driver);


    }
}