public class Livingroom {
  private String name;
  private int windows;
  private int doors;
  private boolean hasAlarmedWindow;
  private boolean hasAlarmedDoor;
  private boolean smokeDetector;
  private boolean sprinklerSystem;
  private boolean motionDetector;

  // Constructor
  public Livingroom() {
    this.name = "Livingroom/Office";
    this.windows = 2;
    this.doors = 1;
    this.hasAlarmedWindow = true;
    this.hasAlarmedDoor = true;
    this.smokeDetector = true;
    this.sprinklerSystem = true;
    this.motionDetector = true;
  }

  // Methods
  public void startSprinklerSystem() {
    System.out.println(getClass().getSimpleName() + " -> Sprinkler system started.");
  }

  public void openedDoor() {
    System.out.println(getClass().getSimpleName() + " -> Backdoor to backyard was opened.");
  }

  public void openedWndow() {
    System.out.println(getClass().getSimpleName() + " -> Window was opened.");
  }

  // Getters and Setters
  public String getName() {
    return name;
  }

  @Override
  public String toString() {
    return "Livingroom{" +
        "name='" + name + '\'' +
        ", windows=" + windows +
        ", doors=" + doors +
        ", hasAlarmedWindow=" + hasAlarmedWindow +
        ", hasAlarmedDoor=" + hasAlarmedDoor +
        ", smokeDetector=" + smokeDetector +
        ", sprinklerSystem=" + sprinklerSystem +
        ", motionDetector=" + motionDetector +
        '}';
  }
}
