public class Backyard {
  private String name;
  private int windows;
  private int doors;
  private boolean hasAlarmedWindow;
  private boolean hasAlarmedDoor;
  private boolean smokeDetector;
  private boolean sprinklerSystem;
  private boolean motionDetector;

  // Constructor
  public Backyard() {
    this.name = "Backyard";
    this.windows = 0;
    this.doors = 0;
    this.hasAlarmedWindow = false;
    this.hasAlarmedDoor = false;
    this.smokeDetector = false;
    this.sprinklerSystem = false;
    this.motionDetector = true;
  }

  // Getters and Setters
  public String getName() {
    return name;
  }

  @Override
  public String toString() {
    return "Backyard{" +
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
