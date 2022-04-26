package com.syntax.class09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class PaginationExample {
    public static void main (String[] args){
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://syntaxprojects.com/table-pagination-demo.php");

        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver, 20);

        List< WebElement> rows = driver.findElements(By.xpath("//table[@class ='table table-hover']/tbody/tr"));
        WebElement nextButton = driver.findElement(By.xpath("//*[@id=\"myPager\"]/li[5]/a"));
        boolean flag = true;

        while (flag){
            for (WebElement row : rows){
                String rowText = row.getText();
                if(!rowText.isEmpty()) {
                    System.out.println(rowText);
                }
                if(rowText.contains("Juan valdez")) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                nextButton.click();
            }
        }











    }
}

