package alarmsystem.detectors.parts;

import alarmsystem.detectors.Detector;
import alarmsystem.detectors.Notification;

public class WindowDetector extends Detector implements Notification {
  // Attributes
  private boolean detected = false;
  private boolean broken = false;
  private Sirens sirens = new Sirens();

  // Constructor
  public WindowDetector(String name) {
    super(name);
  }

  // Methods
  @Override
  public void notification() {
    if (detected) {
      System.out.println(super.getName() + " -> has opened");
    } else {
      System.out.println("No detection");
    }
  }

  public void broken() {
    if (broken) {
      System.out.println(super.getName() + " -> has broken");
      sirens.triggerSirens();
    }
  }

  // Getters and setters
  public boolean isDetected() {
    return detected;
  }

  public void setDetected(boolean detected) {
    this.detected = detected;
  }

  public boolean isBroken() {
    return broken;
  }

  public void setBroken(boolean broken) {
    this.broken = broken;
  }
}
