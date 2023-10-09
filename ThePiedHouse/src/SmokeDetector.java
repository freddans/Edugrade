public class SmokeDetector {
  private String name;
  private boolean smokeDetected = false;

  // Constructor
  public SmokeDetector(String name) {
    this.name = name;
    this.smokeDetected = smokeDetected;
  }

  // Methods
  public void theSmokeDetector(SmokeDetector smoke) {
    smokeDetected = true;
    System.out.println(smoke.getName() + " -> Smoke detected");
    sprinklerSystem(smoke);
  }

  public void sprinklerSystem(SmokeDetector smoke) {
    if (smokeDetected) {
      System.out.println(smoke.getName() + " -> Sprinklersystem started");
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
