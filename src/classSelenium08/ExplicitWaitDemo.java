package classSelenium08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitDemo {
    public static String url = "http://syntaxprojects.com/dynamic-data-loading-demo.php";

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
WebElement getNewUserButton = driver.findElement(By.id("save"));
getNewUserButton.click();

//we are telling to wait
WebDriverWait wait = new WebDriverWait(driver, 20);
//seting a condition till what happen, till driver will see First name
wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'First Name :')]")));

//then we are telling driver to print it out
WebElement firstName = driver.findElement(By.xpath("//p[contains(text(),'First Name :')]"));
        System.out.println(firstName.getText());


    }
}
