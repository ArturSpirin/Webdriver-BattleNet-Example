package pages;

import org.openqa.selenium.support.PageFactory;

/**
 * Created by Artur Spirin(a.spirin@hotmail.com) on 12/20/2015.
 **/
public class BNet_Overwatch extends BasePage{

    /**
     * Constructor using PageFactory to initialize WebElements of the page
     */
    public BNet_Overwatch(){
        PageFactory.initElements(driver, this);
        waitToLoad(TITLE);
    }

    /**
     * Expected URL and title of this page
     */
    public static final String

            URL = BNet_Home.URL+"overwatch",
            TITLE = "Overwatch";
}
