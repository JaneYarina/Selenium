package classSelenium5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class amazonExersise {
//     System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
//    WebDriver driver = new ChromeDriver();
//        driver.get("https://www.amazon.com");

    public static String url = "https://www.amazon.com";
    public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
//1) we need to select the tag on the website then we can use tis class
// 2) identify the DropDown as an WebElement:
        WebElement categorieDD = driver.findElement(By.id("searchDropdownBox"));
        //3)create an object Select class and pass parametr from the WebElement:
  Select select = new Select(categorieDD);
  //4) to print out all the options from dropDown we can use advanced For LOOP
       //first  we need to store all the elements of the same category in the list of WebElements
        //we are creating a List of Webelelments and name them "Options".
        // We are using class Select and method getOption() to extract all the options in a dropdown
        List<WebElement> options = select.getOptions();
        //type     identyfier: name of the array
        for(WebElement option: options){
            String optionText = option.getText();
            System.out.println(optionText);

        }
        select.selectByValue("search-alias=alexa-skills");



    }
}
