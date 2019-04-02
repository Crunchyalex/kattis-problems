import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.Integer;

public class TakeTwoStones {
    public static void main(String[] args) throws Throwable{
        BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(bi.readLine()) % 2;
        System.out.println(input == 1 ? "Alice" : "Bob");
    }
}