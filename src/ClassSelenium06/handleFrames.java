package ClassSelenium06;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class handleFrames {
    public static String url = "http://www.uitestpractice.com/Students/Switchto";
    public static void main(String[] args) {
       System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        //switch to a frame by using index
       driver.switchTo().frame(0);
//locate element
        WebElement textBox =driver.findElement(By.id("name"));
       textBox.sendKeys("hello");
       //we want to cklick on Alert button
        //1) locatre the button
        driver.switchTo().defaultContent();
        WebElement alertButton =driver.findElement(By.id("alert"));
        alertButton.click();//error at ClassSelenium06.handleFrames.main(handleFrames.java:22)//
        //we need to switch back
        //switch to Aert window
       Alert alert =  driver.switchTo().alert();
       alert.accept();
       //switch to the frame back by using name
       driver.switchTo().frame("iframe_a");
       //we will need to clear textbox before we put another elements
        textBox.clear();
        textBox.sendKeys("back to the frame");
        //switch back to the page
        driver.switchTo().defaultContent();
        //identify Frame as our webElement
        WebElement frameElement =driver.findElement(By.xpath("//iframe[@SRC = '/Demo.html']"));
        driver.switchTo().frame(frameElement);
        textBox.clear();
        textBox.sendKeys("again");



    }

}
