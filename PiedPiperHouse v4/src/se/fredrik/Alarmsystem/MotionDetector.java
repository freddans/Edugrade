package se.fredrik.Alarmsystem;

public class MotionDetector extends Detector{
  private String name;
  
  // Constructor
  public MotionDetector(String name) {
    this.name = name;
  }

  // Methods
  @Override
  public void information() {
    if (isAlarm()) {
      System.out.println(name + " -> Motion was detected");
      setMotion(true);
    }
  }

  // Getters and Setters
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
