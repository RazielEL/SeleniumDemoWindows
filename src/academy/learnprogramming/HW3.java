package academy.learnprogramming;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class HW3 {

        public static void main(String[] args) throws InterruptedException {

            System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");
            WebDriver driver = new ChromeDriver();
            driver.get("http://www.uitestpractice.com/Students/Contact");
            driver.manage().timeouts().implicitlyWait(20000, TimeUnit.MILLISECONDS);
            driver.manage().window().maximize();
            String mainPageHandle = driver.getWindowHandle(); //TO MUSIMY ROBIC ZEBY MIEC ODNOSNIK DO STRONY GLOWNEJ ZEBY POTEM SWITCHOWAC DO NIEJ
            WebElement ajaxLink = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[1]/a"));
            ajaxLink.click();

            WebElement text = driver.findElement(By.xpath("//*[@id=\"Result\"]/div/p"));
            String textString = text.getText();
            System.out.println(textString);


        }
}
