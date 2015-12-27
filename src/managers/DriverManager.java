package managers;

import com.opera.core.systems.OperaDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by Artur Spirin(a.spirin@hotmail.com) on 12/20/2015.
 **/
public class DriverManager {

    private static WebDriver driver = null;

    /**
     * Supported Driver IDs:
     * 1: IE
     * 2: Firefox
     * 3: Opera
     * Default: Google Chrome
     */
    private static int requestedDriverId;
    private static int lastDriverId;

    /**
     * Method creates a driver once, based on the @requestedDriverId, and than returns that driver to the caller.
     * If the @requestedDriverId changes and this method is called, old driver will be closed and a new one will be
     * created in its place
     * @return WebDriver
     */
    public static WebDriver getDriver() {
        if(driver==null || requestedDriverId != lastDriverId){
            if(driver!=null) driver.quit();
            if(requestedDriverId==1){
                driver = new InternetExplorerDriver();
                setLastDriverId(1);
            }
            else if(requestedDriverId==2) {
                driver = new FirefoxDriver();
                setLastDriverId(2);
            }
            else if(requestedDriverId==3) {
                driver = new OperaDriver();
                setLastDriverId(3);
            }
            else{
                driver = new ChromeDriver();
                setLastDriverId(0);
            }
        }
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS).implicitlyWait(10, TimeUnit.SECONDS);
        return driver;
    }

    /**
     * Sets @requestedDriverId so that getDriver() method knows what driver to create. This allows for more flexibility
     * when testing (Running parameterized tests, for example).
     * @param value
     */
    public static void setRequestedDriverId(int value){
        requestedDriverId=value;
    }

    /**
     * Sets @lastDriverId so that getDriver() method can compare @requestedDriverId with @lastDriverId to know if
     * it needs to create a new WebDriver or if it can reuse the existing one
     * @param value
     */
    private static void setLastDriverId(int value){
        lastDriverId=value;
    }
}
