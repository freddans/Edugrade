package alarmsystem.detectors.parts;

public class DoorAlarm extends Detector {
  // Attributes
  private boolean detected = false;
  private Sirens sirens = new Sirens();

  // Constructor
  public DoorAlarm(String name) {
    super(name);
  }

  // Methods
  @Override
  public void notification() {
    if (detected) {
      System.out.println("🚪 " + super.getName() + " -> has broken");
      sirens.triggerSirens();
    }
    System.out.println("No detection");
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