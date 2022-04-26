package academy.learnprogramming;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW1 {

    public static String url = "https://syntaxprojects.com/javascript-alert-box-demo.php";

    public static void main (String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url);

        WebElement JSAB = driver.findElement(By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[1]/div[2]/button"));
        JSAB.click();

        Thread.sleep(2000);

        Alert JSABAlert = driver.switchTo().alert();

        System.out.println(JSABAlert.getText());
        JSABAlert.accept();

        Thread.sleep(2000);

        WebElement AcceptCancel = driver.findElement(By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[2]/div[2]/button"));
        AcceptCancel.click();

        Thread.sleep(2000);

        Alert AcceptCancelAlert = driver.switchTo().alert();

        System.out.println( AcceptCancelAlert.getText());
        AcceptCancelAlert.accept();

        Thread.sleep(2000);

        AcceptCancel.click();
        Thread.sleep(2000);
        driver.switchTo().alert();

        AcceptCancelAlert.dismiss();
        Thread.sleep(2000);

        WebElement promptBox = driver.findElement(By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[3]/div[2]/button"));
        promptBox.click();
        Alert promptBoxAlert = driver.switchTo().alert();
        System.out.println(promptBoxAlert.getText());
        promptBoxAlert.sendKeys("Janusz Maj Zyje");
        Thread.sleep(2000);

        promptBoxAlert.accept();
        Thread.sleep(2000);

        promptBox.click();
        Thread.sleep(2000);
        promptBoxAlert.dismiss();















    }
}