public class WindowDetector {
  private String name;
  private boolean open = false;
  private boolean broken = false;
  private CentralUnit centralUnit;
  private Siren siren = new Siren();

  public WindowDetector(String name) {
    this.name = name;
    this.broken = broken;
    this.open = open;
  }

  // Methods

  // Open window
  public void open(WindowDetector window) {
      setOpen(true);
      System.out.println(window.getName() + " -> Window open");
  }

  // Break window
  public void breakWindow(WindowDetector window) {
    setBroken(true);
    System.out.println(window.getName() + " -> Window broken");
    siren.triggerSirens();
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
