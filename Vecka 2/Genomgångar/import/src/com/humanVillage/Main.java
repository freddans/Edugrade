package com.humanVillage;

import Jungle.Snake;

public class Main {
  public static void main(String[] args) {

    // Skapa objekt
    Person person = new Person();
    Snake snake = new Snake();


    person.setName("Mowgli"); // döper person till Mowgli
    snake.setName("Kaa"); // döper snake till Kaa

    // kör metod callPet där vi skriver in våra skapade objekt
    person.callPet(person, snake);
  }
}