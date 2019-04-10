import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.Integer;
import java.util.*;

public class Savez {

    public static void main(String[] args) throws Throwable{
        BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bi.readLine());
        int HASH = 1000000009;
        HashMap<Integer,Integer> map = new HashMap();
        int max = 1;

        char[] input;
		for(int i = 0; i < n; i++) {
            input   = bi.readLine().toCharArray(); 
            int size = input.length;

			int[] hash = new int[size];
			long mult = 1;
			long last = 0;
			for(int j = 0; j < size; j++) {
				last = (last + (input[j]-'A'+1) * 1l * mult) % HASH;
				hash[j] = (int) last;
				mult    = mult * 31 % HASH;
			}
			
			int curr = 1;
			mult = 1;
			for(int j = size; 0 < j; j--) {
                int pre = hash[j-1];
                int suf = hash[size-1];
                if(j != size) suf = suf - hash[size-1-j];

				if(suf < 0)
					suf += HASH;
				
				if(suf == (pre * 1l * mult%HASH)){
                    int mapped = map.getOrDefault(pre, 0) + 1;
                    curr = curr < mapped ? mapped : curr;
                }
				mult = mult * 31%HASH;
			}
			map.put(hash[size-1], curr);
			max = Math.max(max, curr);
		}

        System.out.println(max);
    }
}