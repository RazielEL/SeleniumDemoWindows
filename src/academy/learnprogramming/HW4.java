package academy.learnprogramming;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class HW4 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://syntaxprojects.com/dynamic-elements-loading.php");

        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver, 20);

        WebElement startButton = driver.findElement(By.id("startButton"));
        startButton.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(), 'Welcome Syntax')]")));

        WebElement text = driver.findElement(By.xpath("//*[contains(text(), 'Welcome Syntax')]"));
        String textString = text.getText();
        System.out.println(textString);













    }
}
