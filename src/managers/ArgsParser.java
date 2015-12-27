package managers;

/**
 * Created by Artur Spirin(a.spirin@hotmail.com) on 12/20/2015.
 **/
public class ArgsParser {

    /**
     * This method provides support for command line arguments:
     * Driver arg takes: --Driver:1 (To run w/ IE), --Driver:2 (To run w/ Firefox), --Driver:3 (To run w/ Opera).
     * If there is no Driver arg, Google Chrome will be used by default
     */
    public static void parse(String[] args){
        for(String arg:args){
            if(arg.contains("--Driver:"))
                DriverManager.setRequestedDriverId(Integer.parseInt(arg.replace("--Driver:","")));
        }
    }
}
