public class WindowDetector {
  private String name;
  private boolean broken = false;
  private boolean open = false;
  private final CentralUnit centralUnit = new CentralUnit();

  // Constructor
  public WindowDetector(String name) {
    this.name = name;
    this.broken = broken;
    this.open = open;
  }

  // Methods
  public void open(WindowDetector window) {
    open = true;
    centralUnit.windowOpened(window);
  }

  public void windowBroken(WindowDetector window) {
    broken = true;
    centralUnit.windowBroken(window);
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

  public boolean isOpen() {
    return open;
  }

  public void setOpen(boolean open) {
    this.open = open;
  }
}
