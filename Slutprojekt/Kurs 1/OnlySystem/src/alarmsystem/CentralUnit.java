package alarmsystem;

import alarmsystem.detectors.Detector;
import alarmsystem.detectors.parts.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CentralUnit {
  // Attributes
  Random random = new Random();

  // List
  List<Detector> detectorList = new ArrayList<>();

  // Constructor

  public CentralUnit() {
    // Garage
    Detector garage = new Detector("Garage");
    garage.addWindowDetector("Garage Window");
    garage.addDoorDetector("Garage Door");
    garage.addDoorAlarm("Garage Port");
    garage.addSmokeDetector("Garage Smoke Detector");
    detectorList.add(garage);

    // Living Room
    Detector livingRoom = new Detector("Living Room");
    livingRoom.addWindowDetector("Living Room Window 1");
    livingRoom.addWindowDetector("Living Room Window 2");
    livingRoom.addDoorDetector("Living Room Door");
    livingRoom.addSmokeDetector("Living Room Smoke Detector");
    livingRoom.addMotionDetector("Living Room Motion Detector");
    detectorList.add(livingRoom);

    // Kitchen
    Detector kitchen = new Detector("Kitchen");
    kitchen.addWindowDetector("Kitchen Window");
    kitchen.addSmokeDetector("Kitchen Smoke Detector");
    detectorList.add(kitchen);

    // Bedroom1
    Detector bedRoom1 = new Detector("Erlich Bachmans Room");
    bedRoom1.addWindowDetector("Erlich Bachmans Window 1");
    bedRoom1.addWindowDetector("Erlich Bachmans Window 2");
    bedRoom1.addDoorDetector("Erlich Bachmans Door");
    bedRoom1.addSmokeDetector("Erlich Bachmans Smoke Detector");
    detectorList.add(bedRoom1);

    // Bedroom2
    Detector bedRoom2 = new Detector("Jian Yangs Room");
    bedRoom2.addWindowDetector("Jian Yangs Window");
    bedRoom2.addDoorDetector("Jian Yangs Door");
    bedRoom2.addSmokeDetector("Jian Yangs Smoke Detector");
    detectorList.add(bedRoom2);

    // Bedroom3
    Detector bedRoom3 = new Detector("Richard Hendricks Room");
    bedRoom3.addWindowDetector("Richard Hendricks Window");
    bedRoom3.addDoorDetector("Richard Hendricks Door");
    bedRoom3.addSmokeDetector("Richard Hendricks Smoke Detector");
    detectorList.add(bedRoom3);

    // Bedroom4
    Detector bedRoom4 = new Detector("Bertram Gilfoyles Room");
    bedRoom4.addWindowDetector("Bertram Gilfoyles Window 1");
    bedRoom4.addWindowDetector("Bertram Gilfoyles Window 2");
    bedRoom4.addDoorDetector("Bertram Gilfoyles Door");
    bedRoom4.addSmokeDetector("Bertram Gilfoyles Smoke Detector");
    detectorList.add(bedRoom4);

    // Bedroom5
    Detector bedRoom5 = new Detector("Dinesh Chugtais Room");
    bedRoom5.addWindowDetector("Dinesh Chugtais Window");
    bedRoom5.addDoorDetector("Dinesh Chugtais Door");
    bedRoom5.addSmokeDetector("Dinesh Chugtais Smoke Detector");
    detectorList.add(bedRoom5);

    // Hallway
    Detector hallWay = new Detector("Hallway");
    hallWay.addWindowDetector("Hallway Window");
    hallWay.addDoorAlarm("Hallway Entry Door");
    hallWay.addSmokeDetector("Hallway Smoke Detector");
    hallWay.addMotionDetector("Hallway Motion Detector");
    detectorList.add(hallWay);

    // Backyard
    Detector backYard = new Detector("Backyard");
    backYard.addMotionDetector("Backyard Motion Detector");
    detectorList.add(backYard);
  }

  // Methods
  public void openRandomWindow() {
    List<WindowDetector> allDetectors = new ArrayList<>();
    for (Detector detector : detectorList) {
      List<WindowDetector> windowDetectorList = detector.getWindowDetectorList();
      allDetectors.addAll(windowDetectorList);
    }

    int windowIndex = random.nextInt(allDetectors.size());
    WindowDetector detector = allDetectors.get(windowIndex);
    detector.setDetected(true);
  }

  public void breakRandomWindow() {
    List<WindowDetector> allDetectors = new ArrayList<>();
    for (Detector detector : detectorList) {
      List<WindowDetector> windowDetectorList = detector.getWindowDetectorList();
      allDetectors.addAll(windowDetectorList);
    }

    int windowIndex = random.nextInt(allDetectors.size());
    WindowDetector detector = allDetectors.get(windowIndex);
    detector.setBroken(true);
  }

  public void openRandomDoor() {
    List<DoorDetector> allDetectors = new ArrayList<>();
    for (Detector detector : detectorList) {
      List<DoorDetector> doorDetectorList = detector.getDoorDetectorList();
      allDetectors.addAll(doorDetectorList);
    }

    int doorIndex = random.nextInt(allDetectors.size());
    DoorDetector detector = allDetectors.get(doorIndex);
    detector.setDetected(true);
  }

  public void breakRandomDoor() {
    List<DoorAlarm> allDetectors = new ArrayList<>();
    for (Detector detector : detectorList) {
      List<DoorAlarm> doorAlarmList = detector.getDoorAlarmList();
      allDetectors.addAll(doorAlarmList);
    }

    int doorIndex = random.nextInt(allDetectors.size());
    DoorAlarm detector = allDetectors.get(doorIndex);
    detector.setDetected(true);
  }

  public void triggerRandomSmokeDetector() {
    List<SmokeDetector> allDetectors = new ArrayList<>();
    for (Detector detector : detectorList) {
      List<SmokeDetector> smokeDetectorList = detector.getSmokeDetectorList();
      allDetectors.addAll(smokeDetectorList);
    }

    int smokeIndex = random.nextInt(allDetectors.size());
    SmokeDetector detector = allDetectors.get(smokeIndex);
    detector.setDetected(true);
  }

  public void triggerRandomMotionDetector() {
    List<MotionDetector> allDetectors = new ArrayList<>();
    for (Detector detector : detectorList) {
      List<MotionDetector> motionDetectorList = detector.getMotionDetectorList();
      allDetectors.addAll(motionDetectorList);
    }

    int motionIndex = random.nextInt(allDetectors.size());
    MotionDetector detector = allDetectors.get(motionIndex);
    detector.setDetected(true);
  }

  public void triggerBackYardMotionDetector() {
    for (Detector detector : detectorList) {
      if (detector.getName().equalsIgnoreCase("Backyard")) {
        detector.getMotionDetectorList().get(0).setDetected(true);
      }
    }
  }

  public boolean checkBackYardMotionDetector() {

    for (Detector detector : detectorList) {
      if (detector.getName().equalsIgnoreCase("Backyard")) {
        return detector.getMotionDetectorList().get(0).isDetected();
      }
    }

    return false;
  }

  // Checking if broken
  public WindowDetector checkWindowDetector() {
    List<WindowDetector> allDetectors = new ArrayList<>();
    for (Detector detector : detectorList) {
      List<WindowDetector> windowDetectorList = detector.getWindowDetectorList();
      allDetectors.addAll(windowDetectorList);
    }

    for (WindowDetector detector : allDetectors) {
      if (detector.isBroken() || detector.isDetected()) {
        return detector;
      }
    }

    return null;
  }

  public DoorDetector checkDoorDetector() {
    List<DoorDetector> allDetectors = new ArrayList<>();
    for (Detector detector : detectorList) {
      List<DoorDetector> doorDetectorList = detector.getDoorDetectorList();
      allDetectors.addAll(doorDetectorList);
    }

    for (DoorDetector detector : allDetectors) {
      if (detector.isDetected()) {
        return detector;
      }
    }

    return null;
  }

  public DoorAlarm checkDoorAlarm() {
    List<DoorAlarm> allDetectors = new ArrayList<>();
    for (Detector detector : detectorList) {
      List<DoorAlarm> doorAlarmList = detector.getDoorAlarmList();
      allDetectors.addAll(doorAlarmList);
    }

    for (DoorAlarm detector : allDetectors) {
      if (detector.isDetected()) {
        return detector;
      }
    }

    return null;
  }

  public SmokeDetector checkSmokeDetector() {
    List<SmokeDetector> allDetectors = new ArrayList<>();
    for (Detector detector : detectorList) {
      List<SmokeDetector> smokeDetectorList = detector.getSmokeDetectorList();
      allDetectors.addAll(smokeDetectorList);
    }

    for (SmokeDetector detector : allDetectors) {
      if (detector.isDetected()) {
        return detector;
      }
    }

    return null;
  }

  public MotionDetector checkMotionDetector() {
    List<MotionDetector> allDetectors = new ArrayList<>();
    for (Detector detector : detectorList) {
      List<MotionDetector> motionDetectorList = detector.getMotionDetectorList();
      allDetectors.addAll(motionDetectorList);
    }

    for (MotionDetector detector : allDetectors) {
      if (detector.isDetected()) {
        return detector;
      }
    }

    return null;
  }

  public void resetAlarms() {

    for (Detector detector : detectorList) {
      for (WindowDetector windowDetector : detector.getWindowDetectorList()) {
        windowDetector.setBroken(false);
        windowDetector.setDetected(false);
      }

      for (DoorDetector doorDetector : detector.getDoorDetectorList()) {
        doorDetector.setDetected(false);
      }

      for (DoorAlarm doorAlarm : detector.getDoorAlarmList()) {
        doorAlarm.setDetected(false);
      }

      for (SmokeDetector smokeDetector : detector.getSmokeDetectorList()) {
        smokeDetector.setDetected(false);
      }

      for (MotionDetector motionDetector : detector.getMotionDetectorList()) {
        motionDetector.setDetected(false);
      }
    }
  }

  // Getters and Setters
  public List<Detector> getDetectorList() {
    return detectorList;
  }
}
