package alarmsystem;

import alarmsystem.detectors.Room;
import alarmsystem.detectors.parts.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CentralUnit {
  // Attributes
  Random random = new Random();

  // List
  List<Room> roomList = new ArrayList<>();

  // Constructor

  public CentralUnit() {
    // Garage
    Room garage = new Room("Garage");
    garage.addDetector(new WindowDetector("Garage Window"));
    garage.addDetector(new DoorDetector("Garage Door"));
    garage.addDetector(new DoorAlarm("Garage Port"));
    garage.addDetector(new SmokeDetector("Garage Smoke Detector"));
    roomList.add(garage);

    // Living Room
    Room livingRoom = new Room("Living Room");
    livingRoom.addDetector(new WindowDetector("Living Room Window 1"));
    livingRoom.addDetector(new WindowDetector("Living Room Window 2"));
    livingRoom.addDetector(new DoorDetector("Living Room Door"));
    livingRoom.addDetector(new SmokeDetector("Living Smoke Detector"));
    livingRoom.addDetector(new MotionDetector("Living Motion Detector"));
    roomList.add(livingRoom);

    // Kitchen
    Room kitchen = new Room("Kitchen");
    kitchen.addDetector(new WindowDetector("Kitchen Window"));
    kitchen.addDetector(new SmokeDetector("Kitchen Smoke Detector"));
    roomList.add(kitchen);

    // Bedroom1
    Room bedRoom1 = new Room("Erlich Bachmans Room");
    bedRoom1.addDetector(new WindowDetector("Erlich Bachmans Window 1"));
    bedRoom1.addDetector(new WindowDetector("Erlich Bachmans Window 2"));
    bedRoom1.addDetector(new DoorDetector("Erlich Bachmans Door"));
    bedRoom1.addDetector(new SmokeDetector("Erlich Bachmans Smoke Detector"));
    roomList.add(bedRoom1);

    // Bedroom2
    Room bedRoom2 = new Room("Jian Yangs Room");
    bedRoom2.addDetector(new WindowDetector("Jian Yangs Window"));
    bedRoom2.addDetector(new DoorDetector("Jian Yangs Door"));
    bedRoom2.addDetector(new SmokeDetector("Jian Yangs Smoke Detector"));
    roomList.add(bedRoom2);

    // Bedroom3
    Room bedRoom3 = new Room("Richard Hendricks Room");
    bedRoom3.addDetector(new WindowDetector("Richard Hendricks Window"));
    bedRoom3.addDetector(new DoorDetector("Richard Hendricks Door"));
    bedRoom3.addDetector(new SmokeDetector("Richard Hendricks Smoke Detector"));
    roomList.add(bedRoom3);

    // Bedroom4
    Room bedRoom4 = new Room("Bertram Gilfoyles Room");
    bedRoom4.addDetector(new WindowDetector("Bertram Gilfoyles Window 1"));
    bedRoom4.addDetector(new WindowDetector("Bertram Gilfoyles Window 2"));
    bedRoom4.addDetector(new DoorDetector("Bertram Gilfoyles Door"));
    bedRoom4.addDetector(new SmokeDetector("Bertram Gilfoyles Smoke Detector"));
    roomList.add(bedRoom4);

    // Bedroom5
    Room bedRoom5 = new Room("Dinesh Chugtais Room");
    bedRoom5.addDetector(new WindowDetector("Dinesh Chugtais Window"));
    bedRoom5.addDetector(new DoorDetector("Dinesh Chugtais Door"));
    bedRoom5.addDetector(new SmokeDetector("Dinesh Chugtais Smoke Detector"));
    roomList.add(bedRoom5);

    // Hallway
    Room hallWay = new Room("Hallway");
    hallWay.addDetector(new WindowDetector("Hallway Window"));
    hallWay.addDetector(new DoorAlarm("Hallway Entry Door"));
    hallWay.addDetector(new SmokeDetector("Hallway Smoke Detector"));
    hallWay.addDetector(new MotionDetector("Hallway Motion Detector"));
    roomList.add(hallWay);

    // Backyard
    Room backYard = new Room("Backyard");
    backYard.addDetector(new MotionDetector("Backyard Motion Detector"));
    roomList.add(backYard);
  }

  // Methods
  public void openRandomWindow() {
    List<WindowDetector> windowDetectorList = new ArrayList<>();
    for (Room room : roomList) {
      for (Detector detector : room.getDetectorList()) {
        if (detector instanceof WindowDetector) {
          windowDetectorList.add((WindowDetector) detector);
        }
      }
    }

    int windowIndex = random.nextInt(windowDetectorList.size());
    WindowDetector detector = windowDetectorList.get(windowIndex);
    detector.setDetected(true);
  }

  public void breakRandomWindow() {
    List<WindowDetector> windowDetectorList = new ArrayList<>();
    for (Room room : roomList) {
      for (Detector detector : room.getDetectorList()) {
        if (detector instanceof WindowDetector) {
          windowDetectorList.add((WindowDetector) detector);
        }
      }
    }

    int windowIndex = random.nextInt(windowDetectorList.size());
    WindowDetector detector = windowDetectorList.get(windowIndex);
    detector.setBroken(true);
  }

  public void openRandomDoor() {
    List<DoorDetector> doorDetectorList = new ArrayList<>();
    for (Room room : roomList) {
      for (Detector detector : room.getDetectorList()) {
        if (detector instanceof DoorDetector) {
          doorDetectorList.add((DoorDetector) detector);
        }
      }
    }

    int doorIndex = random.nextInt(doorDetectorList.size());
    DoorDetector detector = doorDetectorList.get(doorIndex);
    detector.setDetected(true);
  }

  public void breakRandomDoor() {
    List<DoorAlarm> doorAlarmList = new ArrayList<>();
    for (Room room : roomList) {
      for (Detector detector : room.getDetectorList()) {
        if (detector instanceof DoorAlarm) {
          doorAlarmList.add((DoorAlarm) detector);
        }
      }
    }

    int doorIndex = random.nextInt(doorAlarmList.size());
    DoorAlarm detector = doorAlarmList.get(doorIndex);
    detector.setDetected(true);
  }

  public void triggerRandomSmokeDetector() {
    List<SmokeDetector> smokeDetectorList = new ArrayList<>();
    for (Room room : roomList) {
      for (Detector detector : room.getDetectorList()) {
        if (detector instanceof SmokeDetector) {
          smokeDetectorList.add((SmokeDetector) detector);
        }
      }
    }

    int smokeIndex = random.nextInt(smokeDetectorList.size());
    SmokeDetector detector = smokeDetectorList.get(smokeIndex);
    detector.setDetected(true);
  }

  public void triggerRandomMotionDetector() {
    List<MotionDetector> motionDetectorList = new ArrayList<>();
    for (Room room : roomList) {
      for (Detector detector : room.getDetectorList()) {
        if (detector instanceof MotionDetector) {
          motionDetectorList.add((MotionDetector) detector);
        }
      }
    }

    int motionIndex = random.nextInt(motionDetectorList.size());
    MotionDetector detector = motionDetectorList.get(motionIndex);
    detector.setDetected(true);
  }

  public void toggleSecretDocuments() {
    for (Room room : roomList) {
      if (room.getName().equalsIgnoreCase("Jian Yangs Room")) {
        if (room.isSecretDocuments()) {
          room.setSecretDocuments(false);
          room.removeDetector("Jian Yangs Door");
        } else {
          room.setSecretDocuments(true);
          room.addDetector(new DoorAlarm("Jian Yangs Door"));
        }
      }

    }
  }

  public void triggerBackYardMotionDetector() {
    for (Room room : roomList) {
      if (room.getName().equalsIgnoreCase("Backyard")) {
        for (Detector detector : room.getDetectorList()) {
          if (detector instanceof MotionDetector) {
            ((MotionDetector) detector).setDetected(true);
          }
        }
      }
    }
  }

  public void checkBackYardMotionDetector() {
    for (Room room : roomList) {
      if (room.getName().equalsIgnoreCase("Backyard")) {
        for (Detector detector : room.getDetectorList()) {
          if (detector instanceof MotionDetector) {
            if (((MotionDetector) detector).isDetected()) {
              detector.notification();
            }
          }
        }
      }
    }
  }

  // Checking if broken
  public void checkWindowDetector() {
    for (Room room : roomList) {
      for (Detector detector : room.getDetectorList()) {
        if (detector instanceof WindowDetector) {

          if (((WindowDetector) detector).isDetected()) {
            detector.notification();
          } else if (((WindowDetector) detector).isBroken()) {
            ((WindowDetector) detector).broken();
          }
        }
      }
    }
  }

  public void checkDoorDetector() {
    for (Room room : roomList) {
      for (Detector detector : room.getDetectorList()) {
        if (detector instanceof DoorDetector) {

          if (((DoorDetector) detector).isDetected()) {
            detector.notification();
          }
        }
      }
    }
  }

  public void checkDoorAlarm() {
    for (Room room : roomList) {
      for (Detector detector : room.getDetectorList()) {
        if (detector instanceof DoorAlarm) {

          if (((DoorAlarm) detector).isDetected()) {
            detector.notification();
          }
        }
      }
    }
  }

  public void checkSmokeDetector() {
    for (Room room : roomList) {
      for (Detector detector : room.getDetectorList()) {
        if (detector instanceof SmokeDetector) {

          if (((SmokeDetector) detector).isDetected()) {
            detector.notification();
          }
        }
      }
    }
  }

  public void checkMotionDetector() {
    for (Room room : roomList) {
      for (Detector detector : room.getDetectorList()) {
        if (detector instanceof MotionDetector) {

          if (((MotionDetector) detector).isDetected()) {
            detector.notification();
          }
        }
      }
    }
  }

  public void resetAlarms() {

    for (Room room : roomList) {
      for (Detector detector : room.getDetectorList()) {
        detector.resetDetector();
      }
    }
  }

    // Getters and Setters
    public List<Room> getDetectorList () {
      return roomList;
    }
  }
