public class Kitchen {
  private String name;
  private int windows;
  private int doors;
  private boolean hasAlarmedWindow;
  private boolean hasAlarmedDoor;
  private boolean smokeDetector;
  private boolean sprinklerSystem;

  // Constructor
  public Kitchen() {
    this.name = "Kitchen";
    this.windows = 1;
    this.doors = 0;
    this.hasAlarmedWindow = true;
    this.hasAlarmedDoor = false;
    this.smokeDetector = true;
    this.sprinklerSystem = true;
  }

  // Methods
  public void startSprinklerSystem() {
    System.out.println(getClass().getSimpleName() + " -> Sprinkler system started.");
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
    return "Kitchen{" +
        "name='" + name + '\'' +
        ", windows=" + windows +
        ", doors=" + doors +
        ", hasAlarmedWindow=" + hasAlarmedWindow +
        ", hasAlarmedDoor=" + hasAlarmedDoor +
        ", smokeDetector=" + smokeDetector +
        ", sprinklerSystem=" + sprinklerSystem +
        '}';
  }
}
