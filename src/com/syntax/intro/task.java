package com.syntax.intro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class task {
    public static void main(String[] args) {


        /*1.launch the browser
        2. navigate to amazon web site
        3. print out the titile and the url in the console
        4. close the browser
         */
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver =new ChromeDriver();
        driver.get("http://www.amazon.com");
        String title = driver.getTitle();
        String url= driver.getCurrentUrl();
        System.out.println(title+" "+url);// Amazon.com. Spend less. Smile more.   https://www.amazon.com/
        driver.quit();

    }
}
