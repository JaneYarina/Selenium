package classselenium07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ImplicitWaitDemo {
    public static String url ="http://syntaxporjects.com/index.php";

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);//it will apply for the whole code
        //WebElement startPracticing = driver.findElement(By.id("btn_basic_example"));//correct
        WebElement startPracticing = driver.findElement(By.id("btn_basic_example111"));//not correct
        startPracticing.click();
    }
}
