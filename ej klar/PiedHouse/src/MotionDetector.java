public class MotionDetector {
  private String name;
  private boolean movement;
  private final CentralUnit centralUnit = new CentralUnit();

  // Constructor
  public MotionDetector(String name) {
    this.name = name;
    this.movement = movement;
  }

  // Methods
  public void motionDetected(MotionDetector motion) {
    movement = true;
    centralUnit.motionDetected(motion);
  }

  // Getters and Setters
  public String getName() {
    return name;
  }

  public boolean isMovement() {
    return movement;
  }

  public void setMovement(boolean movement) {
    this.movement = movement;
  }
}
