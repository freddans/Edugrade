public class DoorDetector {
  private String name;
  private boolean open = false;

  // Constructor
  public DoorDetector(String name) {
    this.name = name;
    this.open = open;
  }

  // Methods

  // Open door
  public void open(DoorDetector door) {
    open = open;
    System.out.println(door.getName() + " -> Door opened");
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
}
