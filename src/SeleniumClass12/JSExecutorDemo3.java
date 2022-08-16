package SeleniumClass12;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

    public class JSExecutorDemo3 {

        public static String url = "http://www.google.com";

        public static void main(String[] args) throws InterruptedException {
            System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
            WebDriver driver = new ChromeDriver();
            driver.get(url);

            JavascriptExecutor js = (JavascriptExecutor)driver;
            // opens a tab with specific url
            js.executeScript("window.open('http://www.amazon.com')");//we opened anothe window amazon
            // window.open() opens a blank tab
            //if yuo like to switch to different window you need this:
            //driver.switchTo().window(mainPageHandle);


            WebElement search = driver.findElement(By.name("q"));
            search.sendKeys("asdfasdfafasfdasasfasasfass");
        }
    }
