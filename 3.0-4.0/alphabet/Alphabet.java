import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Alphabet{
    
    private static int solve(char[] in){
        char[] r = new char[in.length];
        int maxHeight = 1;
        int h = 0;
        r[0] = in[0];
        for(int i = 1; i < in.length; i++){
            boolean inserting = true;
            h = maxHeight;
            while(inserting){
                if(h == -1){
                    r[h+1] = in[i]; inserting = false;
                }
                else if(r[h] != 0){
                    if(in[i] == r[h]) inserting = false;
                    else if(in[i] < r[h]) h--;
                    else{
                        r[h+1] = in[i];
                        inserting = false;
                        if(h+1 == maxHeight)
                            maxHeight++;
                    }
                }
                else h--;
            }
        }
        return 26-maxHeight;
    }


    public static void main(String[] args) throws Throwable{
        BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
        String input = bi.readLine();

        int answer = solve(input.toCharArray());
        System.out.println(answer);
    }
}