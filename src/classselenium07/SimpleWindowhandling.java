package classselenium07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class SimpleWindowhandling {
    public static String url = "http://accounts.google.com/signup";
    public static void main(String[] args) throws InterruptedException{
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        //we want to see how my window looks like
        String mainPagehandle = driver.getWindowHandle();//i will get in return a String
        System.out.println(mainPagehandle);//parent handle
        //we will have 2 tabs on hand : one is the main page, another help tab
        WebElement helpLink = driver.findElement(By.linkText("Help"));
        helpLink.click();
        //no duplicates alloud inside thwe set?
        //If i want to navigate back to mane page  we will need all ids onhand
        Set<String> allWindowHandles = driver.getWindowHandles();//we are storing all tabs(handles) inside the Set of the String
        System.out.println(allWindowHandles.size());

        //to go step by step through each handle
        Iterator<String> it = allWindowHandles.iterator();//to iterate through the handles
        mainPagehandle = it.next();//assine mainPage to it.next()//my firts syep is my mainPageHandle
 String childHandle= it.next();//take the second step and have a child handle
        //why do we have String on line 31 but not in the line 30?
        System.out.println(childHandle);
        driver.switchTo().window(mainPagehandle);
        driver.switchTo().window(childHandle);
        driver.close();//if we didnt switch our focuse to the child tab, main tab will be closed.
        //before we want to click on help link we will need to navigate on helplink agagin or switch our focuse on
        //the main page whrere  help link located
        driver.switchTo().window(mainPagehandle);
        helpLink.click();
        driver.quit();
    }
}
