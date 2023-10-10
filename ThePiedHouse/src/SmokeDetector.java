public class SmokeDetector {
  private String name;
  private boolean smokeDetected = false;

  // Constructor
  public SmokeDetector(String name) {
    this.name = name;
  }

  // Methods
  public void theSmokeDetector() {
    smokeDetected = true;
    //System.out.println(this.getName() + " -> Smoke detected");
    sprinklerSystem();
  }

  public void sprinklerSystem() {
    if (smokeDetected) {
      System.out.println(this.getName() + " -> Sprinklersystem started");
    }
  }

  // Getters and Setters
  public String getName() {
    return name;
  }

  public boolean isSmokeDetected() {
    return smokeDetected;
  }

  public void setSmokeDetected(boolean smokeDetected) {
    this.smokeDetected = smokeDetected;
  }
}
