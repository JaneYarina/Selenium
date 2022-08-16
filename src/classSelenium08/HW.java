package classSelenium08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class HW {
    public static String url = "https://the-internet.herokuapp.com/dynamic_controls";

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        WebElement checkBox = driver.findElement(By.xpath("//input[@type='checkbox']"));
        checkBox.click();

        WebElement removeButton = driver.findElement(By.xpath("//button[text()='Remove']"));
        removeButton.click();



        WebDriverWait wait=new WebDriverWait(driver,20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@id='message']")));
        WebElement message=driver.findElement(By.xpath("//p[@id='message']"));
        System.out.println(message.getText());

        WebElement EnableButton = driver.findElement(By.xpath("//button[text()='Enable']"));
       EnableButton.click();

      // WebDriverWait wait=new WebDriverWait((driver,20));
       wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@id='message']")));
       WebElement text=driver.findElement((By.xpath("//p[@id='message']")));
        System.out.println(text.getText());

        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("evgeniyapatchettgmail.com");
        WebElement DisableButton = driver.findElement(By.xpath("//button[text()='Disable']"));
        DisableButton.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@id='message']")));
        WebElement desableText=driver.findElement((By.xpath("//p[@id='message']")));
        System.out.println(desableText.getText());
        }


    }


