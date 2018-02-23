package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import utils.Properties;

public class SlingplayerPage {
    private EventFiringWebDriver driver;
    private String finderID = "252300CBA05BAA4397B00C06440C5B4C";
    private String password = "admin";

    private By cps_parallel_connection = By.id("cps-connection-type");

    public SlingplayerPage(EventFiringWebDriver driver){
        this.driver = driver;
    }

    public void openSlingPlayerURL(){
        driver.get(Properties.getBaseAdminURL());
    }
//        WebDriverWait wait = new WebDriverWait(driver, 10);
//        wait.until(ExpectedConditions.visibilityOfElementLocated(element);
}
