package classSelenium10;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class takingScreanShots {
    public static String url="http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx";

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get(url);
        WebElement username=driver.findElement(By.id("ctl00_MainContent_username"));
        username.sendKeys("Tester", Keys.TAB);
        WebElement password = driver.findElement(By.xpath("//input[contains(@id, 'password')]"));
        password.sendKeys("test", Keys.ENTER);

        //u can NOT create an object of an interface
        //u can create an object of class
        //we will be down-casting our interface to the object
        TakesScreenshot ts = (TakesScreenshot)driver;//we are taking object of screanshot interface by downcastingto the driver//we are down casting interface in order to interact with webpage
       File srcFile = ts.getScreenshotAs(OutputType.FILE);//we are getting screenshot of file//we have filed in on hand, now we can passing it to a file object
        //What makes us to differentiate the files? - the extension of the file
//what is the file that i like to copy and Where am i going to store it
        //Im trying to coppy src file
        //we needc to use exception
        try { //commons.io far is needed for this    // new folder//project name//name of the file//exstention
            FileUtils.copyFile(srcFile,new File("screenshots/SmartBear/adminPage.png"));//copy file and put in location where we are going to see it in a future
            // have a new file with
        } catch (IOException e) {//
            e.printStackTrace();

        }

    }
        // the new extension and new location
        //png is for images


    }

//exception?
//dow-casting and up-casting
