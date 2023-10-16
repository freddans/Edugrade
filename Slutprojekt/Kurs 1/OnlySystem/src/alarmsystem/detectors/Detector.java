package alarmsystem.detectors;

import alarmsystem.detectors.parts.*;

import java.util.ArrayList;
import java.util.List;

public class Detector {
  // Attributes
  private String name;
  private boolean secretDocuments = false;

  // Lists
  private List<WindowDetector> windowDetectorList = new ArrayList<>();
  private List<DoorDetector> doorDetectorList = new ArrayList<>();
  private List<DoorAlarm> doorAlarmList = new ArrayList<>();
  private List<SmokeDetector> smokeDetectorList = new ArrayList<>();
  private List<MotionDetector> motionDetectorList = new ArrayList<>();

  // Constructor
  public Detector(String name) {
    this.name = name;
  }

  // Methods
  public void addWindowDetector(String name) {
    WindowDetector detector = new WindowDetector(name);
    windowDetectorList.add(detector);
  }

  public void addDoorDetector(String name) {
    DoorDetector detector = new DoorDetector(name);
    doorDetectorList.add(detector);
  }

  public void addDoorAlarm(String name) {
    DoorAlarm detector = new DoorAlarm(name);
    doorAlarmList.add(detector);
  }

  public void removeDoorAlarm(String alarmName) {
    for (DoorAlarm alarm : doorAlarmList) {
      if (alarm.getName().equals(alarmName)) {
        doorAlarmList.remove(alarm);
        return;
      }
    }
  }

  public void addSmokeDetector(String name) {
    SmokeDetector detector = new SmokeDetector(name);
    smokeDetectorList.add(detector);
  }

  public void addMotionDetector(String name) {
    MotionDetector detector = new MotionDetector(name);
    motionDetectorList.add(detector);
  }

  // Getters and Setters
  public String getName() {
    return name;
  }

  public void setSecretDocuments(boolean secretDocuments) {
    this.secretDocuments = secretDocuments;
  }

  public boolean isSecretDocuments() {
    return secretDocuments;
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
}
