package se.fredrik;

import se.fredrik.Alarmsystem.*;
import se.fredrik.House.House;
import se.fredrik.House.Room;

public class Main {
  public static void main(String[] args) {
    House house = new House();
    Alarmsystem alarmsystem = new Alarmsystem();


    house.addAllRooms();
    alarmsystem.addAllAlarm();

    System.out.println(); // radbryt

    System.out.println("Rooms:");
    for (Room rooms : house.getRoomList()) {
      System.out.println(rooms.getName() + ", has door: " + rooms.isDoor() + ", has Window: " + rooms.isWindow() + ", secret docs: " + rooms.isSecretDocuments());
    }

    System.out.println(); // radbryt

    System.out.println("Alarmed rooms (Door Detectors):");
    for (Detector detector : alarmsystem.getAlarmList()) {
      if (detector instanceof DoorDetector) {
        DoorDetector doorDetector = (DoorDetector) detector;
        System.out.println(doorDetector.getName());
      }
    }

    System.out.println(); // radbryt

    System.out.println("Alarmed rooms (Window Detectors):");
    for (Detector detector : alarmsystem.getAlarmList()) {
      if (detector instanceof WindowDetector) {
        WindowDetector windowDetector = (WindowDetector) detector;
        System.out.println(windowDetector.getName());
      }
    }

    System.out.println(); // radbryt

    System.out.println("Alarmed rooms (Smoke Detectors):");
    for (Detector detector : alarmsystem.getAlarmList()) {
      if (detector instanceof SmokeDetector) {
        SmokeDetector smokeDetector = (SmokeDetector) detector;
        System.out.println(smokeDetector.getName());
      }
    }

    System.out.println(); // radbryt

    System.out.println("Alarmed rooms (Door Alarms):");
    for (Detector detector : alarmsystem.getAlarmList()) {
      if (detector instanceof DoorAlarm) {
        DoorAlarm doorAlarm = (DoorAlarm) detector;
        System.out.println(doorAlarm.getName());
      }
    }

    System.out.println(); // radbryt

    System.out.println("Alarmed rooms (Window Alarms):");
    for (Detector detector : alarmsystem.getAlarmList()) {
      if (detector instanceof WindowAlarm) {
        WindowAlarm windowAlarm = (WindowAlarm) detector;
        System.out.println(windowAlarm.getName());
      }
    }

    System.out.println(); // radbryt

    System.out.println("Alarmed rooms (Motion Detectors):");
    for (Detector detector : alarmsystem.getAlarmList()) {
      if (detector instanceof MotionDetector) {
        MotionDetector motionDetector = (MotionDetector) detector;
        System.out.println(motionDetector.getName());
      }
    }


    System.out.println(); // radbryt

    System.out.println(); // radbryt

    // ska funka
    house.openDoor("Garage");
    house.breakDoor("Garage");
    house.openWindow("Garage");
    house.breakWindow("Garage");
    house.breakWindow("Kitchen");

    // ska INTE funka
    house.openDoor("Kitchen");
    house.breakDoor("Kitchen");
  }
}