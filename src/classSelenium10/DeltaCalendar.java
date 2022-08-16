package classSelenium10;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;
public class DeltaCalendar {


        public static String url = "http://www.delta.com";

        public static void main(String[] args) throws InterruptedException {
            System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
            WebDriver driver = new ChromeDriver();
            driver.get(url);
            //driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);//to find an element

            WebElement calendar = driver.findElement(By.id("calDepartLabelCont"));//we found calendar on the webpage
            calendar.click();

            WebElement nextButton = driver.findElement(By.xpath("//span[text() = 'Next']"));//buttton to search date in caledndar
            WebElement dMonth = driver.findElement(By.className("dl-datepicker-month-0"));//we chose claasName to make it dinamic
            String dMonthText = dMonth.getText();

            // click on next until month is October
            while(!dMonthText.equals("October")) {//need to cklick when moth is not October. it will stop when it become october
                nextButton.click();
                dMonthText = dMonth.getText();//we need to reising it in the while loop because the month
                // will be curent moth till we put method getText(); in the loop after method .click(); We need reasing text afetr each iteration

                //we are not using for loop becouse we dont know how many times we are going to
                //now we need to locate the dates
            }

            List<WebElement> departDates = driver.findElements(By.xpath("//tbody[@class = 'dl-datepicker-tbody-0']/tr/td"));
            for(WebElement departDate: departDates) {
                if(departDate.getText().equals("30")) {
                    departDate.click();
                    break;
                }
            }

            WebElement rMonth = driver.findElement(By.className("dl-datepicker-month-1"));
            String rMonthtext = rMonth.getText();

            while(!rMonthtext.equals("December")) {
                nextButton.click();
                rMonthtext = rMonth.getText();
            }

            List<WebElement> returnDates = driver.findElements(By.xpath("//tbody[@class = 'dl-datepicker-tbody-1']/tr/td"));
            for(WebElement returnDate: returnDates) {
                if(returnDate.getText().equals("20")) {
                    returnDate.click();
                    break;
                }
            }
            WebElement doneButton = driver.findElement(By.className("donebutton"));
            doneButton.click();
        }

    }


