package pages;

import org.openqa.selenium.support.PageFactory;

/**
 * Created by Artur Spirin(a.spirin@hotmail.com) on 12/20/2015.
 **/
public class BNet_Diablo extends BasePage{

    /**
     * Constructor using PageFactory to initialize WebElements of the page
     */
    public BNet_Diablo(){
        PageFactory.initElements(driver, this);
        waitToLoad(TITLE);
    }

    /**
     * Expected URL and title of this page
     */
    public static final String

            URL = BNet_Home.URL+"d3",
            TITLE = "Diablo III Official Game Site";
}
