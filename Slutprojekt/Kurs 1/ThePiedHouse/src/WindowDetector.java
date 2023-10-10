public class WindowDetector {
  private String name;
  private boolean open = false;
  private boolean broken = false;

  public WindowDetector(String name) {
    this.name = name;
  }

  // Methods

  // Open window
  public void open() {
      setOpen(true);
  }

  // Break window
  public void breakWindow() {
    setBroken(true);
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

  public boolean isBroken() {
    return broken;
  }

  public void setBroken(boolean broken) {
    this.broken = broken;
  }
}
