package com.syntax.class02;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW1 {
    public static void main (String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
        driver.findElement(By.id("customer.firstName")).sendKeys("Lukasz");
        driver.findElement(By.id("customer.lastName")).sendKeys("Stanislawowski");
        driver.findElement(By.id("customer.address.street")).sendKeys("Cwiartki 3/4");
        driver.findElement(By.id("customer.address.city")).sendKeys("Wroclaw");
        driver.findElement(By.id("customer.address.state")).sendKeys("NY");
        driver.findElement(By.id("customer.address.zipCode")).sendKeys("10385");
        driver.findElement(By.id("customer.phoneNumber")).sendKeys("728 384 8144");
        driver.findElement(By.id("customer.ssn")).sendKeys("111-454-545");
        driver.findElement(By.id("customer.username")).sendKeys("Testoviron");
        driver.findElement(By.id("customer.password")).sendKeys("ArkaGdynia123@");
        driver.findElement(By.id("repeatedPassword")).sendKeys("ArkaGdynia123@");
        driver.findElement(By.className("button")).click();
        Thread.sleep(3000);
        driver.quit();


    }
}
