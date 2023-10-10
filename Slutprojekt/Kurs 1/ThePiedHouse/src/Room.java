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

  // Add detectors
  public void addWindowDetector(String name) {
    WindowDetector windowDetector = new WindowDetector(name);
    windowDetectorList.add(windowDetector);
  }

  public void addDoorDetector(String name) {
    DoorDetector doorDetector = new DoorDetector(name);
    doorDetectorList.add(doorDetector);
  }

  public void addDoorAlarm(String name) {
    DoorAlarm doorAlarm = new DoorAlarm(name);
    dooralarmList.add(doorAlarm);
  }

  public void removeDoorAlarm(String alarmName) {
    for (DoorAlarm alarm : dooralarmList) {
      if (alarm.getName().equals(alarmName)) {
        dooralarmList.remove(alarm);
        return;
      }
    }
  }

  public void addSmokeDetector(String name) {
    SmokeDetector smokeDetector = new SmokeDetector(name);
    smokeDetectorList.add(smokeDetector);
  }

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
