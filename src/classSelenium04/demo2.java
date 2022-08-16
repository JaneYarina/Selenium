package classSelenium04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
        WebElement Username= driver.findElement(By.id("ctl00_MainContent_username"));
        Username.sendKeys("Tester");
WebElement Password = driver.findElement(By.id("ctl00_MainContent_password"));
Password.sendKeys("test");
Thread.sleep(2000);
Username.clear();
Password.clear();
driver.quit();
    }
}
