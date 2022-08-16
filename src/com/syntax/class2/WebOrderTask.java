package com.syntax.class2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebOrderTask {
    public static void main(String[] args) {
        /*Navigate to http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx
        login
        get title and verify
        logout
        close the browser
        */
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
       WebElement username =  driver.findElement(By.id("ctl00_MainContent_username"));//storing webelement and return it as a string
       username.sendKeys("Tester");//performing action
      //  driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
      //  driver.findElement(By.name("ctl00$MainContent$login_button")).click();
       // String title = driver.getTitle();
       // String expectedTitle = "Web Orders";
      //  if(title.equals(expectedTitle)){
           // System.out.println("Title is correct");
       // }else {
            //System.out.println("Title is not correct");
     //   }
//driver.findElement(By.partialLinkText("Logout")).click();
       //driver.quit();


    }
}
