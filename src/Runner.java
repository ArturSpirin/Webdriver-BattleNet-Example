import managers.ArgsParser;
import org.junit.runner.JUnitCore;

/**
 * Created by Artur Spirin(a.spirin@hotmail.com) on 12/20/2015.
 **/
public class Runner {

    public static void main(String[] args){
        ArgsParser.parse(args);
        JUnitCore.runClasses(
                test_BNet_HomePage.class
        );
    }
}
