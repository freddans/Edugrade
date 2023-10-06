import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Room {
  // var
  private String name;
  private boolean secretDocuments = false;

  // Lists
  private List<WindowDetector> windowDetectorList = new ArrayList<>();
  private List<DoorDetector> doorDetectorList = new ArrayList<>();
  private List<DoorAlarm> doorAlarmList = new ArrayList<>();
  private List<SmokeDetector> smokeDetectorList = new ArrayList<>();
  private List<MotionDetector> motionDetectorList = new ArrayList<>();


  // empty constructor

  // Constructor
  public Room(String name) {
    this.name = name;
    this.secretDocuments = secretDocuments;
  }

  // Methods


  // Add Window Detector
  public void addWindowDetector(String name) {
    WindowDetector windowDetector = new WindowDetector(name);
    windowDetectorList.add(windowDetector);
  }

  // Add Door Detector
  public void addDoorDetector(String name) {
    DoorDetector doorDetector = new DoorDetector(name);
    doorDetectorList.add(doorDetector);
  }

  // Add Door Alarm
  public void addDoorAlarm(String name) {
    DoorAlarm doorAlarm = new DoorAlarm(name);
    doorAlarmList.add(doorAlarm);
  }

  // Add Smoke Detectors
  public void addSmokeDetector(String name) {
    SmokeDetector smokeDetector = new SmokeDetector(name);
    smokeDetectorList.add(smokeDetector);
  }

  // Add Motion Detectors
  public void addMotionDetector(String name) {
    MotionDetector motionDetector = new MotionDetector(name);
    motionDetectorList.add(motionDetector);
  }

  // Check Window detector-list
  public void checkWindowDetectorList() {
    for (int i = 0; i < windowDetectorList.size(); i++) {
      System.out.println(windowDetectorList.get(i).getName());
    }
  }

  // Getters and Setters
  public String getName() {
    return name;
  }

  public List<WindowDetector> getWindowDetectorList() {
    return windowDetectorList;
  }

  public List<DoorDetector> getDoorDetectorList() {
    return doorDetectorList;
  }

  public List<DoorAlarm> getDoorAlarmList() {
    return doorAlarmList;
  }

  public List<SmokeDetector> getSmokeDetectorList() {
    return smokeDetectorList;
  }

  public List<MotionDetector> getMotionDetectorList() {
    return motionDetectorList;
  }

  public boolean isSecretDocuments() {
    return secretDocuments;
  }

  public void setSecretDocuments(boolean secretDocuments) {
    this.secretDocuments = secretDocuments;
  }
}
