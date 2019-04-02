import java.util.*;

public class Bossbattle{


  private static final Scanner scanner = new Scanner(System.in);

  public static void main(String[] args){
    int n = scanner.nextInt();
    int start = 0;
    int boss = n-2;
    int count = 0;
    while(Math.abs((start%n) - (boss%n)) >= 1){
      System.out.println("Start: " + start);
      System.out.println("Boss: " + boss);

      start+= 2;
      boss++;
      count++;
    }
    if(count == 0)
      count = 1;
    System.out.println(count);
  }
}
