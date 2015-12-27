import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import pages.*;

/**
 * Created by Artur Spirin(a.spirin@hotmail.com) on 12/20/2015.
 **/
public class test_BNet_HomePage {

    BNet_Home page = new BNet_Home();

    @Before
    public void setUp(){
        page.open();
    }

    @Test
    public void testPromoWoW(){
        String expectedUrl = BNet_WoW.URL;
        String actualUrl = page.clickPromoWarcraft().getUrl();
        Assert.assertTrue("Expected: "+expectedUrl+" Got: "+actualUrl, actualUrl.contains(expectedUrl));
    }

    @Test
    public void testPromoDiablo(){
        String expectedUrl = BNet_Diablo.URL;
        String actualUrl = page.clickPromoDiablo().getUrl();
        Assert.assertTrue("Expected: "+expectedUrl+" Got: "+actualUrl, actualUrl.contains(expectedUrl));
    }

    @Test
    public void testPromoStarCraft(){
        String expectedUrl = BNet_StarCraft.URL;
        String actualUrl = page.clickPromoStarCraft().getUrl();
        Assert.assertTrue("Expected: "+expectedUrl+" Got: "+actualUrl, actualUrl.contains(expectedUrl));
    }

    @Test
    public void testPromoHeroes(){
        String expectedUrl = BNet_HotS.URL;
        String actualUrl = page.clickPromoHeroes().getUrl();
        Assert.assertTrue("Expected: "+expectedUrl+" Got: "+actualUrl, actualUrl.contains(expectedUrl));
    }

    @Test
    public void testPromoHearthStone(){
        String expectedUrl = BNet_HStone.URL;
        String actualUrl = page.clickPromoHearthStone().getUrl();
        Assert.assertTrue("Expected: "+expectedUrl+" Got: "+actualUrl, actualUrl.contains(expectedUrl));
    }

    @Test
    public void testPromoOverwatch(){
        String expectedUrl = BNet_Overwatch.URL;
        String actualUrl = page.clickPromoOverwatch().getUrl();
        Assert.assertTrue("Expected: "+expectedUrl+" Got: "+actualUrl, actualUrl.contains(expectedUrl));
    }
}
