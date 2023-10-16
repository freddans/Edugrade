public class WindowDetector extends Room implements Detector {
  private boolean detected = false;
  private boolean broken = false;


  // Constructor (Heritage)
  public WindowDetector(String name) {
    super(name);
  }

  // interface implemented setDetected
  @Override
  public void setDetected(boolean detected) {
    this.detected = detected;
  }

  // Getters and Setters
  public boolean isDetected() {
    return detected;
  }

  public boolean isBroken() {
    return broken;
  }

  public void setBroken(boolean broken) {
    this.broken = broken;
  }
}
