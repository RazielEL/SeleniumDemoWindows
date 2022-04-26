//package com.syntax.SeleniumUtil;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//public class Browser {
//
//    String path;
//    WebDriver driver;
//
//    Browser (String path, WebDriver driver){
//        this.path = path;
//        this.driver = driver;
//    }
//    void openBrowser(){
//        driver.get(path);
//        driver.manage().window().maximize();
//    }
//
//    void closeBrowser(){
//        driver.close();
//    }
//
//}
//class Main {
//    public static void main (String[] args) throws InterruptedException {
//
//        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");
//        WebDriver driver = new ChromeDriver();
//
//        Browser a = new Browser("https://wykop.pl", driver);
//
//        a.openBrowser();
//        Thread.sleep(2000);
//        a.closeBrowser();
//
//
//    }
//}