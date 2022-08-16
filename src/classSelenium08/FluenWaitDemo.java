package classSelenium08;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;

import static com.google.common.util.concurrent.Futures.withTimeout;

public class FluenWaitDemo {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        Wait<WebDriver> wait = new FluentWait<>(driver)
        .withTimeout(Duration.ofSeconds(20))//waits for conndition
        .pollingEvery(Duration.ofSeconds(2))//polling is when selenium keep checking every 2 seconds
                // untill previous (20)
                .ignoring(NoSuchElementException.class);//ignoring the exeptions
    }
}
