public class DoorAlarm extends Room implements Detector{
  private boolean detected = false;

  // Constructor (Heritage)
  public DoorAlarm(String name) {
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
