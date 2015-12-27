package pages;

import managers.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Artur Spirin(a.spirin@hotmail.com) on 12/20/2015.
 **/
public class BNet_Home extends BasePage{

    /**
     * Constructor using PageFactory to initialize WebElements of the page
     */
    public BNet_Home(){
        PageFactory.initElements(driver, this);
    }

    /**
     * Expected URL and title of this page
     */
    public static final String

            URL = "http://us.battle.net/",
            TITLE = "Battle.net";

    /**
     * PageFactory initializes all of the annotated(@FindBy) WebElements
     * in the constructor when this page object is created
     */
    @FindBy(id="home-game-wow")
    private WebElement promoWarcraft;

    @FindBy(id="home-game-d3")
    private WebElement promoDiablo;

    @FindBy(id="home-game-sc2")
    private WebElement promoStarCraft;

    @FindBy(id="home-game-heroes")
    private WebElement promoHeroes;

    @FindBy(id="home-game-hs")
    private WebElement promoHearthStone;

    @FindBy(id="home-game-overwatch")
    private WebElement promoOverwatch;

    /**Opens the page and returns it self*/
    public BNet_Home open(){
        DriverManager.getDriver().get(URL);
        return this;
    }

    /**Clicks on the World of Warcraft promotion card*/
    public BNet_WoW clickPromoWarcraft(){
        promoWarcraft.click();
        return new BNet_WoW();
    }

    /**Clicks on the Diablo 3 promotion card*/
    public BNet_Diablo clickPromoDiablo(){
        promoDiablo.click();
        return new BNet_Diablo();
    }

    /**Clicks on the StarCraft 2 promotion card*/
    public BNet_StarCraft clickPromoStarCraft(){
        promoStarCraft.click();
        return new BNet_StarCraft();
    }

    /**Clicks on the Heroes of the Storm promotion card*/
    public BNet_HotS clickPromoHeroes(){
        promoHeroes.click();
        return new BNet_HotS();
    }

    /**Clicks on the HearthStone promotion card*/
    public BNet_HStone clickPromoHearthStone(){
        promoHearthStone.click();
        return new BNet_HStone();
    }

    /**Clicks on the Overwatch promotion card*/
    public BNet_Overwatch clickPromoOverwatch(){
        promoOverwatch.click();
        return new BNet_Overwatch();
    }
}
