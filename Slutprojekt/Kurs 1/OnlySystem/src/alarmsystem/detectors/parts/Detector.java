package alarmsystem.detectors.parts;

import alarmsystem.detectors.Notification;

public abstract class Detector implements Notification {
  private String name;

  // Constructor
  public Detector(String name) {
    this.name = name;
  }

  // Methods
  public abstract void resetDetector();

  // Getters and Setters
  public String getName() {
    return name;
  }
}