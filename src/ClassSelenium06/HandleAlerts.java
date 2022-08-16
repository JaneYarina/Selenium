package ClassSelenium06;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlerts  {
    public static String url = "http://www.uitestpractice.com/Students/Switchto";
    public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
WebDriver driver = new ChromeDriver();
driver.get(url);
WebElement simpleAlertButton = driver.findElement(By.id("alert"));
simpleAlertButton.click();
Thread.sleep(2000);
//interface from selenium. It helps to  switch our focus from the web page to alert window
        Alert simpleAlert = driver.switchTo().alert();
        simpleAlert.accept();
        //identify allert and confurm it
        WebElement confirmAlertButton=driver.findElement(By.id("confirm"));
        confirmAlertButton.click();
        Thread.sleep(2000);

        Alert confirmAlert=driver.switchTo().alert();
        //to print the text from alert window
        //we want text on the alert window print on our console
        //1)we need to get text. we need to do it before dismissal after we switch the focus
        String confirmAlertText = confirmAlert.getText();
        System.out.println(confirmAlertText);
        confirmAlert.dismiss();

        //to populate prompt alert(to full it with the text)

       WebElement promptAlertButton = driver.findElement(By.id("prompt"));
       promptAlertButton.click();
        Alert promtAlert = driver.switchTo().alert();
        //we want to send text
        promtAlert.sendKeys("hello");
      promtAlert.accept();


    }

}
