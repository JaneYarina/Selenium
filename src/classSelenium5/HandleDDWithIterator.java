package classSelenium5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class HandleDDWithIterator {
    public static String url = "https://www.amazon.com";
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
//1) we need to select the tag on the website then we can use its class
// 2) identify the DropDown as an WebElement:
        WebElement categorieDD = driver.findElement(By.id("searchDropdownBox"));
        //3)create an object Select class and pass parametr from the WebElement:
        Select select = new Select(categorieDD);

        List<WebElement> options = select.getOptions();
        //iterator of WebElements
        //taking one step foward and see my first element
        for (WebElement DDoption : options) {//loop check if enything inside iterator now?
            String optionText = DDoption.getText();
            System.out.println(optionText);

        }
    }
    }



