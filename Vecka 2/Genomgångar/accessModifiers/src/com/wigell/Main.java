package com.wigell;

public class Main {
  public static void main(String[] args) {

    // Skapa objekt
    Snake snake = new Snake("Snok", 90, "Svart", false);
    Snake snake2 = new Snake("Kobra", 50, "Grå", true);
    System.out.println(snake.toString());
    System.out.println(snake2.toString());
  }
}