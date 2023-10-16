public class MotionDetector extends Room implements Detector {
  private boolean detected = false;

  // Constructor
  public MotionDetector(String name) {
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
}
