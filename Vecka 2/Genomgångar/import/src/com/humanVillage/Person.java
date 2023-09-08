package com.humanVillage;
import Jungle.Snake;

public class Person {
  // var
  private String name;
  private Snake snake;

  // metoder
  public void callPet(Person person, Snake snake) {
    System.out.println("YO! " + snake.getName() + "! Det är + " + person.getName() + ". Kom hem nu!");
    System.out.println(snake.answer());
  }

  // Getters and Setters

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Snake getSnake() {
    return snake;
  }

  public void setSnake(Snake snake) {
    this.snake = snake;
  }


  // konstruktor
}
