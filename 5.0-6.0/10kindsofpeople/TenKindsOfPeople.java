import java.util.*;

public class TenKindsOfPeople{




  private static final Scanner scanner = new Scanner(System.in);

   public static void main(String[] args) {
     System.out.println(args[0]);
       int r = scanner.nextInt();
       int c = scanner.nextInt();
       int[][] map = new int[c][r];

       for(int i = 0; i<r; i++){
         for(int j = i; j<c; j++){
            map[i][j] = scanner.nextInt();
            System.out.print(map[i][j]);
         }
         System.out.println();
       }




       scanner.close();
   }
}
