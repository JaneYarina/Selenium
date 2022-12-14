package classSelenium08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class explicitWaitTask {
    /*
    navigate http://syntaxprojects.com/dynamic-elements-loading.php
    click on start button
    get the text
    print out in console
     */
    public static String url = "http://syntaxprojects.com/dynamic-elements-loading.php";

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url);

        WebElement getStartButton = driver.findElement(By.id("startButton"));
        getStartButton.click();

        WebDriverWait wait = new WebDriverWait(driver, 20);

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h4[contains(text(),'Welcome')]")));

       WebElement StartButton = driver.findElement(By.xpath("//h4[contains(text(),'Welcome')]"));
       System.out.println(StartButton.getText());
    }
}
