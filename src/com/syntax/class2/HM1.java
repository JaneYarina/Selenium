package com.syntax.class2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class HM1 {

    public static void main(String[] args) {
       //navigate to https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22
        //fill out the form
        //click on register
       // close the browser

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B2");
        WebElement FirstName = driver.findElement(By.id("customer.firstName"));
        FirstName.sendKeys("Eva");
        WebElement LastName = driver.findElement(By.id("customer.lastName"));
        LastName.sendKeys("Smith");
        //WebElement.UserAddress = driver.findElement(By.id("customer.address.street"));
       // UserAddress.sendKeys("1234 Bath ave 2N");
       // WebElement.city = driver.findElement(By.id("customer.address.city"));
        //city.sendKeys("Brooklyn");
        driver.findElement(By.id("customer.address.street")).sendKeys("1234 Bath ave 2N");
        driver.findElement(By.id("customer.address.city")).sendKeys("Brooklyn");
        driver.findElement(By.id("customer.address.state")).sendKeys("NY");
        driver.findElement(By.id("customer.address.zipCode")).sendKeys("11209");
        driver.findElement(By.id("customer.phoneNumber")).sendKeys("(302) 345-456");
        driver.findElement(By.id("customer.ssn")).sendKeys("234-87-0987");
        driver.findElement(By.id("customer.username")).sendKeys("asdfgh");
        driver.findElement(By.name("customer.password")).sendKeys("12345678910");
        driver.findElement(By.name("repeatedPassword")).sendKeys("12345678910");
        driver.findElement(By.className("button")).click();
driver.findElement(By.name("username")).sendKeys("asdfgh");
driver.findElement(By.name("password")).sendKeys("12345678910");
        driver.findElement(By.className("button")).click();
        driver.quit();







    }
}
