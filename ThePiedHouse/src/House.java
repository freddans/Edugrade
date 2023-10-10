import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class House {
  private String owner = "Erlich Bachman";
  private Random random = new Random();

  private CentralUnit centralUnit;
  private Room garage;
  private Room livingRoom;
  private Room kitchen;
  private Room bedRoom1;
  private Room bedRoom2;
  private Room bedRoom3;
  private Room bedRoom4;
  private Room bedRoom5;
  private Room hallWay;
  private Room backYard;

  // List of rooms
  private List<Room> roomList = new ArrayList<>();

  public House() {
    // Garage
    garage = new Room("Garage");
    garage.addWindowDetector("Garage Window");
    garage.addDoorDetector("Garage Door");
    garage.addDoorAlarm("Garage Port");
    garage.addSmokeDetector("Garage Smoke Detector");
    roomList.add(garage);

    // Living room
    livingRoom = new Room("Living Room");
    livingRoom.addWindowDetector("Living Room Window 1");
    livingRoom.addWindowDetector("Living Room Window 2");
    livingRoom.addDoorDetector("Living Room Door");
    livingRoom.addSmokeDetector("Living Room Smoke Detector");
    livingRoom.addMotionDetector("Living Room Motion Detector");
    roomList.add(livingRoom);

    // Kitchen
    kitchen = new Room("Kitchen");
    kitchen.addWindowDetector("Kitchen Window");
    kitchen.addSmokeDetector("Kitchen Smoke Detector");
    roomList.add(kitchen);

    // Bedroom 1
    bedRoom1 = new Room("Erlich Bachmans Room");
    bedRoom1.addWindowDetector("Erlich Bachmans Window 1");
    bedRoom1.addWindowDetector("Erlich Bachmans Window 2");
    bedRoom1.addDoorDetector("Erlich Bachmans Door");
    bedRoom1.addSmokeDetector("Erlich Bachmans Smoke Detector");
    roomList.add(bedRoom1);

    // Bedroom 2
    bedRoom2 = new Room("Jian Yangs Room");
    bedRoom2.addWindowDetector("Jian Yangs Window");
    bedRoom2.addDoorDetector("Jian Yangs Door");
    bedRoom2.addSmokeDetector("Jian Yangs Smoke Detector");
    roomList.add(bedRoom2);

    // Bedroom 3
    bedRoom3 = new Room("Richard Hendricks Room");
    bedRoom3.addWindowDetector("Richard Hendricks Window");
    bedRoom3.addDoorDetector("Richard Hendricks Door");
    bedRoom3.addSmokeDetector("Richard Hendricks Smoke Detector");
    roomList.add(bedRoom3);

    // Bedroom 4
    bedRoom4 = new Room("Bertram Gilfoyles Room");
    bedRoom4.addWindowDetector("Bertram Gilfoyles Window");
    bedRoom4.addDoorDetector("Bertram Gilfoyles Door");
    bedRoom4.addSmokeDetector("Bertram Gilfoyles Smoke Detector");
    roomList.add(bedRoom4);

    // Bedroom 5
    bedRoom5 = new Room("Dinesh Chugtais Room");
    bedRoom5.addWindowDetector("Dinesh Chugtais Window");
    bedRoom5.addDoorDetector("Dinesh Chugtais Door");
    bedRoom5.addSmokeDetector("Dinesh Chugtais Smoke Detector");
    roomList.add(bedRoom5);

    // Hallway
    hallWay = new Room("Hallway");
    hallWay.addWindowDetector("Hallway Window Detector");
    hallWay.addDoorAlarm("Hallway Entry Door");
    hallWay.addSmokeDetector("Hallway Smoke Detector");
    hallWay.addMotionDetector("Hallway Motion Detector");
    roomList.add(hallWay);

    // Backyard
    backYard = new Room("Backyard");
    backYard.addMotionDetector("Backyarad Motion Detector");
    roomList.add(backYard);
  }

  public void openRandomWindow() {
    List<WindowDetector> allDetectors = new ArrayList<>();
    for (Room room : roomList) {
      List<WindowDetector> windowDetectorList = room.getWindowDetectorList();
      allDetectors.addAll(windowDetectorList);
    }

    int windowListSize = allDetectors.size();

    if (windowListSize > 0) {
      int windowIndex = random.nextInt(windowListSize);
      WindowDetector window = allDetectors.get(windowIndex);
      window.open();
    }
  }


  public void breakRandomWindow() {
    List<WindowDetector> allDetectors = new ArrayList<>();
    for (Room room : roomList) {
      List<WindowDetector> windowDetectorList = room.getWindowDetectorList();
      allDetectors.addAll(windowDetectorList);
    }

    int windowListSize = allDetectors.size();

    if (windowListSize > 0) {
      int windowIndex = random.nextInt(windowListSize);
      WindowDetector window = allDetectors.get(windowIndex);
      window.breakWindow();
    }
  }

  public void openRandomDoor() {
    List<DoorDetector> allDetectors = new ArrayList<>();
    for (Room room : roomList) {
      List<DoorDetector> doorDetectorList = room.getDoorDetectorList();
      allDetectors.addAll(doorDetectorList);
    }

    int doorDetectorListSize = allDetectors.size();

    if (doorDetectorListSize > 0) {
      int doorIndex = random.nextInt(doorDetectorListSize);
      DoorDetector door = allDetectors.get(doorIndex);
      door.open();
    }
  }

  public void breakRandomDoor() {
    List<DoorAlarm> allDetectors = new ArrayList<>();
    for (Room room : roomList) {
      List<DoorAlarm> doorAlarmList = room.getDooralarmList();
      allDetectors.addAll(doorAlarmList);
    }

    int doorAlarmListSize = allDetectors.size();

    if (doorAlarmListSize > 0) {
      int doorIndex = random.nextInt(doorAlarmListSize);
      DoorAlarm door = allDetectors.get(doorIndex);
      door.breakDoor();
    }
  }

  public void triggerSmokeDetector() {
    List<SmokeDetector> allDetectors = new ArrayList<>();
    for (Room room : roomList) {
      List<SmokeDetector> smokeDetectorList = room.getSmokeDetectorList();
      allDetectors.addAll(smokeDetectorList);
    }

    int smokeDetectorListSize = allDetectors.size();

    if (smokeDetectorListSize > 0) {
      int smokeIndex = random.nextInt(smokeDetectorListSize);
      SmokeDetector smoke = allDetectors.get(smokeIndex);
      smoke.theSmokeDetector();
    } else {
      System.out.println("No smoke detectors available.");
    }
  }

  // Motion Detector
  public void triggerMotionDetector() {

    List<MotionDetector> allDetectors = new ArrayList<>();
    for (Room room : roomList) {
      List<MotionDetector> motionDetectorList = room.getMotionDetectorList();
      allDetectors.addAll(motionDetectorList);
    }

    int motionDetectorListSize = allDetectors.size();

    if (motionDetectorListSize > 0) {
      int motionIndex = random.nextInt(motionDetectorListSize);
      MotionDetector motion = allDetectors.get(motionIndex);
      motion.setMotion(true);
    }
  }

  public void triggerMotionBackyard() {

    List<MotionDetector> backyardDetectors = backYard.getMotionDetectorList();

    if (!backyardDetectors.isEmpty()) {
      int motionIndex = random.nextInt(backyardDetectors.size());
      MotionDetector motion = backyardDetectors.get(motionIndex);
      motion.setMotion(true);
    }
  }

  // check motion detector
  public MotionDetector checkMotionDetector() {
    List<MotionDetector> allDetectors = new ArrayList<>();
    for (Room room : roomList) {
      List<MotionDetector> motionDetectorList = room.getMotionDetectorList();
      allDetectors.addAll(motionDetectorList);
    }

    for (MotionDetector detector : allDetectors) {
      if (detector.isMotion()) {
        return detector;
      }
    }

    return null;
  }

  // check window detector
  public WindowDetector checkWindowDetector() {
    List<WindowDetector> allDetectors = new ArrayList<>();
    for (Room room : roomList) {
      List<WindowDetector> windowDetectorList = room.getWindowDetectorList();
      allDetectors.addAll(windowDetectorList);
    }

    for (WindowDetector detector : allDetectors) {
      if (detector.isBroken() || detector.isOpen()) {
        return detector;
      }
    }

    return null;
  }

  // check door detector
  public DoorDetector checkDoorDetector() {
    List<DoorDetector> allDetectors = new ArrayList<>();
    for (Room room : roomList) {
      List<DoorDetector> doorDetectorList = room.getDoorDetectorList();
      allDetectors.addAll(doorDetectorList);
    }

    for (DoorDetector detector : allDetectors) {
      if (detector.isOpen()) {
        return detector;
      }
    }

    return null;
  }

  // Check smoke detector
  public SmokeDetector checkSmokeDetector() {
    List<SmokeDetector> allDetectors = new ArrayList<>();
    for (Room room : roomList) {
      List<SmokeDetector> smokeDetectorList = room.getSmokeDetectorList();
      allDetectors.addAll(smokeDetectorList);
    }

    for (SmokeDetector detector : allDetectors) {
      if (detector.isSmokeDetected()) {
        return detector;
      }
    }

    return null;
  }

  // check door alarm
  public DoorAlarm checkDoorAlarm() {
    List<DoorAlarm> allDetectors = new ArrayList<>();
    for (Room room : roomList) {
      List<DoorAlarm> doorAlarmList = room.getDooralarmList();
      allDetectors.addAll(doorAlarmList);
    }

    for (DoorAlarm detector : allDetectors) {
      if (detector.isBroken()) {
        return detector;
      }
    }

    return null;
  }

  // reset alarms
  public void resetAlarms() {

    for (Room room : roomList) {
      for (MotionDetector motionDetector : room.getMotionDetectorList()) {
        motionDetector.setMotion(false);
      }

      for (WindowDetector windowDetector : room.getWindowDetectorList()) {
        windowDetector.setBroken(false);
        windowDetector.setOpen(false);
      }

      for (DoorDetector doorDetector : room.getDoorDetectorList()) {
        doorDetector.setOpen(false);
      }

      for (DoorAlarm doorAlarm : room.getDooralarmList()) {
        doorAlarm.setBroken(false);
      }

      for (SmokeDetector smokeDetector : room.getSmokeDetectorList()) {
        smokeDetector.setSmokeDetected(false);
      }
    }
  }

  // Getters and Setters
  public List<Room> getRoomList() {
    return roomList;
  }
}
