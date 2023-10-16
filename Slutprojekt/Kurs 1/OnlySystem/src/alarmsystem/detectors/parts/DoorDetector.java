package alarmsystem.detectors.parts;

import alarmsystem.detectors.Detector;
import alarmsystem.detectors.Notification;

public class DoorDetector extends Detector implements Notification {
  // Attributes
  private boolean detected = false;

  // Constructor
  public DoorDetector(String name) {
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

  // Getters and Setters
  public boolean isDetected() {
    return detected;
  }

  public void setDetected(boolean detected) {
    this.detected = detected;
  }
}
