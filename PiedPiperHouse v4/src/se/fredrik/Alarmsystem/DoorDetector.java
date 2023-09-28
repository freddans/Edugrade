package se.fredrik.Alarmsystem;

public class DoorDetector extends Detector{
  private String name;

  // Constructor
  public DoorDetector(String name) {
    this.name = name;
  }

  // Methods

  public void information() {
    if (isAlarm()) {
      System.out.println(name + " -> Door was opened");
    }
  }

  // Getters and Setters
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
