public class Garage {
  private String name;
  private int windows;
  private int doors;
  private int garagePort;
  private boolean hasAlarmedWindow;
  private boolean hasAlarmedDoor;
  private boolean smokeDetector;
  private boolean sprinklerSystem;
  private boolean hasRodents;

  // Constructor
  public Garage() {
    this.name = "Jared";
    this.windows = 1;
    this.doors = 1;
    this.garagePort = 1;
    this.hasAlarmedWindow = true;
    this.hasAlarmedDoor = true;
    this.smokeDetector = true;
    this.sprinklerSystem = true;
    this.hasRodents = true;
  }

  // Methods
  public void startSprinklerSystem() {
    System.out.println(getClass().getSimpleName() + " -> Sprinkler system started.");
  }

  public void openedDoor() {
    System.out.println(getClass().getSimpleName() + " -> Door was opened.");
  }

  public void brokenDoor() {
    System.out.println(getClass().getSimpleName() + " -> Garageport was broken.");
  }

  public void openedWndow() {
    System.out.println(getClass().getSimpleName() + " -> (" + getName() + "'s room) Window was opened.");
  }

  public void brokenWindow() {
    System.out.println(getClass().getSimpleName() + " -> (" + getName() + "'s room) Garagewindow was broken.");
  }



  // Getters and Setters
  public String getName() {
    return name;
  }

  @Override
  public String toString() {
    return "Garage{" +
        "name='" + name + '\'' +
        ", windows=" + windows +
        ", doors=" + doors +
        ", garagePort=" + garagePort +
        ", hasAlarmedWindow=" + hasAlarmedWindow +
        ", hasAlarmedDoor=" + hasAlarmedDoor +
        ", smokeDetector=" + smokeDetector +
        ", sprinklerSystem=" + sprinklerSystem +
        ", hasRodents=" + hasRodents +
        '}';
  }
}
