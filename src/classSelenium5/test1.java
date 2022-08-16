package classSelenium5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class test1 {

public static String url = "https://www.facebook.com";

public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        WebElement signupButton = driver.findElement(By.cssSelector("a[data-testid='open-registration-form-button']"));
        signupButton.click();
        WebElement monthDD = driver.findElement(By.id("//select[id='month']"));
        Select select = new Select(monthDD);
        List<WebElement> monthOptions = select.getOptions();
        int size = monthOptions.size();
        System.out.println(size);


        }

        }

