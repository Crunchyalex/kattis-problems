import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.Integer;
import java.lang.Math;

public class A1Paper {
    
    //private static HashMap
    public static void main(String[] args) throws Throwable{
        BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bi.readLine());
        String[] strs = bi.readLine().split(" ");
        int[] ints = new int[n-1];
        for(int i = 0; i < n-1; i++)
            ints[i] = Integer.parseInt(strs[i]);

        solve(ints, n-1);
    }

    private static void solve(int[] s, int size){
        boolean possible = false;
        double req = 2.0;
        double min = 0;
        double height = 0.5946035575013605;
        double width = 0.4204482076268573;
        for(int i = 0; i < size; i++){
            min += req * height;
            req -= s[i];
            if(req <= 0){
                possible = true;
                break;
            }
            req *= 2.0;

            double temp = height / 2.0;
            height = width;
            width = temp;
        }

        System.out.println(possible ? min/2 : "impossible");
    }
}