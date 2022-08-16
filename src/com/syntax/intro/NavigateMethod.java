package com.syntax.intro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigateMethod {
    public static void main(String[] args) throws InterruptedException {//connected with Thread.sleep
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver=new ChromeDriver();//we need another object because we are overriding url
        driver.get("http://www.facebook.com");
        driver.navigate().to("http://www.google.com");
        driver.navigate().back();
        driver.navigate().forward();
        Thread.sleep(2000);//pause execution for 2 sec
        driver.navigate().refresh();

        //driver.close();//close the curent single tab
        driver.quit();//will close whole browser

    }
}
