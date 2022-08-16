package classSelenium04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//HW
//        Navigate to http://syntaxprojects.com
//        Click on start practicing
//        click on simple form demo
//        enter any text on first text box
//        click on show message
//        quit the browser

public class demo1class4CSS {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://syntaxprojects.com");
        WebElement startPracticingButton = driver.findElement(By.cssSelector("a#btn_basic_example"));
        startPracticingButton.click();
        Thread.sleep(2000);
        WebElement simpleFormDemo = driver.findElement(By.xpath("//a[text() = 'Check Box Demo']/preceding-sibling::a"));
        simpleFormDemo.click();
        Thread.sleep(2000);
        WebElement textBox = driver.findElement(By.cssSelector("input[placeholder^='Please']"));
        textBox.sendKeys("Sameer loves Absolute xpath");
        WebElement showMessageButton = driver.findElement(By.cssSelector("button[onclick*='show']"));
        showMessageButton.click();
        Thread.sleep(2000);
        driver.quit();

    }
    }
