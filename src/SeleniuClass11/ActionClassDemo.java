package SeleniuClass11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;


public class ActionClassDemo {
    public static String url = "https://www.amazon.com";

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);


        WebElement accountAndList=driver.findElement(By.id("nav-link-accountList"));
        //new actions class object
        Actions action=new Actions(driver);
action.moveToElement(accountAndList).perform();
//perform necessery action from action class
    }
}
