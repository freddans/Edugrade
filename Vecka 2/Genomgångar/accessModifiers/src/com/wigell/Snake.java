package com.wigell;

public class Snake {
  // var
  private String breed;
  private int length;
  private String color;
  private boolean poison;

  // methods
  public void swim() {
    System.out.println("Ormen simmar");
  }
  public void eat() {
    System.out.println("Ormen äter");
  }

  // Konstruktorer

  // Tom konstruktor
  public Snake() {

  }
  public Snake(String breed, int length, String color, boolean poison) {
    this.breed = breed;
    this.length = length;
    this.color = color;
    this.poison = poison;
  }

  // Getters and Setters
  public String getBreed() {
    return breed;
  }

  public void setBreed(String breed) {
    this.breed = breed;
  }

  public int getLength() {
    return length;
  }

  public void setLength(int length) {
    this.length = length;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public boolean isPoison() {
    return poison;
  }

  public void setPoison(boolean poison) {
    this.poison = poison;
  }

  @Override
  public String toString() {
    return "Snake{" +
        "breed='" + breed + '\'' +
        ", length=" + length +
        ", color='" + color + '\'' +
        ", poison=" + poison +
        '}';
  }
}
