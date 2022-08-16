package classSelenium08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class HandleStaticWebTables {

    public static String url = "http://syntaxprojects.com/table-search-filter-demo.php";

    public static void main(String[] args) {
  System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        List<WebElement> rowData = driver.findElements(By.xpath("//table[@id ='task-table']/tbody/tr"));//gives us array list
        System.out.println(rowData.size());//7

        //

        //get to the single elelment
        for (WebElement row : rowData) {
            // System.out.println(it.next().getText());
            String rowText = row.getText();
            System.out.println(rowText);
        }
       /* System.out.println("____________________________");
        //we want print ech data ftom table to console
        List<WebElement> colsData = driver.findElements(By.xpath("//table[@id ='task-table']/thead/tr/th"));
        for(WebElement colData: colsData){
            String colText =colData.getText();
            System.out.println(colText);*/

        //}
        System.out.println("_____________________________");
    List<WebElement> colsData  =driver.findElements(By.xpath("//table[@id ='task-table']/tbody/tr[2]/td[4]"));
    for(WebElement colData: colsData) {
            String colText = colData.getText();
            System.out.println(colText);//completed

        }
        System.out.println("_________________________________");
        driver.findElements(By.xpath("//table[@id ='task-table']/tbody/tr/td[2]"));
        for(WebElement colData: colsData) {
            String colText = colData.getText();
            System.out.println(colText);
        }
    }
}
