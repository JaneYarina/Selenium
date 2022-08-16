package com.syntax.class2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HM2 {
    public static void main(String[] args) {
        //navigate to fb.com
        //click on create new account
        //fill up all the textboxes
        //click on sign up button
        //close the pop up
        //close the browser
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://fb.com");
        //driver.findElement()
driver.findElement(By.id("u_0_0_DK")).click();
driver.findElement(By.className("firstname")).sendKeys("Eva");
driver.findElement(By.className("lasrname")).sendKeys("Smith");
driver.findElement(By.className("reg_email__")).sendKeys("3022968985");
driver.findElement(By.id("password_step_input")).sendKeys("123456789");
driver.findElement(By.className("password_step_input")).sendKeys("123456789");

    }
}
