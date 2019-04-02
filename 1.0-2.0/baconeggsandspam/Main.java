import java.util.*;

/**
* https://open.kattis.com/problems/baconeggsandspam
*/
public class Main{

  private static final Scanner scanner = new Scanner(System.in);

  public static void main(String[] args){
    HashMap<String, List<String>> map;

    while(scanner.hasNext()){
      int numOfCustomers = scanner.nextInt();
      if(numOfCustomers == 0){
        return;
      }
      map = new HashMap<String, List<String>>();
      Set<String> items = new HashSet<String>();

      for(int i = 0; i < numOfCustomers+1; i++){
        String line = scanner.nextLine();
        String[] order = line.split(" ");
        for(int j = 1; j < order.length; j++){
          List<String> people = map.get(order[j]);
          if(people == null){
            String person = order[0];
            List<String> list = new ArrayList<String>();
            list.add(person);
            map.put(order[j], list);
          }
          else{
            people.add(order[0]);
            map.put(order[j], people);
          }
          items.add(order[j]);
        }
      }
      ArrayList<String> sortedItems = new ArrayList<String>();
      List<String> sortedPeople;
      sortedItems.addAll(items);
      Collections.sort(sortedItems);
      for(String s: sortedItems){
        System.out.print(s + " ");
        sortedPeople = map.get(s);
        Collections.sort(sortedPeople);
        for(int i = 0; i < sortedPeople.size(); i++){
          System.out.print(sortedPeople.get(i));
          if(i != sortedPeople.size()-1){
            System.out.print(" ");
          }
        }
        System.out.println();
      }
      System.out.println();
    }
  }
}
