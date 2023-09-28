package se.fredrik.Alarmsystem;

public class SmokeDetector extends Detector {
  private String name;

  // Constructor
  public SmokeDetector(String name) {
    this.name = name;
  }

  // Methods
  public void information() {
    System.out.println(name + " -> Detected smoke");
    setSmoke(true);

    startSprinklerSystem();
  }

  // Sprinklers
  public void startSprinklerSystem() {
    if (isSmoke()) {
      System.out.println(name + " -> Sprinklers started");
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
