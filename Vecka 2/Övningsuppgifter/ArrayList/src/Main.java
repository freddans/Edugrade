import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    // ArrayList
    List<String> names = new ArrayList<>();

    // Scanner
    Scanner sc = new Scanner(System.in);

    for (int i = 0; i < 10; i++) {
      String input = sc.nextLine(); // scanner taking inputs
      names.add(input); // adding input into names-list
    }

    // delete name in index2
    names.remove(2);

    // output names
    System.out.println(names);
  }
}