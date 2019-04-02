import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.Integer;

public class SolvingForCarrots {
    public static void main(String[] args) throws Throwable{
        BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
        String input = bi.readLine();
        System.out.println(input.substring(2));
    }
}