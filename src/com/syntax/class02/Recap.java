package com.syntax.class02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Recap {
    public static void main (String[] args){

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://fb.com");
        String title = driver.getTitle();
        String expectedTitle = "Facebook - Log In or Sign Up";
        if(title.equals(expectedTitle)){
            System.out.println("Title is OK");
        } else {
          System.out.println("Title is not OK");
        }



    }
}
