public class SmokeDetector {
  private String name;
  private boolean smoke;
  private final CentralUnit centralUnit = new CentralUnit();

  // Constructor
  public SmokeDetector(String name) {
    this.name = name;
    this.smoke = smoke;
  }

  // Method
  public void smokeDetected(SmokeDetector detector) {
    smoke = true;
    centralUnit.smokeDetected(detector);
  }

  public void sprinklerSystem(SmokeDetector detector) {
    if (smoke) {
      System.out.println(detector.getName() + " -> Sprinklersystem started");
      smoke = false;
    }
  }

  // Getters and Setters
  public String getName() {
    return name;
  }

  public void setSmoke(boolean smoke) {
    this.smoke = smoke;
  }

  public boolean isSmoke() {
    return smoke;
  }
}
