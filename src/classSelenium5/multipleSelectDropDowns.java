package classSelenium5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class multipleSelectDropDowns {
    public static String url = "http://syntaxprojects.com/basic-select-dropdown-demo.php";

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        WebElement statesDD = driver.findElement(By.id("multi-select"));
        Select select = new Select(statesDD);
        boolean isMultiple = select.isMultiple();//this is a build in method which
        // checks if it is displayed or enabled selected and you getting g at results true or falls (Boolean answers)
        System.out.println(isMultiple);//it will return a boolean value
        //it said true. it means our value is multiple sellect

        /*print all the options and select everything by  the text
         */
        if (isMultiple) {//if the value is multiple im going to get
            // the options and loop through them and select each by visible text
            List<WebElement> options = select.getOptions();

            for (WebElement option : options) {
                String optionText = option.getText();
                select.selectByVisibleText(optionText);
                /*select everything if only the DropDown is multiple select
                 */
select.deselectByIndex(5);
select.deselectAll();
            }

        }
    }
}
