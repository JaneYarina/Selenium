package SeleniumClass09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class HandlyngDynamicTables {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
        WebElement Username = driver.findElement(By.id("ctl00_MainContent_username"));
        Username.sendKeys("Tester");
        WebElement Password = driver.findElement(By.id("ctl00_MainContent_password"));
        Password.sendKeys("test");
        Thread.sleep(2000);
        WebElement loginButton =driver.findElement(By.className("button"));
loginButton.click();

        List<WebElement> rows=driver.findElements(By.xpath("//table[@class='SampleTable']/tbody/tr"));
        for (int i=1; i<rows.size(); i++){//if we do it from 0 then we will get to the header row data,
            // because header is not defined in this table
            String rowText=rows.get(i).getText();//remember that. we are useing iterator
            System.out.println(rowText);
            //if we want to chlick on one spesific check box
            //we are going to use if condition
            //if(rowText.contains("Bob Feather"))
            if(rowText.contains("FamilyAlbum"))
            {
                List<WebElement> checkboxes=driver.findElements(By.xpath("//table[@class='SampleTable']/tbody/tr/td[1]"));
                checkboxes.get(i-1).click();//we did -1 becouse the program start to che k boxes from 2nd row, becouse i=1
                //it understand that 1 is not included becouse i++ means one step ahed always
                //NOw we want to chlick on several boxes we need to find something in common with them
               // and instead "Bob Feather to put common word like "Family album"
                //other way is if else condition


            }

        }
    }
}
