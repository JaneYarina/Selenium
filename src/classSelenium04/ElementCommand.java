package classSelenium04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementCommand {
    public static void main(String[] args) {

System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://syntaxprojects.com/basic-radiobutton-demo.php");
        WebElement ageButton = driver.findElement(By.cssSelector("input[value = '5 - 15']"));
        boolean isAgeButtonEnabled = ageButton.isEnabled();
        System.out.println(isAgeButtonEnabled);

       boolean isAgeButtonDisplayed  =  ageButton.isDisplayed();
        System.out.println(isAgeButtonDisplayed);

        boolean isAgeButtonSelected = ageButton.isSelected();//check if it is selected
        System.out.println("Before Clicking "+ isAgeButtonSelected);//false

        ageButton.click();//we changed the state of button
        //we need to reassign value to get different result
        //we are checking the state again
        isAgeButtonSelected = ageButton.isSelected();//boolean don't need because it is already defined in #21
        System.out.println("After clicking "+isAgeButtonSelected);


//driver.quit();
    }
}
