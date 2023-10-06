import java.util.Scanner;

public class CentralUnit {
  private House house;
  private boolean alarmOn = true;
  private WindowDetector windowDetector;
  private DoorDetector doorDetector;
  private DoorAlarm doorAlarm;
  private Siren siren = new Siren();

  // Constructor

  public CentralUnit() {
    house = new House();
  }


  // Methods



  // Menu
  public void menu() {
    Scanner sc = new Scanner(System.in);
    int choice;

    do {
      System.out.println("1. Set alarm on/off. Alarmstatus: " + isAlarmOn());
      System.out.println("2. Open random window");
      System.out.println("3. Break random window");
      System.out.println("4. Open random door");
      System.out.println("5. Break random door");
      System.out.println("6. Secret Documents on/off. Status: " + house.getRoomList().get(4).isSecretDocuments());
      System.out.println("7. Start random fire");
      System.out.println("8. Trigger random motion detector");
      System.out.println("9. Trigger random disaster");
      System.out.println("10. Check room list");
      System.out.println("12. Exit program");

      System.out.print("Input number: ");
      choice = sc.nextInt();

      switch (choice) {
        case 1:
          if (alarmOn) {
            alarmOn = false;
          } else {
            alarmOn = true;
          }
          break;
        case 2:
          house.openRandomWindow();
          break;
        case 3:
          house.breakRandomWindow();
          break;
        case 4:
          house.openRandomDoor();
          break;
        case 5:
          house.breakRandomDoor();
          break;
        case 6:
          if (house.getRoomList().get(4).isSecretDocuments()) {
            house.getRoomList().get(4).setSecretDocuments(false);
            // if bedroom2 is in doorAlarm-list, delete it - ska läggas till.
          } else {
            house.getRoomList().get(4).setSecretDocuments(true);
            // add bedroom2 to doorAlarm - ska läggas till
          }
          break;
        case 7:
          house.smokeDetector();
          break;
        case 8:
          house.detectMotion();
          break;
        case 9:
          house.randomDisaster();
          break;
        case 10:
          house.checkRoomList();
          break;
        case 11:
          //reset
          break;
        case 12:
          System.out.println("Exiting program");
          break;
        default:
          System.out.println("Invalid number. Input number between 1-10 & 12.");
      }
    } while (choice != 12);
  }

  // Messages
  public void windowOpened(WindowDetector detector) {
    if (detector.isOpen()) {
      System.out.println(detector.getName() + " -> was opened");
      windowDetector = detector;
      detector.setOpen(false);
    }
  }

  public void windowBroken(WindowDetector detector) {
    if(detector.isBroken()) {
      System.out.println(detector.getName() + " -> was broken");
      siren.triggerSirens();
    }
  }

  public void doorOpened(DoorDetector detector) {
    if (detector.isOpen()) {
      System.out.println(detector.getName() + " -> was opened");
      doorDetector = detector;
      detector.setOpen(false);
    }
  }

  public void doorBroken(DoorAlarm detector) {
    if (detector.isBroken()) {
      System.out.println(detector.getName() + " -> was broken");
      siren.triggerSirens();
    }
  }

  public void smokeDetected(SmokeDetector detector) {
    if (detector.isSmoke()) {
      System.out.println(detector.getName() + " -> detected smoke");
      siren.triggerSirens();
      detector.sprinklerSystem(detector);
    }
  }

  public void motionDetected(MotionDetector detector) {
    if (detector.isMovement()) {
      System.out.println(detector.getName() + " -> detected motion");
      detector.setMovement(false);
    }
  }

  // Getters and Setters
  public boolean isAlarmOn() {
    return alarmOn;
  }

  public void setAlarmOn(boolean alarmOn) {
    this.alarmOn = alarmOn;
  }
}
