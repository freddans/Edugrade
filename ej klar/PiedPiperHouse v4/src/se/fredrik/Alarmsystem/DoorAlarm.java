package se.fredrik.Alarmsystem;

public class DoorAlarm extends Detector {
  private String name;

  // Constructor
  public DoorAlarm(String name) {
    this.name = name;
  }

  // Methods
  public void information() {
    if (isAlarm()) {
      System.out.println(name + " -> Door has been broken (sirens)");
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
