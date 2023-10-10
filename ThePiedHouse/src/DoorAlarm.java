public class DoorAlarm {
  private String name;
  private boolean broken = false;
  //private Siren siren = new Siren();

  // Constructor
  public DoorAlarm(String name) {
    this.name = name;
  }

  public void breakDoor() {
    broken = true;
    //System.out.println(this.getName() + " -> Door broken");
    //siren.triggerSirens();
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
