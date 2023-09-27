public class Room {
  private String name;
  private int windows;
  private int doors;
  private boolean secretDocuments;
  private boolean windowBroken;
  private boolean doorBroken;
  private boolean smokeDetector;

  // Constructor
  public Room(String name, int windows, int doors) {
    this.name = name;
    this.windows = windows;
    this.doors = doors;
    this.secretDocuments = false;
    this.windowBroken = false;
    this.doorBroken = false;
    this.smokeDetector = true;
  }

  // Methods

  // Getters and Setters
  public boolean isSmokeDetector() {
    return smokeDetector;
  }

  public void setSmokeDetector(boolean smokeDetector) {
    this.smokeDetector = smokeDetector;
  }

  public boolean isDoorBroken() {
    return doorBroken;
  }

  public void setDoorBroken(boolean doorBroken) {
    if (doorBroken) {
      this.doors -= 1;
    }
    this.doorBroken = doorBroken;
  }

  public boolean isWindowBroken() {
    return windowBroken;
  }

  public void setWindowBroken(boolean windowBroken) {
    if (windowBroken) {
      this.windows -= 1;
    }
    this.windowBroken = windowBroken;
  }

  public String getName() {
    return name;
  }

  public boolean isSecretDocuments() {
    return secretDocuments;
  }

  public void setSecretDocuments(boolean secretDocuments) {
    this.secretDocuments = secretDocuments;
  }

  @Override
  public String toString() {
    return "Room{" +
        "name='" + name + '\'' +
        ", windows=" + windows +
        ", doors=" + doors +
        ", secretDocuments=" + secretDocuments +
        ", windowBroken=" + windowBroken +
        '}';
  }
}
