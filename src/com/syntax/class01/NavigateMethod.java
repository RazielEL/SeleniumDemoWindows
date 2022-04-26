package com.syntax.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethod {
    public static void main (String[] args) throws InterruptedException { // tu sie to exeption z lini 17 pojawilo


        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();


        driver.get("https://facebook.com");
        driver.get("https://wp.pl");
        driver.navigate().to("https://google.com"); // roznica miedzy get a navigate to to ze mozemy isc back and forth w przegladrce, jak nizej:
        driver.navigate().back(); // wraca z gogli na wp
        driver.navigate().forward(); // i idzie znowu na google
        Thread.sleep(2000); //musi byc ten error bo to compile error, musimy najechac na to
                                // zeby ADD EXCEPTION, tam do gory sie pojawi. to zatrzymuje strone na 2 s. Czas w milisekundach.
                                // metoda jest nierekomendowana, tylko pokazowo zeby zobaczyc ze sie odswieza. nie bedziemy uzywac w robocie
        driver.navigate().refresh(); // odswiezy te google wyzej.
        driver.get("https://wp.pl"); // zamyka tab
        driver.quit(); // zamyka cala przegladarke



    }
    }
