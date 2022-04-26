package com.syntax.class06;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

// musimy podac log i pass w URL. Piszemy przed webname.

public class SingIn {
    public static String url = "http://admin:admin@the-internet.herokuapp.com/basic_auth";
                                    //username:password@ tak to sie wlasnie robi
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);

    }
}
