public class DoorAlarm {
  private String name;
  private boolean broken;
  private Siren siren = new Siren();

  // Constructor
  public DoorAlarm(String name) {
    this.name = name;
    this.broken = broken;
  }

  public void breakDoor(DoorAlarm door) {
    broken = true;
    System.out.println(door.getName() + " -> Door broken");
    siren.triggerSirens();
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
