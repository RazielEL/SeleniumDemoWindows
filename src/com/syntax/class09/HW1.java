package com.syntax.class09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class HW1 {
    public static void main (String[] args){

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");

        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        driver.findElement(By.id("txtPassword")).sendKeys(("Hum@nhrm123"));
        driver.findElement(By.id("btnLogin")).click();
        driver.findElement(By.id("menu_leave_viewLeaveModule")).click();
        driver.findElement(By.xpath("//*[@id=\"frmFilterLeave\"]/fieldset/ol/li[1]/img")).click();

        List<WebElement> months = driver.findElements(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/select[1]"));
            for(WebElement month: months) {
                String monthText = month.getText();

                    Select select = new Select(month);
                    select.selectByVisibleText("Jul");
            }
        List<WebElement> years = driver.findElements(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/select[2]"));

        for(WebElement year: years) {
            String yearText = year.getText();

            Select select = new Select(year);
            select.selectByVisibleText("2024");
        }

        WebElement dday = driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[3]/td[4]/a"));
        dday.click();

        /////////////////////////////

        driver.findElement(By.xpath("//*[@id=\"calToDate\"]")).click();

        List<WebElement> months1 = driver.findElements(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/select[1]"));
        for(WebElement month: months1) {
            String monthText = month.getText();

            Select select = new Select(month);
            select.selectByVisibleText("Aug");
        }
        List<WebElement> years1 = driver.findElements(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/select[2]"));

        for(WebElement year: years1) {
            String yearText = year.getText();

            Select select = new Select(year);
            select.selectByVisibleText("2024");
        }

        WebElement dday1 = driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[3]/td[4]/a"));
        dday1.click();

        WebElement cancelled = driver.findElement(By.xpath("//*[@id=\"leaveList_chkSearchFilter_0\"]"));
        cancelled.click();
        WebElement pending = driver.findElement(By.xpath("//*[@id=\"leaveList_chkSearchFilter_1\"]"));
        pending.click();
        WebElement rejected = driver.findElement(By.xpath("//*[@id=\"leaveList_chkSearchFilter_-1\"]"));
        rejected.click();

        WebElement ITlist = driver.findElement(By.xpath("//*[@id=\"leaveList_cmbSubunit\"]"));
        Select select = new Select(ITlist);
        select.selectByVisibleText("IT Support");

        driver.findElement(By.xpath("//*[@id=\"btnSearch\"]")).click();

        driver.close();


    }
}
