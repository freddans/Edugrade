package com.edugrade;

public class Main {
  public static void main(String[] args) {

    // object
    Snake snake = new Snake();
    Snake snake1 = new Snake("Snok", 90, "svart", false);
    Snake snake2 = new Snake("Kobra", 40, "Grå", true);
    System.out.println("Art: " + snake1.breed);
    System.out.println("Längd: " + snake1.length);
    System.out.println("Färg: " + snake1.color);
    System.out.println("Giftig: " + snake1.venomous); // skickar boolena poison till annan metod och retunerar String "Ja" eller "Nej".
    snake1.swim();
    System.out.println("--------------");
    System.out.println("Art: " + snake2.breed);
    System.out.println("Längd: " + snake2.length);
    System.out.println("Färg: " + snake2.color);
    System.out.println("Giftig: " + snake2.venomous);
    snake2.eat();

    System.out.println("---------------");
    System.out.println("GETTERS AND SETTERS");
    System.out.println("---------------");

    snake.setBreed("Huggorm");
    snake.setPoison(true);
    String x;
    String y;
    x = snake.getBreed();
    y = snake.getPoison();
    System.out.println(x);
    System.out.println(y);
  }
}