package pages;

import managers.DriverManager;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.util.concurrent.TimeUnit;

/**
 * Created by Artur Spirin(a.spirin@hotmail.com) on 12/26/2015.
 */
public class BasePage {

    /**
     * Instance of WebDriver is created automatically using Singleton method
     */
    protected static WebDriver driver = DriverManager.getDriver();

    /**
     * Will return the url of the page
     */
    public String getUrl(){
        return driver.getCurrentUrl();
    }

    /**
     * Will return the title of the page
     */
    public String getTitle(){
        return driver.getTitle();
    }

    /**
     * Will wait for the element to become visible on the page, then it will assume the page is loaded
     * @param element Can be any element on the page that you expect to load.
     *               If you want to make sure the page is fully loaded, use the element on the bottom
     *               of the page (Footer link, for example)
     */
    public static void waitToLoad(WebElement element){
        Wait wait = new FluentWait(driver)
                        .withTimeout(30, TimeUnit.SECONDS)
                        .pollingEvery(500, TimeUnit.MILLISECONDS)
                        .ignoring(NoSuchElementException.class);
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    /**
     * Will wait for the title that you pass it
     * @param title Should be the exact title of the page that you expect to be loaded
     */
    public static void waitToLoad(String title){
        Wait wait = new FluentWait(driver)
                        .withTimeout(30, TimeUnit.SECONDS)
                        .pollingEvery(500, TimeUnit.MILLISECONDS);
        wait.until(ExpectedConditions.titleIs(title));
    }
}
