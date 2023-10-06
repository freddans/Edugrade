import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class House {
  // var
  private String owner = "Erlich Bachman";
  private CentralUnit centralUnit;
  private Random random = new Random(System.currentTimeMillis());

  // Initialize room
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

  // List
  private List<Room> roomList = new ArrayList<>();

  // Constructor
  public House() {

    // Garage
    garage = new Room("Garage");
    garage.addWindowDetector("Garage Window");
    garage.addDoorDetector("Garage door");
    garage.addDoorAlarm("Garage port");
    garage.addSmokeDetector("Garage Smoke Detector");
    roomList.add(garage);

    // Living room
    livingRoom = new Room("Living room");
    livingRoom.addWindowDetector("Living room Window 1");
    livingRoom.addWindowDetector("Living room Window 2");
    livingRoom.addDoorDetector("Living room door");
    livingRoom.addSmokeDetector("Living room Smoke Detector");
    livingRoom.addMotionDetector("Living room Motion Detector");
    roomList.add(livingRoom);

    // Kitchen
    kitchen = new Room("Kitchen");
    kitchen.addWindowDetector("Kitchen Window Detector");
    kitchen.addSmokeDetector("Kitchen Smoke Detector");
    roomList.add(kitchen);

    // Bedroom1
    bedRoom1 = new Room("Erlich Bachmans Room");
    bedRoom1.addWindowDetector("Erlich Bachmans Window 1");
    bedRoom1.addWindowDetector("Erlich Bachmans Window 2");
    bedRoom1.addDoorDetector("Erlich Bachmans Door");
    bedRoom1.addSmokeDetector("Erlich Bachmans Smoke Detector");
    roomList.add(bedRoom1);

    // Bedroom2
    bedRoom2 = new Room("Jian Yangs Room");
    bedRoom2.addWindowDetector("Jian Yangs Window");
    bedRoom2.addDoorDetector("Jian Yangs Door");
    bedRoom2.addSmokeDetector("Jian Yangs Smoke Detector");
    roomList.add(bedRoom2);

    // Bedroom3
    bedRoom3 = new Room("Richard Hendricks Room");
    bedRoom3.addWindowDetector("Richard Hendricks Window");
    bedRoom3.addDoorDetector("Richard Hendricks Door");
    bedRoom3.addSmokeDetector("Richard Hendricks Smoke Detector");
    roomList.add(bedRoom3);

    // Bedroom4
    bedRoom4 = new Room("Bertram Gilfoyles Room");
    bedRoom4.addWindowDetector("Bertram Gilfoyles Window");
    bedRoom4.addDoorDetector("Bertram Gilfoyles Door");
    bedRoom4.addSmokeDetector("Bertram Gilfoyles Smoke Detector");
    roomList.add(bedRoom4);

    // Bedroom5
    bedRoom5 = new Room("Dinesh Chugtais Room");
    bedRoom5.addWindowDetector("Dinesh Chugtais Window Detector");
    bedRoom5.addDoorDetector("Dinesh Chugtais Door");
    bedRoom5.addSmokeDetector("Dinesh Chugtais Smoke Detector");
    roomList.add(bedRoom5);

    // Hallway
    hallWay = new Room("Hallway");
    hallWay.addWindowDetector("Hallway Window Detector");
    hallWay.addDoorAlarm("Hallway entry Door");
    hallWay.addSmokeDetector("Hallway Smoke Detector");
    hallWay.addMotionDetector("Hallway Motion Detector");
    roomList.add(hallWay);

    // Backyard
    backYard = new Room("Backyard");
    backYard.addMotionDetector("Backyard Motion Detector");
    roomList.add(backYard);
  }

  // Methods

  // Open random window
  public void openRandomWindow() {

    if (centralUnit.isAlarmOn()) {
      List<WindowDetector> allDetectors = new ArrayList<>();
      for (Room room : roomList) { // Loop through all rooms
        List<WindowDetector> windowDetectorsList = room.getWindowDetectorList(); // get the list from Room.java
        allDetectors.addAll(windowDetectorsList); // add all windowDetectors into list
      }

      int windowListSize = allDetectors.size();

      int windowIndex = random.nextInt(windowListSize);
      WindowDetector window = allDetectors.get(windowIndex);
      window.open(window);
    }
  }

  // Break random window
  public void breakRandomWindow() {
    if (centralUnit.isAlarmOn()) {
      List<WindowDetector> allDetectors = new ArrayList<>();
      for (Room room : roomList) {
        List<WindowDetector> windowDetectorList = room.getWindowDetectorList();
        allDetectors.addAll(windowDetectorList);
      }

      int windowListSize = allDetectors.size();

      int windowIndex = random.nextInt(windowListSize);
      WindowDetector window = allDetectors.get(windowIndex);
      window.windowBroken(window);
    }
  }

  // Open random door
  public void openRandomDoor() {
    if (centralUnit.isAlarmOn()) {
      List<DoorDetector> allDetectors = new ArrayList<>();
      for (Room room : roomList) {
        List<DoorDetector> doorDetectorList = room.getDoorDetectorList();
        allDetectors.addAll(doorDetectorList);
      }

      int doorListSize = allDetectors.size();

      int doorIndex = random.nextInt(doorListSize);
      DoorDetector door = allDetectors.get(doorIndex);
      door.open(door);
    }
  }

  // Break random door
  public void breakRandomDoor() {
    if (centralUnit.isAlarmOn()) {
      List<DoorAlarm> allDetectors = new ArrayList<>();
      for (Room room : roomList) {
        List<DoorAlarm> doorAlarmList = room.getDoorAlarmList();
        allDetectors.addAll(doorAlarmList);
      }

      int doorListSize = allDetectors.size();

      int doorIndex = random.nextInt(doorListSize);
      DoorAlarm door = allDetectors.get(doorIndex);
      door.doorBroken(door);
    }
  }

  // Trigger Detector
  public void smokeDetector() {

    List<SmokeDetector> allDetectors = new ArrayList<>();
    for (Room room : roomList) {
      List<SmokeDetector> smokeDetectorList = room.getSmokeDetectorList();
      allDetectors.addAll(smokeDetectorList);
    }

    int smokeDetectorListSize = allDetectors.size();

    int smokeIndex = random.nextInt(smokeDetectorListSize);
    SmokeDetector smoke = allDetectors.get(smokeIndex);
    smoke.smokeDetected(smoke);

  }

  // Trigger Motion Detector
  public void detectMotion() {
    if (centralUnit.isAlarmOn()) {
      List<MotionDetector> allDetectors = new ArrayList<>();
      for (Room room : roomList) {
        List<MotionDetector> motionDetectorList = room.getMotionDetectorList();
        allDetectors.addAll(motionDetectorList);
      }

      int motionDetectorListSize = allDetectors.size();

      int motionIndex = random.nextInt(motionDetectorListSize);
      MotionDetector motion = allDetectors.get(motionIndex);
      motion.motionDetected(motion);
    }
  }

  // Trigger random disaster
  public void randomDisaster() {
    int randomNr = random.nextInt(4)+1; // randomNr 1-4

    if (randomNr == 1) {
      smokeDetector();
    } else if (randomNr == 2) {
      breakRandomWindow();
    } else if (randomNr == 3) {
      breakRandomDoor();
    } else if (randomNr == 4) {
      detectMotion();
    }
  }

  // Check roomList
  public void checkRoomList() {
    for (int i = 0; i < roomList.size(); i++) {
      System.out.println(roomList.get(i).getName());
    }
  }

  // Check window detector list
  public void checkWindowList() {
    for (Room room : roomList) {
      List<WindowDetector> windowDetectors = room.getWindowDetectorList();
      for (WindowDetector detector : windowDetectors) {
        System.out.println(detector.getName());
      }
    }
  }

  // Getters and Setters
  public List<Room> getRoomList() {
    return roomList;
  }
}
