package alarmsystem.detectors.parts;

public class SmokeDetector extends Detector {
  // Attributes
  private boolean detected = false;
  private Sirens sirens = new Sirens();

  // Constructor
  public SmokeDetector(String name) {
    super(name);
  }

  // Methods
  @Override
  public void notification() {
    if (detected) {
      System.out.println("💨 " + super.getName() + " -> smoke detected");
      sirens.triggerSirens();
      sprinklerSystem();
    } else {
      System.out.println("No detection");
    }
  }

  @Override
  public void resetDetector() {
    this.detected = false;
  }

  public void sprinklerSystem() {
    if (detected) {
      System.out.println("🚿 " + super.getName() + " -> sprinklersystem started");
    }
  }

  // Getters and Setters
  public boolean isDetected() {
    return detected;
  }

  public void setDetected(boolean detected) {
    this.detected = detected;
  }
}