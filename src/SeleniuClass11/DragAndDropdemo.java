package SeleniuClass11;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

    public class DragAndDropdemo {

        public static String url = "https://jqueryui.com/droppable/";

        public static void main(String[] args) throws InterruptedException {
            System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
            WebDriver driver = new ChromeDriver();
            driver.get(url);



            driver.switchTo().frame(0);//we switch to the frame where our elements are
            WebElement draggable = driver.findElement(By.id("draggable"));
            WebElement droppable = driver.findElement(By.id("droppable"));

            Actions action = new Actions(driver);
            action.dragAndDrop(draggable, droppable).perform();//which element(draggable),where(dopable)//dosen work becouse we will need witch to the frame
            // if more then one action use build and then perform
            // build() will combine all the actions into one
            //action.clickAndHold(draggable).moveToElement(droppable).release().build().perform();
            //driver.navigate().refresh();//to refresh page
        }
    }

