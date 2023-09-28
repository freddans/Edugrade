package se.fredrik.Alarmsystem;

public class WindowDetector extends Detector{
  private String name;

  // Constructor
  public WindowDetector(String name) {
    this.name = name;
  }

  // Methods
  @Override
  public void information() {
    if (isAlarm()) {
      System.out.println(name + " -> Window has opened");
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
