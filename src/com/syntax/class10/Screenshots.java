package com.syntax.class10;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;
import java.io.IOException;

public class Screenshots {
    public static void main (String[] args) throws IOException, InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://wykop.pl");
        driver.manage().window().maximize();

        Thread.sleep(2000);
//        // to w necie znalazlem, to komentuje.
//        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//        // Now you can do whatever you need to do with it, for example copy somewhere
//        FileUtils.copyFile(scrFile, new File("/home/razz/Documents/screenshot.png"));
        // teraz to co nizej to to w klasie:

        TakesScreenshot ts = (TakesScreenshot)driver;
        File srcFile = ts.getScreenshotAs(OutputType.FILE); // to co nizej to FileUtis z commons io co importowalismy
        FileUtils.copyFile(srcFile, new File("C:\\Users\\pawlo\\IdeaProjects\\FILES\\jupikajejwinda.png"));














    }
}
