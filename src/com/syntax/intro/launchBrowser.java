package com.syntax.intro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class launchBrowser {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver= new ChromeDriver();
driver.get("http://www.google.com");
String url = driver.getCurrentUrl();//URl in string type
        System.out.println(url);//uniform servise locator (adress)//https://www.google.com/?gws_rd=ssl
        String title=driver.getTitle();//string
        System.out.println(title);//google
        driver.quit();
    }
}
