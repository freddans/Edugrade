public class MotionDetector {
  private String name;
  private boolean motion = false;

  // Constructor
  public MotionDetector(String name) {
    this.name = name;
  }

  // Methods
  public void motionDetected() {
    if (isMotion()) {
      System.out.println(this.getName() + " -> detected motion");
    }
  }

  // Getters and Setters
  public String getName() {
    return name;
  }

  public boolean isMotion() {
    return motion;
  }

  public void setMotion(boolean motion) {
    this.motion = motion;
  }
}
