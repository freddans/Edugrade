import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    // char, String, int, double, boolean, Arrayer, for loop, kommentarer

    // char
    char a = 't';
    char a2 = 116; // siffertal talar om vilket aski-värde tecknet har

    System.out.println("char:");
    System.out.println(a);
    System.out.println("aski-värde: ");
    System.out.println(a2);
    System.out.println("------");

    // Sträng
    String string = "Detta är en sträng";

    System.out.println(string);
    System.out.println("------");


    // int - Heltal
    int b = 89;

    System.out.println(b);
    System.out.println("------");


    // double - Deciamaltal
    double c = 4.5;

    System.out.println(c);
    System.out.println("------");


    // boolean - är värdet uppfyllt? true eller false
    boolean d = true;
    boolean e = false;

    System.out.println(d);
    System.out.println(e);
    System.out.println("------");


    // Scanner input - ta emot något
    Scanner sc = new Scanner(System.in); // scanner
    System.out.println("Ange ett tal: "); // output message
    int input = sc.nextInt(); // input

    System.out.println("Du angav: " + input);
    System.out.println("------");


    // Arrayer

    // String Array
    String[] animals = new String[] {"Blåval", "Katt", "Hund", "Räka", "Får"};

    // fyll på animals-array:
//    animals[0] = "Blåval";
//    animals[1] = "Katt";
//    animals[2] = "Hund";
//    animals[3] = "Räka";
//    animals[4] = "Får";

    System.out.println(animals[4]);
    System.out.println("------");
    animals[4] = "Känguru";
    System.out.println(animals[4]);
    System.out.println("------");


    // for loop - print array
    int count = 0; // gör en count
    for (int i = 0; i < animals.length; i++) {
      count++;
      System.out.println(count + ": " + animals[i]); // skriver ut alla arrayer beroende på i
    }
  }
}