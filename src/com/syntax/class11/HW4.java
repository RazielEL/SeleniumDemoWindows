package com.syntax.class11;

//TC:4 --> do on selenium project
//        Go to http://www.uitestpractice.com/
//        interact with drag and drop, iframe, double click
//        click on home
//        delete one user from the table
//        go to the next link
//        click on the ajax link and wait for the text
//        verify that the text is displayed
//        go to Form
//        and fill out everything
//        go to widgets
//        upload any file and verify it is uploaded
//        go to actions and perform all the necessary actions
//        go to SwitchTo
//        work with alerts and frames
//        go to select
//        perform actions on all dropdowns

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.nio.channels.WritableByteChannel;
import java.util.concurrent.TimeUnit;

public class HW4 {
    public static void main (String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.uitestpractice.com/");
        driver.manage().window().maximize();
        Actions action = new Actions(driver);
        driver.manage().timeouts().implicitlyWait(20000, TimeUnit.MILLISECONDS);

// DRAG AND DROP

        WebElement drag = driver.findElement(By.id("draggable"));
        WebElement drop = driver.findElement(By.id("droppable"));
        action.dragAndDrop(drag,drop).build().perform(); // DZIALAAAAAAAA
// DOUBLE CLICK

        WebElement dbClick = driver.findElement(By.name("dblClick"));
        action.doubleClick(dbClick).perform();
        Alert dbclk = driver.switchTo().alert();
        dbclk.accept();
// IFRAME
        driver.switchTo().frame("iframe_a");
        WebElement yourName = driver.findElement(By.xpath("//*[@id=\"name\"]"));
        yourName.sendKeys("Eren");
        driver.switchTo().defaultContent();
// CLICK ON LINK BELOW
        WebElement link = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[3]/p/a"));
        link.click();
        
// CLICK ON BELOW BUTTON AND OPEN LINK IN A NEW TAB
        String mainPageHandle = driver.getWindowHandle();
        WebElement newTab = driver.findElement(By.xpath("//*[@id=\"Button\"]/a"));
        newTab.click();
        driver.switchTo().window(mainPageHandle);

// click on home

        WebElement home = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/ul/li[1]/a"));
        home.click();

// delete user from the table

        WebElement deleteUser = driver.findElement(By.xpath("/html/body/div[2]/div[1]/table/tbody/tr[3]/td[4]/button[3]"));
        deleteUser.click();
        WebElement deleteUser2 = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/form/div/input"));
        deleteUser2.click();
        
// ajax link and wait for text

        WebElement ajaxLink = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/ul/li[2]/a"));
        ajaxLink.click();
        WebElement thisIsAjaxLink = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[1]/a"));
        thisIsAjaxLink.click();
        WebElement ajaxLinkText = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div/p"));
        System.out.println(ajaxLinkText.getText());

// go to form

        WebElement formLink = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/ul/li[3]/a"));
        formLink.click();

 // filling out everything

        WebElement firstName = driver.findElement(By.id("firstname"));
        firstName.sendKeys("Lukasz");

        WebElement lastName = driver.findElement(By.xpath("//*[@id='lastname']"));
        lastName.sendKeys("Stanislawowski");

        WebElement marriedCheckBox = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/form/div[3]/label[2]/input"));
        marriedCheckBox.click();
        WebElement dancing = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/form/div[4]/label[2]/input"));
        dancing.click();
        WebElement cricket = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/form/div[4]/label[4]/input"));
        cricket.click();

        WebElement countryList = driver.findElement(By.xpath("//*[@id=\"sel1\"]"));
        Select select = new Select(countryList);
        select.selectByVisibleText("Iceland");

        WebElement calendar = driver.findElement(By.xpath("//*[@id=\"datepicker\"]"));
        calendar.click();

        WebElement months = driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/select[1]"));
        Select month = new Select(months);
        month.selectByVisibleText("Sep");

        WebElement years = driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/select[2]"));
        Select year = new Select(years);
        year.selectByVisibleText("1990");

        WebElement days = driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[3]/td[1]/a"));
        days.click();

        WebElement phone = driver.findElement(By.xpath("//*[@id=\"phonenumber\"]"));
        phone.sendKeys("666 666 666");

        WebElement username = driver.findElement(By.xpath("//*[@id=\"username\"]"));
        username.sendKeys("Testoviron");

        WebElement email = driver.findElement(By.xpath("//*[@id=\"email\"]"));
        email.sendKeys("lukasz.stanislawowski@testoviron.com");

        WebElement about = driver.findElement(By.xpath("//*[@id=\"comment\"]"));
        about.sendKeys("Jestem wesoly romek i mam na przedmiesciu domek. W domku wode prad i gaz, dzisiaj juz zapraszam was");

        WebElement password = driver.findElement(By.xpath("//*[@id=\"pwd\"]"));
        password.sendKeys("testo99");

        WebElement submitButton = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/form/div[12]/div/button"));
        submitButton.click();

// go to widgets

        WebElement widgets = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/ul/li[5]/a"));
        widgets.click();

// upload a file

        WebElement chooseFile = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[1]/div/form/div[1]/div[2]/input"));
        chooseFile.sendKeys("/home/razz/Documents/zraziklupa.png");
        WebElement uploadButton = driver.findElement(By.xpath("//*[@id=\"upload_form\"]/div[2]/input"));
        uploadButton.click();

// going to actions etc

        WebElement actionsPage = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/ul/li[6]/a"));
        actionsPage.click();

        WebElement clickMe = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[1]/button[1]"));
        clickMe.click();

        Alert clickMeAlert = driver.switchTo().alert();
        clickMeAlert.accept();

        WebElement doubleClickMe = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[1]/button[2]"));
        action.doubleClick(doubleClickMe).build().perform();
        Thread.sleep(2000);
        Alert doubleClickMeAlert = driver.switchTo().alert();
        doubleClickMeAlert.accept();

        WebElement boxA = driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
        WebElement boxB = driver.findElement(By.xpath("//*[@id=\"droppable\"]"));

        action.dragAndDrop(boxA,boxB).build().perform();

        WebElement hoover = driver.findElement(By.xpath("//*[@id=\"div2\"]"));
        action.moveToElement(hoover);
        Thread.sleep(2000);











        








    }
}
