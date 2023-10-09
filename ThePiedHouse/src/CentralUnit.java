import java.util.Random;
import java.util.Scanner;

public class CentralUnit {
  private boolean alarmOn = true;
  private WindowDetector windowDetector;
  private Siren siren;

  // Rooms
  private House house;

  // Constructor
  public CentralUnit(House house) {
    this.house = house;
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
            this.alarmOn = false;
          } else {
            this.alarmOn = true;
          }
          break;
        case 2:
          if (alarmOn) {
            house.openRandomWindow();
          } else {
            System.out.println("no alarm active");
          }
          break;
        case 3:
          if (alarmOn) {
            house.breakRandomWindow();
          } else {
            System.out.println("no alarm active");
          }
          break;
        case 4:
          if (alarmOn) {
            house.openRandomDoor();
          } else {
            System.out.println("no alarm active");
          }
          break;
        case 5:
          if (alarmOn) {
            house.breakRandomDoor();
          } else {
            System.out.println("no alarm active");
          }
          break;
        case 6:
          if (house.getRoomList().get(4).isSecretDocuments()) {
            house.getRoomList().get(4).setSecretDocuments(false);
            house.getRoomList().get(4).removeDoorAlarm("Jian Yangs Door");
          } else {
            house.getRoomList().get(4).setSecretDocuments(true);
            house.getRoomList().get(4).addDoorAlarm("Jian Yangs Door");
          }
          break;
        case 7:
          house.triggerSmokeDetector();
          break;
        case 8:
          if (alarmOn) {
            house.triggerMotionDetector();
          } else {
            System.out.println("no alarm active");
          }
          break;
        case 9:
          Random random = new Random();
          int randomNr = random.nextInt(4) + 1;
          if (alarmOn) {
            if (randomNr == 1) {
              house.breakRandomWindow();
            } else if (randomNr == 2) {
              house.breakRandomDoor();
            } else if (randomNr == 3) {
              house.triggerSmokeDetector();
            } else if (randomNr == 4) {
              house.triggerMotionBackyard();
            }
          } else {
            house.triggerSmokeDetector();
          }
          break;
        case 10:
          for (Room room : house.getRoomList()) {
            for (int i = 0; i < room.getDooralarmList().size(); i++) {
              System.out.println(room.getDooralarmList().get(i).getName());
            }
          }
        case 12:
          System.out.println("Exiting program");
          break;
        default:
          System.out.println("Invalid number. Input number between 1-10 & 12.");
      }
    } while (choice != 12);
  }

  // Getters and Setters
  public boolean isAlarmOn() {
    return alarmOn;
  }

  public void setAlarmOn(boolean alarmOn) {
    this.alarmOn = alarmOn;
  }
}
