package com.syntax.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

    public static void main(String[] args){

        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe"); // ustawiamy to i mamy 2 stringi. 1 to built in value, do zapamietania. Natomiast 2: to sciezka, gdzie jest
                                                        // driver, najlepiej go dac w folderze dodatkowym glownym w IdeaProjects, u mnie drivers. Na windowsie trzeba
                                                        // dodac .exe na koncu.
        WebDriver driver = new ChromeDriver();
        driver.get("https://wykop.pl"); // idzie na ta strone

        String url = driver.getCurrentUrl(); // tutaj bierze z chroma strone i przypisuje ja do stringu
        System.out.println(url);
        String title = driver.getTitle(); // bierze tytul strony
        System.out.println(title);
        driver.quit(); // zamyka browser



    }
}
