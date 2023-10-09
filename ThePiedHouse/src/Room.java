import java.util.ArrayList;
import java.util.List;

public class Room {
  private String name;
  private boolean secretDocuments = false;

  // Lists
  List<WindowDetector> windowDetectorList = new ArrayList<>();
  List<DoorDetector> doorDetectorList = new ArrayList<>();
  List<DoorAlarm> dooralarmList = new ArrayList<>();
  List<SmokeDetector> smokeDetectorList = new ArrayList<>();
  List<MotionDetector> motionDetectorList = new ArrayList<>();

  // Constructor
  public Room(String name) {
    this.name = name;
    this.secretDocuments = secretDocuments;
  }

  // Methods


  // Add window detector
  public void addWindowDetector(String name) {
    WindowDetector windowDetector = new WindowDetector(name);
    windowDetectorList.add(windowDetector);
  }

  // Add door detector
  public void addDoorDetector(String name) {
    DoorDetector doorDetector = new DoorDetector(name);
    doorDetectorList.add(doorDetector);
  }

  // Add door alarm
  public void addDoorAlarm(String name) {
    DoorAlarm doorAlarm = new DoorAlarm(name);
    dooralarmList.add(doorAlarm);
  }

  // Add smoke detector
  public void addSmokeDetector(String name) {
    SmokeDetector smokeDetector = new SmokeDetector(name);
    smokeDetectorList.add(smokeDetector);
  }

  // Add motion detector
  public void addMotionDetector(String name) {
    MotionDetector motionDetector = new MotionDetector(name);
    motionDetectorList.add(motionDetector);
  }

  // Getters and Setters
  public String getName() {
    return name;
  }

  public boolean isSecretDocuments() {
    return secretDocuments;
  }

  public void setSecretDocuments(boolean secretDocuments) {
    this.secretDocuments = secretDocuments;
  }

  public List<WindowDetector> getWindowDetectorList() {
    return windowDetectorList;
  }

  public List<DoorDetector> getDoorDetectorList() {
    return doorDetectorList;
  }

  public List<DoorAlarm> getDooralarmList() {
    return dooralarmList;
  }

  public List<SmokeDetector> getSmokeDetectorList() {
    return smokeDetectorList;
  }

  public List<MotionDetector> getMotionDetectorList() {
    return motionDetectorList;
  }
}
