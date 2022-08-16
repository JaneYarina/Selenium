package SeleniumClass09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class WebPagesWithPaginations {
    public static String url = "http://syntaxprojects.com/table-pagination-demo.php";

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        List<WebElement> rows = driver.findElements(By.xpath("//tbody[@id='myTable']/tr"));
        WebElement nextButton = driver.findElement(By.xpath("//a[@class='next_link']"));
        boolean notFound = true;

        while (notFound) {//if my flag is true , im going inside the loop
            for (WebElement row : rows) {
                String rowText = row.getText();
                System.out.println(rowText);
                if (rowText.contains("Archy J")) {
                    notFound = false;
                    System.out.println(rowText);
                    break;
                }

            }
            if (notFound) {


                nextButton.click();//we are clicking when my flag is true//this is belong to while loop

            }
        }

    }

    }

