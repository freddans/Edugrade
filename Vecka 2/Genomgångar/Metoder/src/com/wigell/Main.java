package com.wigell;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    // scanner
    Scanner sc = new Scanner(System.in);
    System.out.print("Ange ett tal: ");
    String input = sc.nextLine();

    System.out.println(input + 14);

    // sparar string i variabel x
    // skickar input string till metod i klass "Parse"
    int x = new Parse().parseInt(input);

    System.out.println("Du angav " + x);

    // då det nu är en int blir output nedan 15.
    System.out.println(x+14);
  }
}