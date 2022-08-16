package SeleniuClass11;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSExecutorDemo {

        public static String url = "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php";

        public static void main(String[] args) throws InterruptedException {
            System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
            WebDriver driver = new ChromeDriver();
            driver.get(url);

            // login actions
            WebElement username = driver.findElement(By.id("txtUsername"));
            username.sendKeys("Admin");
            WebElement password = driver.findElement(By.id("txtPassword"));
            password.sendKeys("Hum@nhrm123");

            JavascriptExecutor js = (JavascriptExecutor)driver;
                                   //buid in scriped  //               interracring
            js.executeScript("arguments[0].style.backgroundColor='yellow'", username);
            js.executeScript("arguments[0].style.backgroundColor='pink'", password);

            WebElement loginButton = driver.findElement(By.id("btnLogin"));
            //loginButton.click(); if this not working we will be using actions class , or java scrip axecutor
            js.executeScript("arguments[0].click()", loginButton);
        }
    }

