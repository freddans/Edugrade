package alarmsystem.detectors.parts;

import alarmsystem.detectors.Detector;
import alarmsystem.detectors.Notification;

public class DoorAlarm extends Detector implements Notification {
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
      System.out.println(super.getName() + " -> has broken");
      sirens.triggerSirens();
    }
    System.out.println("No detection");
  }

  // Getters and Setters
  public boolean isDetected() {
    return detected;
  }

  public void setDetected(boolean detected) {
    this.detected = detected;
  }
}
