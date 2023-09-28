package se.fredrik.Alarmsystem;

public abstract class Detector extends Alarmsystem {
  private boolean alarm;
  private boolean smoke;
  private boolean doorOpen;
  private boolean doorBroken;
  private boolean windowOpen;
  private boolean windowBroken;
  private boolean motion;

  // Constructor

  // Methods
  public abstract void information();

  // Getters and Setters
  public boolean isAlarm() {
    return alarm;
  }

  public void setAlarm(boolean alarm) {
    this.alarm = alarm;
  }

  public boolean isSmoke() {
    return smoke;
  }

  public void setSmoke(boolean smoke) {
    this.smoke = smoke;
  }

  public boolean isDoorOpen() {
    return doorOpen;
  }

  public void setDoorOpen(boolean doorOpen) {
    this.doorOpen = doorOpen;
  }

  public boolean isDoorBroken() {
    return doorBroken;
  }

  public void setDoorBroken(boolean doorBroken) {
    this.doorBroken = doorBroken;
  }

  public boolean isWindowOpen() {
    return windowOpen;
  }

  public void setWindowOpen(boolean windowOpen) {
    this.windowOpen = windowOpen;
  }

  public boolean isWindowBroken() {
    return windowBroken;
  }

  public void setWindowBroken(boolean windowBroken) {
    this.windowBroken = windowBroken;
  }

  public boolean isMotion() {
    return motion;
  }

  public void setMotion(boolean motion) {
    this.motion = motion;
  }
}
