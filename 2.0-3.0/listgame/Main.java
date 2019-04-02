import java.util.*;

public class Main{

  private static final Scanner scanner = new Scanner(System.in);

  public static void main(String[] args){
    int num = scanner.nextInt();
    int result = 0;

    //If the last digit is even
    if((num % 10) % 2 == 0){
      double divider = num/2;
      result = 2;
      while(divider % result == 0){
        result = result * 2;
        divider = divider/2;
        System.out.println(divider);
      }
      System.out.println ("yes");
    }
    System.out.println(num);
    System.out.println(result);
  }
}
