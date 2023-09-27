import java.util.Random;
import java.util.Scanner;

public class House {
  private String owner;
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
  private Alarmsystem alarmSystem;

  // Constructor
  public House() {
    this.owner = "Erlich Bachman";
    this.garage = new Room("Garage", 1, 2);
    this.livingRoom = new Room("Livingroom", 2, 1);
    this.kitchen = new Room("Kitchen", 1, 0);
    this.bedRoom1 = new Room("Erlich Bachman's Room", 2, 1);
    this.bedRoom2 = new Room("Jian Yang's Room", 1, 1);
    this.bedRoom3 = new Room("Richard Hendricks' Room", 1, 1);
    this.bedRoom4 = new Room("Bertram Gilfoyle's Room", 2, 1);
    this.bedRoom5 = new Room("Dinesh Chugtai's Room", 1, 1);
    this.hallWay = new Room("Hallway", 1, 1);
    this.backYard = new Room("Backyard", 1, 1);
    this.alarmSystem = new Alarmsystem();
  }

  // Methods
  public void startProgram() {
    initializeLists();

  }

  // Alarm on/off
  public void alarmOn() {
    if (alarmSystem.isAlarmOn()) {
      alarmSystem.setAlarmOn(false);
    } else {
      alarmSystem.setAlarmOn(true);
    }
  }

  // Secret documents true/false
  public void secretDocuments() {
    if (bedRoom2.isSecretDocuments()) {
      bedRoom2.setSecretDocuments(false);
      alarmSystem.removeDoorAlarm(2);
    } else {
      bedRoom2.setSecretDocuments(true);
      alarmSystem.addDoorAlarm(bedRoom2);
    }
  }

  public void initializeLists() {
    // Initialize lists

    // Doordetectors
    alarmSystem.addDoorDetector(garage);
    alarmSystem.addDoorDetector(livingRoom);
    alarmSystem.addDoorDetector(bedRoom1);
    alarmSystem.addDoorDetector(bedRoom2);
    alarmSystem.addDoorDetector(bedRoom3);
    alarmSystem.addDoorDetector(bedRoom4);
    alarmSystem.addDoorDetector(bedRoom5);

    // Windowdetectors
    alarmSystem.addWindowDetector(garage);
    alarmSystem.addWindowDetector(livingRoom);
    alarmSystem.addWindowDetector(kitchen);
    alarmSystem.addWindowDetector(bedRoom1);
    alarmSystem.addWindowDetector(bedRoom2);
    alarmSystem.addWindowDetector(bedRoom3);
    alarmSystem.addWindowDetector(bedRoom4);
    alarmSystem.addWindowDetector(bedRoom5);
    alarmSystem.addWindowDetector(hallWay);

    // Alarm on doors
    alarmSystem.addDoorAlarm(garage);
    alarmSystem.addDoorAlarm(hallWay);

    // Alarm on windows - kan använda samma lista som windowDetectors???
    alarmSystem.addWindowAlarm(garage);
    alarmSystem.addWindowAlarm(livingRoom);
    alarmSystem.addWindowAlarm(kitchen);
    alarmSystem.addWindowAlarm(bedRoom1);
    alarmSystem.addWindowAlarm(bedRoom2);
    alarmSystem.addWindowAlarm(bedRoom3);
    alarmSystem.addWindowAlarm(bedRoom4);
    alarmSystem.addWindowAlarm(bedRoom5);
    alarmSystem.addWindowAlarm(hallWay);

    // Motiondetectors
    alarmSystem.addMotionDetector(hallWay);
    alarmSystem.addMotionDetector(livingRoom);
    alarmSystem.addMotionDetector(backYard);

    // Smokedetectors - kan använda samma lista som windowDetectors???
    alarmSystem.addSmokeDetector(garage);
    alarmSystem.addSmokeDetector(livingRoom);
    alarmSystem.addSmokeDetector(kitchen);
    alarmSystem.addSmokeDetector(bedRoom1);
    alarmSystem.addSmokeDetector(bedRoom2);
    alarmSystem.addSmokeDetector(bedRoom3);
    alarmSystem.addSmokeDetector(bedRoom4);
    alarmSystem.addSmokeDetector(bedRoom5);
    alarmSystem.addSmokeDetector(hallWay);

    System.out.println("Lists initialized.");
    System.out.println();
    menu();
  }

  public void menu() {
    Scanner sc = new Scanner(System.in);
    int input;

    do {
      System.out.println();
      System.out.println("Menu");
      System.out.println("1. Set alarm on/off. Alarm is currently: " + alarmSystem.isAlarmOn());
      System.out.println("2. Open random window");
      System.out.println("3. Open random door");
      System.out.println("4. Break random window");
      System.out.println("5. Break random door");
      System.out.println("6. Set secret documents on/off. Secret Documents is currently: " + bedRoom2.isSecretDocuments());
      System.out.println("7. Trigger random motiondetector");
      System.out.println("8. Start random fire");
      System.out.println("9. Trigger random disaster");
      System.out.println("10. Exit program.");

      System.out.print("Input number: ");
      input = sc.nextInt();


      switch (input) {
        case 1:
          alarmOn();
          break;
        case 2:
          openRandomWindow();
          break;
        case 3:
          openRandomDoor();
          break;
        case 4:
          breakRandomWindow();
          break;
        case 5:
          breakRandomDoor();
          break;
        case 6:
          secretDocuments();
          break;
        case 7:
          triggerMotionDetector();
          break;
        case 8:
          triggerSmokeDetector();
          break;
        case 9:
          randomDisaster();
          break;
        case 10:
          System.out.println("Exiting program");
          break;
        default:
          System.out.println("Input number between 1-10.");
      }
    } while (input != 10);
  }


  public void openRandomWindow() {
    alarmSystem.windowMotion();
  }

  public void openRandomDoor() {
    alarmSystem.doorMotion();
  }

  public void breakRandomWindow() {
    alarmSystem.windowBroken();
  }

  public void breakRandomDoor() {
    alarmSystem.doorBroken();
  }

  public void triggerMotionDetector() {
    alarmSystem.triggerMotionDetector();
  }

  public void triggerSmokeDetector() {
    alarmSystem.triggerSmokeDetector();
  }

  public void randomDisaster() {
    Random random = new Random();
    int randomNr = random.nextInt(3) + 1;

    if (randomNr == 1) {
      breakRandomWindow();
    } else if (randomNr == 2) {
      breakRandomDoor();
    } else if (randomNr == 3) {
      triggerSmokeDetector();
    }
  }

  @Override
  public String toString() {
    return "House{" +
        "owner='" + owner + '\'' +
        ", garage=" + garage +
        ", livingRoom=" + livingRoom +
        ", kitchen=" + kitchen +
        ", bedRoom1=" + bedRoom1 +
        ", bedRoom2=" + bedRoom2 +
        ", bedRoom3=" + bedRoom3 +
        ", bedRoom4=" + bedRoom4 +
        ", bedRoom5=" + bedRoom5 +
        ", hallWay=" + hallWay +
        ", backYard=" + backYard +
        ", alarmSystem=" + alarmSystem +
        '}';
  }
}
