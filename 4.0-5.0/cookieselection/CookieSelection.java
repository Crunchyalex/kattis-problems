import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.Integer;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Collections;


public class CookieSelection {

    static PriorityQueue<Integer> left  = new PriorityQueue<>(Collections.reverseOrder());
    static PriorityQueue<Integer> right = new PriorityQueue<>();
    static int median = 0;

    public static void main(String[] args) throws Throwable{
        BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
        String input;

        while((input = bi.readLine()) != null){
            if(input.equals("#")){
                System.out.println(left.size() == right.size() ? right.poll() : left.poll());
            }
            else{
                int val = Integer.parseInt(input);
                
                if(median == 0){
                    left.add(val); 
                    median = val;
                }
                else if(median < val){
                    right.add(val);
                    if((left.size() - right.size()) < 0) {
                        median = right.poll();
                        left.add(median);
                    } 
                }
                else{
                    left.add(val);
                    if(1 < (left.size() - right.size())){
                        median = left.poll();
                        right.add(median);
                    }
                }
            }
        }
    }
}