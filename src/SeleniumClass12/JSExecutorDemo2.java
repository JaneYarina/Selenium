package SeleniumClass12;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

    public class JSExecutorDemo2 {

        public static String url = "http://www.amazon.com";

        public static void main(String[] args) throws InterruptedException {
            System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
            WebDriver driver = new ChromeDriver();
            driver.get(url);

            JavascriptExecutor js = (JavascriptExecutor)driver;
            js.executeScript("window.scrollBy(0, 700)");//for scrolling by the pickerels(messurer by numbers number)
            Thread.sleep(2000);
            js.executeScript("window.scrollBy(0, -500)");

            WebElement backToTopButton = driver.findElement(By.className("navFooterBackToTopText"));
            // scrolling into a specific view or element
           js.executeScript("arguments[0].scrollIntoView(true)", backToTopButton);//
            //js.executeScript("arguments[0].scrollIntoView(false)", backToTopButton);//will not go to the end for the page
        }
    }

