public class SmokeDetector extends Room implements Detector {
  private boolean detected = false;

  // Constructor (Heritage)
  public SmokeDetector(String name) {
    super(name);
  }

  // Methods
  public void sprinklerSystem() {
    if (detected) {
      System.out.println(super.getName() + " -> Sprinklersystem started");
    }
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
}
