package alarmsystem.detectors.parts;

import alarmsystem.detectors.Detector;
import alarmsystem.detectors.Notification;

public class SmokeDetector extends Detector implements Notification {
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
      System.out.println(super.getName() + " -> smoke detected");
      sirens.triggerSirens();
      sprinklerSystem();
    } else {
      System.out.println("No detection");
    }
  }

  public void sprinklerSystem() {
    if (detected) {
      System.out.println(super.getName() + " -> sprinklersystem started");
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
