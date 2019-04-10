import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.Integer;
import java.util.*;
import java.util.stream.Collectors;

public class AlmostUnionFind {
    private static int[] parent;
    private static long[] sum;
    private static int[] num;

    private static int find(int i){
        if(i == -1) 
            return -1;
        else 
            return (parent[i] = parent[i] != i ? find(parent[i]) : parent[i]);
    }

    private static void init(int n){
        int max = (n * 2) + 1;
        parent = new int[max];
        sum    = new long[max];
        num    = new int[max];

        for(int i = 1; i <= n; i++){
            parent[i]   = i+n;
            parent[i+n] = i+n;
            sum[i+n] = i;
            num[i+n] = 1;
        }
    }

    public static void main(String[] args) throws IOException{
        BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
        String input;
        while((input = bi.readLine()) != null ){
            String[] vals = input.split(" ");
            int n = Integer.valueOf(vals[0]);
            int m = Integer.valueOf(vals[1]);
            init(n);

            for(int i = 0; i < m; i++){
                input = bi.readLine();
                vals  = input.split(" ");
                String method = vals[0];
                int p = Integer.valueOf(vals[1]);
                int q = method.equals("3") ? -1 : Integer.valueOf(vals[2]);
                int x = find(p);
                int y = find(q);
                if(x == y) continue;

                    switch(method){
                        case "1":
                            parent[x] = y;
                            sum[y] += sum[x];
                            num[y] += num[x];
                            break;
                        case "2":
                            parent[p] = y;
                            sum[y] += p;
                            sum[x] -= p;
                            num[y]++;
                            num[x]--;
                            break;
                        case "3":
                            System.out.println(num[x] + " " + sum[x]);
                }
            }
        }
    }
}