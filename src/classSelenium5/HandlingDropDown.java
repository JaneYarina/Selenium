
package classSelenium5;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class HandlingDropDown {
public static String url = "http://syntaxprojects.com/basic-select-dropdown-demo.php";



    public static void main(String[] args) throws InterruptedException{
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        WebElement daysDD = driver.findElement(By.id("select-demo"));//identyfying dropdown as a single element
        //we identified dropDown as a WebElement,
        // as a single element and store it in daysD variable
        Select select = new Select(daysDD);//creating an object of a select class and telling selenium to use Select class
        //use element (daysDD)-we passing the value inside the costructor
        //select is a select class. Every time we are working with a new dropdow ,
        // we need to create a new select class
        //select.selectByIndex(3);//Tuesday(#4); please select is(#0),
        select.selectByIndex(1);//Sunday
        Thread.sleep(2000);

        select.selectByVisibleText("Monday");
        select.selectByValue("Friday");//value ="Friday"
        //txt is between the tags. >Friday<

        List<WebElement> allOptions = select.getOptions(); //creating a list of options webElements,
        // and storing them inside allOptions variable
        int size  = allOptions.size();
        System.out.println(size);
        //i need to loop each variable in the sist and get the text for each option in order to print all dsays
        for (int i=1; i <size ; i++){
           String option =  allOptions.get(i).getText();
            System.out.println(option);
            select.selectByIndex(i);
            Thread.sleep(2000);
        }



    }
}
