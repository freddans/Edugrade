public class Hallway {
  private String name;
  private int windows;
  private int doors;
  private boolean hasAlarmedWindow;
  private boolean hasAlarmedDoor;
  private boolean smokeDetector;
  private boolean sprinklerSystem;
  private boolean motionDetector;

  // Constructor
  public Hallway() {
    this.name = "Hallway";
    this.windows = 1;
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

  public void openedWndow() {
    System.out.println(getClass().getSimpleName() + " -> Window was opened.");
  }

  public void brokenDoor() {
    System.out.println(getClass().getSimpleName() + " -> Entrydoor was broken.");
  }

  // Getters and Setters
  public String getName() {
    return name;
  }

  @Override
  public String toString() {
    return "Hallway{" +
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
