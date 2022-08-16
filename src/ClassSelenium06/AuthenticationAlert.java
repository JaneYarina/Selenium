package ClassSelenium06;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticationAlert {

   // our user name (admin) and password (admin) we are going to place inside URL
  // public static  String url = "https://the-internet.herokuapp.com/basic_auth"; // before
    public static  String url = "https://admin:admin@the-internet.herokuapp.com/basic_auth";//after
    //username:password@
    public static void main(String[] args) {
      System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
      WebDriver driver = new ChromeDriver();
      driver.get(url);
    }

}
