package classselenium07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class AdvancedWindowhandelling {
    public static String url = "http://syntaxprojects.com/window-popup-modal-demo.php";

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url);

        String mainPageHandle = driver.getWindowHandle();

        WebElement igButton = driver.findElement(By.linkText("Follow On Instagram"));
        WebElement fbButton = driver.findElement(By.linkText("Like us On Facebook"));
        WebElement igAndfbButton = driver.findElement(By.linkText("Follow Instagram & Facebook"));
        igButton.click();
        fbButton.click();
        igAndfbButton.click();
        //we are going to store everethon in a set of strings
        Set<String> allWindowHandles = driver.getWindowHandles();//store all windows
        System.out.println(allWindowHandles.size());//4
        //iterte through them
        //print them all
        //get one handle
        for (String handle : allWindowHandles) {//start iterating through the handles(tabs)
            if (!mainPageHandle.equals(handle)) {//set a condition where main page is not equal to the handle

                driver.switchTo().window(handle);//switch to the specific handle
                // driver.manage().window().maximize();
                String title = driver.getTitle();//get the title
                System.out.println(title);
                // if (!mainPageHandle.equals(handle)) {
                driver.close();//close the tab
//why do we need While loop is we have Iterations
            }
        }
        driver.switchTo().window(mainPageHandle);
        igButton.click();


    }
}