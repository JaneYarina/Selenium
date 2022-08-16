package com.syntax.class3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo3 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver =new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        /*WebElement userName = driver.findElement(By.xpath("//input[@id='txtUsername']"));
        userName.sendKeys("Admin");
        WebElement password = driver.findElement((By.xpath("//input[@id='txtPassword']")));
        password.sendKeys("Hum@nhrm123");
        WebElement loginButton =driver.findElement(By.xpath("//input[contains(@value,'LOGIN')]"));
        loginButton.click();*/
    }
}
