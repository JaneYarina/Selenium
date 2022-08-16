package classSelenium5;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class checkBoxDemo {
    public static String url = "http://syntaxprojects.com/basic-checkbox-demo.php";//istatnce variable need to be
    // the same as main method (public and static
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
       // driver.get("http://syntaxprojects.com/basic-radiobutton-demo.php");//passing a string
       // String url = "http://syntaxprojects.com/basic-radiobutton-demo.php";//url is a local variable.
        // it is inside the method
        driver.get(url);//need to be static because main method is static

       // driver.findElements(By.xpath("//input[@class = 'cb1-element']"));//to identify a group of elements we
        // need to find one common type in all of them
        List<WebElement> optionCheckboxes = driver.findElements(By.xpath("//input[@class = 'cb1-element']"));
int size = optionCheckboxes.size();
        System.out.println(size);

        for(WebElement option : optionCheckboxes){
           // option.click();

            //we need to set a condition to click only on 2 option
            String checkBoxValue = option.getAttribute("value");//alteration?
            if(checkBoxValue.equals("Option-4")){
                option.click();//uncheck
                break;//stopping alteration?
            }
        }


    }
}
