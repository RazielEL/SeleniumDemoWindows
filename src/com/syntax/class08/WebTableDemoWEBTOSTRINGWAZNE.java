package com.syntax.class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.List;

public class WebTableDemoWEBTOSTRINGWAZNE {
    public static void main(String[] args) throws InterruptedException {

    System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.get("https://syntaxprojects.com/table-search-filter-demo.php");
    driver.manage().window().maximize();

    List<WebElement> rowData = driver.findElements(By.xpath("//table[@id = 'task-table']/tbody/tr"));
    System.out.println(rowData.size());

    Iterator<WebElement> iterator = rowData.iterator();

    while(iterator.hasNext()){
        WebElement row = iterator.next(); //robimy webelement z elementu iteratora
        String rowText = row.getText(); //zamieniamy ta wartosc na TEXT
        System.out.println(rowText + " ");
    }

    System.out.println("--------------------------------------"); //teraz chcemy header data printowac

        List<WebElement> colsData = driver.findElements(By.xpath("//table[@id = 'task-table']/thead/tr"));
        System.out.println(colsData.size());
        for (WebElement colData : colsData){
            String colText = colData.getText();
            System.out.println(colText);
        }









}
}
