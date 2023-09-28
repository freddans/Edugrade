package se.fredrik.Alarmsystem;

import java.util.ArrayList;
import java.util.List;

public class Alarmsystem {
  List<Detector> alarmList = new ArrayList<>();

  // Methods


  // Add all alarm
  public void addAllAlarm() {
    // Door Detectors
    alarmList.add(new DoorDetector("Garage"));
    alarmList.add(new DoorDetector("Livingroom"));
    alarmList.add(new DoorDetector("Bedroom1"));
    alarmList.add(new DoorDetector("Bedroom2"));
    alarmList.add(new DoorDetector("Bedroom3"));
    alarmList.add(new DoorDetector("Bedroom4"));
    alarmList.add(new DoorDetector("Bedroom5"));
    alarmList.add(new DoorDetector("Hallway"));

    // Door Alarm
    alarmList.add(new DoorAlarm("Garage"));
    alarmList.add(new DoorAlarm("Hallway"));
    //alarmList.add(new DoorAlarm("Bedroom2")); - if bedroom2 has secretDocuments - add to list

    // Window Detectors
    alarmList.add(new WindowDetector("Garage"));
    alarmList.add(new WindowDetector("Livingroom"));
    alarmList.add(new WindowDetector("Kitchen"));
    alarmList.add(new WindowDetector("Bedroom1"));
    alarmList.add(new WindowDetector("Bedroom2"));
    alarmList.add(new WindowDetector("Bedroom3"));
    alarmList.add(new WindowDetector("Bedroom4"));
    alarmList.add(new WindowDetector("Bedroom5"));
    alarmList.add(new WindowDetector("Hallway"));

    // Window Alarm
    alarmList.add(new WindowAlarm("Garage"));
    alarmList.add(new WindowAlarm("Livingroom"));
    alarmList.add(new WindowAlarm("Kitchen"));
    alarmList.add(new WindowAlarm("Bedroom1"));
    alarmList.add(new WindowAlarm("Bedroom2"));
    alarmList.add(new WindowAlarm("Bedroom3"));
    alarmList.add(new WindowAlarm("Bedroom4"));
    alarmList.add(new WindowAlarm("Bedroom5"));
    alarmList.add(new WindowAlarm("Hallway"));

    // Motion Detectors
    alarmList.add(new MotionDetector("Livingroom"));
    alarmList.add(new MotionDetector("Hallway"));
    alarmList.add(new MotionDetector("Backyard"));

    // Smoke Detectors
    alarmList.add(new SmokeDetector("Garage"));
    alarmList.add(new SmokeDetector("Livingroom"));
    alarmList.add(new SmokeDetector("Kitchen"));
    alarmList.add(new SmokeDetector("Bedroom1"));
    alarmList.add(new SmokeDetector("Bedroom2"));
    alarmList.add(new SmokeDetector("Bedroom3"));
    alarmList.add(new SmokeDetector("Bedroom4"));
    alarmList.add(new SmokeDetector("Bedroom5"));
    alarmList.add(new SmokeDetector("Hallway"));
    System.out.println("Alarms added");
  }

  // add single alarm
  public void addAlarm(Detector room) {
    alarmList.add(room);
  }

  // Getters and Setters
  public List<Detector> getAlarmList() {
    return alarmList;
  }

  public void setAlarmList(List<Detector> alarmList) {
    this.alarmList = alarmList;
  }
}
