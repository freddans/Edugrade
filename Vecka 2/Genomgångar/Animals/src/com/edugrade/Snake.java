package com.edugrade;

public class Snake {

  // var
  String breed;
  int length;
  String color;
  boolean poison;
  String venomous = "";

  // metoder
  void swim() { System.out.println("Ormen simmar"); }
  void eat() { System.out.println("Ormen äter"); }
  String isPoison(boolean poison) {
    if (poison) {
      return venomous = "Ja";
    } else {
      return venomous = "Nej";
    }
  }

  public Snake() {
    // empty constructor
     }

     // hel konstruktor
  public Snake(String breed, int length, String color, boolean poison) {

    isPoison(poison); // skickar boolean true eller false till isPoison som sedan returnerar ja eller nej.
    this.breed = breed;
    this.length = length;
    this.color = color;
    this.poison = poison;
  }

  // getters and setters
  public void setBreed(String breed) {
    this.breed = breed;
  }
  public String getBreed() {
    return breed;
  }
  public void setLength(int length) {
    this.length = length;
  }
  public int getLength() {
    return length;
  }
  public void setColor(String color) {
    this.color = color;
  }
  public String getColor() {
    return color;
  }
  public void setPoison(boolean poison) {
    this.poison = poison;
    isPoison(poison);
  }
  public String getPoison() {
    return venomous;
  }
}
