import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    // var
    int countOlder = 0; // count older ages
    int countExact = 0; // cound exact age
    int countYounger = 0; // count younger ages

    // Scanner
    Scanner sc = new Scanner(System.in);

    // array with 10 saved ages of employees
    int[] ages = new int[] {18, 55, 24, 55, 67, 19, 19, 19, 22, 34};

    // print in order to input on the same line.
    System.out.print("Skriv in en ålder som kan finnas i spannet 18-67: ");
    int ageInput = sc.nextInt(); // input age

    // for loop to loop through array and count ages and save in existing variable.
    for(int i = 0; i < ages.length; i++) {
      if (ageInput == ages[i]) {
        countExact++;
      } if (ageInput > ages[i]) {
        countYounger++;
      } if (ageInput < ages[i]) {
        countOlder++;
      }
    }
    if (countExact == 1) {
      System.out.println("Det finns " + countExact + " anställd som är " + ageInput + " år gammal.");
    } else if (countExact > 1) {
      System.out.println("Det finns " + countExact + " anställda som är " + ageInput + " år gamla.");
    } else if (countExact == 0) {
      System.out.println("Ingen anställd är " + ageInput + " år gammal." );
    }
    if (countYounger == 1) {
      System.out.println("Det finns " + countYounger + " anställd som är yngre än " + ageInput + " år.");
    } else if (countYounger > 1) {
      System.out.println("Det finns " + countYounger + " anställda som är yngre än " +ageInput + " år.");
    } else if (countYounger == 0) {
      System.out.println("Ingen anställd är yngre än " + ageInput + " år.");
    }
    if (countOlder == 1) {
      System.out.println("Det finns " + countOlder + " anställd som är äldre än " + ageInput + " år.");
    } else if (countOlder > 1) {
      System.out.println("Det finns " + countOlder + " anställda som är äldre än " + ageInput + " år.");
    } else if (countOlder == 0) {
      System.out.println("Ingen anställd är äldre än " + ageInput + " år.");
    }
  }
}