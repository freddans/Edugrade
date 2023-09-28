package se.fredrik.House;

public class Room extends House{
  private String name;
  private boolean door;
  private boolean window;
  private boolean secretDocuments;

  // Constructor
  public Room(String name, boolean door, boolean window, boolean secretDocuments) {
    this.name = name;
    this.door = door;
    this.window = window;
    this.secretDocuments = secretDocuments;
  }

  // Methods
  public void openDoor() {
    if (door) {
      System.out.println(name + " -> Door opened (if alarm on)");
    }
  }

  public void openWindow() {
    if (window) {
      System.out.println(name + " -> Window opened (if alarm on)");
    }
  }

  public void breakWindow() {
    if (window) {
      System.out.println(name + " -> Window broke (SIRENS, if alarm on)");
    }
  }

  public void breakDoor() {
    if (door) {
      if (name.contains("Hallway")) {
        System.out.println(name + " -> Door broken (SIRENS, if alarm on)");
      } else if (name.contains("Garage")) {
        System.out.println(name + " -> Door broken (SIRENS, if alarm on)");
      } else if (secretDocuments && name.contains("bedroom2")) {
        System.out.println(name + " -> Door broken (SIRENS, if alarm on)");
      }
    }
  }

  // Setters and Getters
  public String getName() {
    return name;
  }

  public boolean isSecretDocuments() {
    return secretDocuments;
  }

  public void setSecretDocuments(boolean secretDocuments) {
    this.secretDocuments = secretDocuments;
  }

  public void setName(String name) {
    this.name = name;
  }

  public boolean isDoor() {
    return door;
  }

  public void setDoor(boolean door) {
    this.door = door;
  }

  public boolean isWindow() {
    return window;
  }

  public void setWindow(boolean window) {
    this.window = window;
  }
}
