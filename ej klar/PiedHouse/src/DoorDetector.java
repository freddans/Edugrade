public class DoorDetector {
  private String name;
  private boolean open = false;

  private final CentralUnit centralUnit = new CentralUnit();

  // Constructor
  public DoorDetector(String name) {
    this.name = name;
    this.open = open;
  }

  // Methods
  public void open(DoorDetector door) {
    open = true;
    centralUnit.doorOpened(door);
  }

  // Getters and Setters
  public String getName() {
    return name;
  }

  public boolean isOpen() {
    return open;
  }

  public void setOpen(boolean open) {
    this.open = open;
  }

  public CentralUnit getCentralUnit() {
    return centralUnit;
  }
}
