package SeleniuClass11;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class RightClickAndDoubleClickAction {

    public static String url = "https://demo.guru99.com/test/simple_context_menu.html";

        public static void main(String[] args) throws InterruptedException {
            System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
            WebDriver driver = new ChromeDriver();
            driver.get(url);



            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);//so the page will load on time
//it is a good practice to always performe implicit wait before any actions


           //we are identifying the write click button
            WebElement leftClickButton = driver.findElement(By.xpath("//span[text() = 'right click me']"));
            // if we press on this button with left cklic it will not do anything
            Actions action = new Actions(driver);
            // contextClick is right click
            action.contextClick(leftClickButton).perform();
            //in outcome we will have a list of different options, not a dropdown becouse with rhe dropdown if u chouse something it will stay

           WebElement editOption = driver.findElement(By.xpath("//span[text() = 'Edit']"));
            //editOption.click();
            action.click(editOption).perform();

            Thread.sleep(1000);
//alert coming out and we need an action
            Alert alert = driver.switchTo().alert();
            alert.accept();//ok

            WebElement doubleClickButton = driver.findElement(By.xpath("//button[contains(text(), 'Double-Click')]"));
            action.doubleClick(doubleClickButton).perform();
            Thread.sleep(2000);
            System.out.println(alert.getText());
            alert.accept();

        }
    }

