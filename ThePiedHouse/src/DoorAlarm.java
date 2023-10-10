public class DoorAlarm {
  private String name;
  private boolean broken = false;

  // Constructor
  public DoorAlarm(String name) {
    this.name = name;
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
}
