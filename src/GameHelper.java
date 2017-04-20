import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Vladisson on 21.04.2017.
 */
public class GameHelper {
    public String getUserInput(String promt){
        String inputLine = null;
        System.out.print( promt + "  ");
        try {
            BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
            inputLine = is.readLine();
            if (inputLine.length() == 0) return null;
        }
        catch ( IOException e){
            System.out.println("IOException: " + e);
        }
        return inputLine;

    }

}
