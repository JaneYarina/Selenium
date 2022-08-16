package SeleniumClass09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.w3c.dom.html.HTMLInputElement;
import sun.plugin.dom.core.Element;

import java.util.List;

public class handlingPaginations {
    public static String url = "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login";

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        WebElement userName = driver.findElement(By.id("txtUsername"));
        userName.sendKeys("Admin");
        WebElement password = driver.findElement(By.id("txtPassword"));
        password.sendKeys("Hum@nhrm123");
        WebElement loginButton = driver.findElement(By.id("btnLogin"));
        loginButton.click();
//in order for us to find element we will need to find Implicitly
        WebElement PIM = driver.findElement(By.id("menu_pim_viewPimModule"));
        PIM.click();
        WebElement AddEmplyoee = driver.findElement(By.id("menu_pim_viewEmployeeList"));
        AddEmplyoee.click();
        WebElement AddButton = driver.findElement(By.id("btnAdd"));
        AddButton.click();
        WebElement FirstName = driver.findElement(By.id("firstName"));
        FirstName.sendKeys("John");
        WebElement LastName = driver.findElement(By.id("lastName"));
        LastName.sendKeys("Smith");

        WebElement EmployeeIDField = driver.findElement(By.id("employeeId"));
        String EmployeeID = EmployeeIDField.getAttribute("value");//get ID number

        WebElement SaveButton = driver.findElement(By.id("btnSave"));
        SaveButton.click();
        WebElement EmploeeList = driver.findElement(By.id("menu_pim_viewEmployeeList"));
        EmploeeList.click();


       // List<WebElement> tableRows = driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr"));
//next we need to find NEXT button
        //WebElement NextButton = driver.findElement(By.linkText("Next"));
        //now we need Boolean value
        boolean NotFound = true;

        while (NotFound) {
            //i remove this row from row 46 and put it inside while loop because it gave an error
            List<WebElement> tableRows = driver.findElements(By.xpath("//table[@id = 'resultTable']/tbody/tr"));
            for (int i = 0; i < tableRows.size(); i++) {
//we need to get the text before set conditions
                String rowText = tableRows.get(i).getText();
                //now swe need to set conditions for compare for text contents
                if (rowText.contains(EmployeeID)) {
                    //we need change conditions. we need to set our boolean as folse`
                    NotFound = false;
                    //we need to click on checkbox td-columns, tr -rows
//List<WebElement> checkBoxes = driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr/td[1]"));
//if we want to identify a single checkbox. let's do first one //table[@id='resultTable']/tbody/tr[1]/td[1]
//can we store xpath instead of one element instead of List of elements an keep that dynamic?
                    // we identify the checkbox dynamically
                    WebElement checkBox = driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr/[" + i + "]td[1]"));
                    checkBox.click();
                    //new
                    WebElement deleteButton = driver.findElement(By.id("btnDelete"));
                    deleteButton.click();
                    WebElement confirmDelete = driver.findElement(By.id("dialogDeleteBtn"));
                    confirmDelete.click();
                    break;

                }

            }
            //if employee not found is still true then im going to click on it
            if (NotFound) {
                WebElement NextButton = driver.findElement(By.linkText("Next"));//we moved this row from  row 48
                //because the page get refreshed
                NextButton.click();
            }
        }

    }
}

