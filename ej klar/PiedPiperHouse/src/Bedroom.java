import java.awt.*;

public class Bedroom {
  private String name;
  private int windows;
  private int doors;
  private boolean hasAlarmedWindow;
  private boolean hasAlarmedDoor;
  private boolean smokeDetector;
  private boolean sprinklerSystem;
  private boolean hasSecretDocuments;

  // Constructor
  public Bedroom(String name, int windows, int doors, boolean hasAlarmedWindow, boolean hasAlarmedDoor, boolean smokeDetector, boolean sprinklerSystem, boolean hasSecretDocuments) {
    this.name = name;
    this.windows = windows;
    this.doors = doors;
    this.hasAlarmedWindow = hasAlarmedWindow;
    this.hasAlarmedDoor = hasAlarmedDoor;
    this.smokeDetector = smokeDetector;
    this.sprinklerSystem = sprinklerSystem;
    this.hasSecretDocuments = hasSecretDocuments;
  }

  // Methods
  public void startSprinklerSystem() {
    System.out.println(getClass().getSimpleName() + " -> " + getName() + "'s Sprinkler system started.");
  }

  public void openedDoor() {
    System.out.println(getClass().getSimpleName() + " -> " + getName() + "'s door was opened.");
  }

  public void brokenDoor() {
    System.out.println(getClass().getSimpleName() + " -> " + getName() + "'s door was broken.");
  }

  public void openedWndow() {
    System.out.println(getClass().getSimpleName() + " -> " + getName() + "'s window was opened.");
  }

  public void brokenWindow() {
    System.out.println(getClass().getSimpleName() + " -> " + getName() + "'s window was broken.");
  }

  public String secretDocumentsStatus() {
    if (hasSecretDocuments) {
      return "Has secret documents";
    } else {
      return "No secret documents";
    }
  }

  // Getters and Setters
  public String getName() {
    return name;
  }

  public boolean isHasSecretDocuments() {
    return hasSecretDocuments;
  }

  public void setHasSecretDocuments(boolean hasSecretDocuments) {
    this.hasSecretDocuments = hasSecretDocuments;
  }

  @Override
  public String toString() {
    return "Bedroom{" +
        "name='" + name + '\'' +
        ", windows=" + windows +
        ", doors=" + doors +
        ", hasAlarmedWindow=" + hasAlarmedWindow +
        ", hasAlarmedDoor=" + hasAlarmedDoor +
        ", smokeDetector=" + smokeDetector +
        ", sprinklerSystem=" + sprinklerSystem +
        ", hasSecretDocuments=" + hasSecretDocuments +
        '}';
  }
}
