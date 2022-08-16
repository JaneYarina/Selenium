package com.syntax.class2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class recap2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com");
        driver.manage().window().maximize();
        //check the title if it is correct
        String title = driver.getTitle();
        System.out.println(title);
        String expectedTitle = "Facebook – log in or sign up";

        if(title.equals(expectedTitle)){
            System.out.println("Title is correct");
        }else {
            System.out.println("Title is not correct");
        }
        //driver.quit();
    }
}


