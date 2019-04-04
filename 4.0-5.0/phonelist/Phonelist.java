import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.Integer;
import java.util.ArrayList;
import java.util.Collections;

public class Phonelist {
    private static void solve(ArrayList<String> nums, int length){
        Collections.sort(nums);
        boolean consistent = true;
        for(int i = 0; i < length - 1; i++){
            if (nums.get(i + 1).startsWith(nums.get(i))){
                consistent = false;
                break;
            }
        }
        System.out.println(consistent ? "YES" : "NO");
    }
    public static void main(String[] args) throws Throwable{
        BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
        int cases = Integer.parseInt(bi.readLine());
        for(int i = 0; i < cases; i++){
            int nums = Integer.parseInt(bi.readLine());
            ArrayList<String> phonenumbers = new ArrayList<>();
            for(int j = 0; j < nums; j++){
                phonenumbers.add(bi.readLine());
            }
            solve(phonenumbers, nums);
        }
    }
}