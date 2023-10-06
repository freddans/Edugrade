public class DoorAlarm {
  private String name;
  private boolean broken = false;
  private final CentralUnit centralUnit = new CentralUnit();

  // Constructor
  public DoorAlarm(String name) {
    this.name = name;
    this.broken = broken;
  }

  // Methods
  public void doorBroken(DoorAlarm door) {
    broken = true;
    centralUnit.doorBroken(door);
  }

  // Getters and Setters
  public String getName() {
    return name;
  }

  public boolean isBroken() {
    return broken;
  }

  public void setBroken(boolean broken) {
    this.broken = broken;
  }

  public CentralUnit getCentralUnit() {
    return centralUnit;
  }
}
