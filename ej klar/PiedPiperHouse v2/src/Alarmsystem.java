import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Alarmsystem {
  private boolean alarmOn;
  private List<Room> windowDetector = new ArrayList<>();
  private List<Room> doorDetector = new ArrayList<>();
  private List<Room> motionDetector = new ArrayList<>();
  private List<Room> windowAlarm = new ArrayList<>();
  private List<Room> doorAlarm = new ArrayList<>();
  private List<Room> smokeDetector = new ArrayList<>();

  // Constructor
  public Alarmsystem() {
    this.alarmOn = false;

  }

  // Methods

  // Open random Window
  public void windowMotion() {
    if (alarmOn) {
      Random random = new Random();
      int randomNr = random.nextInt(getWindowDetector().size());
      String randomRoom = getWindowDetector().get(randomNr).getName();
      System.out.println(randomRoom + " -> Window opened.");
    }
  }

  // Open random Door
  public void doorMotion() {
    if (alarmOn) {
      Random random = new Random();
      int randomNr = random.nextInt(getDoorDetector().size());
      String randomRoom = getDoorDetector().get(randomNr).getName();

      if (getDoorDetector().get(randomNr).isSecretDocuments()) {
        System.out.println(randomRoom + " -> Door locked.");
      } else {
        System.out.println(randomRoom + " -> Door opened.");
      }
    }
  }

  // Break random Window
  public void windowBroken() {
    if (alarmOn) {
      Random random = new Random();
      int randomNr = random.nextInt(getWindowAlarm().size());
      String randomRoom = getWindowAlarm().get(randomNr).getName();

      System.out.println(randomRoom + " -> Window broken.");
      getWindowAlarm().get(randomNr).setWindowBroken(true); // Setting boolean to true -> -1 window in Room class.
      sirens();
    }
  }

  // Break random Door
  public void doorBroken() {
    if (alarmOn) {
      Random random = new Random();
      int randomNr = random.nextInt(getDoorAlarm().size());
      String randomRoom = getDoorAlarm().get(randomNr).getName();

      System.out.println(randomRoom + " -> Door broken.");
      getDoorAlarm().get(randomNr).setDoorBroken(true); // Setting boolean to true -> -1 door in Room class.
      sirens();
    }
  }

  // Trigger motions sensor
  public void triggerMotionDetector() {
    if (alarmOn) {
      Random random = new Random();
      int randomNr = random.nextInt(getMotionDetector().size());
      String randomRoom = getMotionDetector().get(randomNr).getName();

      System.out.println(randomRoom + " -> Motionsensors detect movement!");
    }
  }

  // Trigger smoke detector
  public void triggerSmokeDetector() {
    Random random = new Random();
    int randomNr = random.nextInt(getSmokeDetector().size());
    String randomRoom = getSmokeDetector().get(randomNr).getName();

    System.out.println(randomRoom + " -> Smokedetector detect smoke!");

    triggerSprinklerSystem(randomNr); // tar randomNr och går in i
  }

  public void triggerSprinklerSystem(int randomNr) {
    if (getSmokeDetector().get(randomNr).isSmokeDetector()) {
      SprinklerSystem();
      System.out.println(getSmokeDetector().get(randomNr).getName() + " -> Sprinklers start");
    }
  }

  // Sprinklersystem
  public void SprinklerSystem() {
    sirens();
    System.out.println(getClass().getSimpleName() + " -> Sprinklersystem activated.");
  }

  // sirens
  public void sirens() {
    sirenOne();
    sirenTwo();
  }

  public void sirenOne() {
    if (alarmOn) {
      System.out.println(getClass().getSimpleName() + " -> TJUUUUUUT!");
    }
  }

  public void sirenTwo() {
    if (alarmOn) {
      System.out.println(getClass().getSimpleName() + " -> TJUUUUUUT!");
    }
  }

  // Add rooms to lists
  public void addWindowDetector(Room room) {
    getWindowDetector().add(room);
    System.out.println(getClass().getSimpleName() + " -> Window detector installed on windows.");
  }

  public void addDoorDetector(Room room) {
    getDoorDetector().add(room);
    System.out.println(getClass().getSimpleName() + " -> Door detector installed on doors.");
  }

  public void addDoorAlarm(Room room) {
    getDoorAlarm().add(room);
    System.out.println(getClass().getSimpleName() + " -> Alarm installed on doors.");
  }

  public void removeDoorAlarm(int indexNr) {
    getDoorAlarm().remove(indexNr);
  }

  public void addWindowAlarm(Room room) {
    getWindowAlarm().add(room);
    System.out.println(getClass().getSimpleName() + " -> Alarm installed on windows.");
  }

  public void addMotionDetector(Room room) {
    getMotionDetector().add(room);
    System.out.println(getClass().getSimpleName() + " -> Motion detectors installed.");
  }

  public void addSmokeDetector(Room room) {
    getSmokeDetector().add(room);
    System.out.println(getClass().getSimpleName() + " -> Smoke detectors installed.");
  }

  public boolean isAlarmOn() {
    return alarmOn;
  }

  public void setAlarmOn(boolean alarmOn) {
    this.alarmOn = alarmOn;
  }

  public List<Room> getSmokeDetector() {
    return smokeDetector;
  }

  public void setSmokeDetector(List<Room> smokeDetector) {
    this.smokeDetector = smokeDetector;
  }

  public List<Room> getWindowDetector() {
    return windowDetector;
  }

  public void setWindowDetector(List<Room> windowDetector) {
    this.windowDetector = windowDetector;
  }

  public List<Room> getDoorDetector() {
    return doorDetector;
  }

  public void setDoorDetector(List<Room> doorDetector) {
    this.doorDetector = doorDetector;
  }

  public List<Room> getMotionDetector() {
    return motionDetector;
  }

  public void setMotionDetector(List<Room> motionDetector) {
    this.motionDetector = motionDetector;
  }

  public List<Room> getWindowAlarm() {
    return windowAlarm;
  }

  public void setWindowAlarm(List<Room> windowBroken) {
    this.windowAlarm = windowBroken;
  }

  public List<Room> getDoorAlarm() {
    return doorAlarm;
  }

  public void setDoorAlarm(List<Room> doorAlarm) {
    this.doorAlarm = doorAlarm;
  }
}
