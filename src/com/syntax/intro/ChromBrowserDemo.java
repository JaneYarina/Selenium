package com.syntax.intro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromBrowserDemo {
    public static void main(String[] args) {
        //1. set a system property
        //                   key word                   value
        System.setProperty("webdriver.chrome.driver","/Users/evgeniyayarina/eclipse-workspace/selenium test/drivers/chromedriver");
        //                  what                        from where

        //2. create an object of webdriver type
        WebDriver driver=new ChromeDriver();
        //       veriaqble refering to a chrom-driver

        //3. navigate to Syntax application
        driver.get ("https://syntaxtechs.com");
       //method " get "
    }
}
