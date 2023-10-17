package alarmsystem.detectors.parts;

public class MotionDetector extends Detector {
  // Attributes
  private boolean detected = false;

  // Constructor
  public MotionDetector(String name) {
    super(name);
  }

  // Methods
  @Override
  public void notification() {
    if (detected) {
      System.out.println("📳 "+ super.getName() + " -> motion detected");
    } else {
      System.out.println("No detection");
    }
  }

  @Override
  public void resetDetector() {
    this.detected = false;
  }

  // Getters and Setters
  public boolean isDetected() {
    return detected;
  }

  public void setDetected(boolean detected) {
    this.detected = detected;
  }
}