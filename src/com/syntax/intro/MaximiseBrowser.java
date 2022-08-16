package com.syntax.intro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MaximiseBrowser {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.amazon.com");
        //driver.manage().window().maximize();//
        driver.manage().window().fullscreen();//no bookmarks visible.to get out press "esc"




    }
}
