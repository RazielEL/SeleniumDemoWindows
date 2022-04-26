package com.syntax.class09;

import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HW2 {
    public static void main (String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://aa.com/homePage.do");

        driver.findElement(By.id("reservationFlightSearchForm.originAirport")).clear();
        driver.findElement(By.id("reservationFlightSearchForm.originAirport")).sendKeys("JFK");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"ui-id-8\"]")).click();

        driver.findElement(By.id("reservationFlightSearchForm.destinationAirport")).sendKeys("WAW");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"ui-id-9\"]")).click();

        WebElement passengers = driver.findElement(By.id("flightSearchForm.adultOrSeniorPassengerCount"));
        Select select = new Select(passengers);
        select.selectByVisibleText("4");

        WebElement dateDepart = driver.findElement(By.xpath("//*[@id=\"reservationFlightSearchForm\"]/div[4]/div[1]/div/button"));
        dateDepart.click();


        for (int i = 0; i < 5; i++){
            driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[2]/div/a")).click();
        }
        driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[2]/table/tbody/tr[3]/td[5]/a")).click();

        WebElement dateArrival = driver.findElement(By.xpath("//*[@id=\"reservationFlightSearchForm\"]/div[4]/div[2]/div/button"));
        dateArrival.click();

        for (int i = 0; i < 2; i++){
            driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[2]/div/a")).click();
        }
        driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[2]/table/tbody/tr[3]/td[2]/a")).click();

        driver.findElement(By.id("flightSearchForm.button.reSubmit")).click();
        Thread.sleep(10000);
        driver.quit();
    }
}
