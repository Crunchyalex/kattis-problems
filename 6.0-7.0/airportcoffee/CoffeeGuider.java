import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
public class CoffeeGuider{
    /**
     * https://open.kattis.com/problems/airportcoffee
     */
    public static plan(int[] vals, int stands, int[] positions){

    }

    public static void main(String[] args) throws Throwable{
        BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
        String[] valuesString    = bi.readLine().split("\\s");
        int numOfStands          = Integer.parseInt(bi.readLine());
        String[] distancesString = bi.readLine().split("\\s");

        int[] values = new int[valuesString.length];
        int[] distances = new int[numOfStands];

        int i = 0;
        while(i < values.length){
            if(i < numOfStands){
                distances[i] = Integer.parseInt(distancesString[i]);
            }
            values[i] = Integer.parseInt(valuesString[i]);
            i++;
        }

        CoffeeGuider.plan(values, numOfStands, distances);
    }

/**
    e = distance to walk
    a = no coffee speed 
    b = coffee speed
    t = cooldown (speed a)
    r = drink ( speed b)
*/


}