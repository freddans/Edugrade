import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;


public class CentralUnit {
  private static boolean alarmOn = true;
  private Siren sirens = new Siren();

  // Rooms
  private House house;

  // Constructor
  public CentralUnit() {
    this.house = new House();
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
      System.out.println("10. Reset alarms");
      System.out.println("11. Exit program");

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
          house.openRandomWindow();
          if (alarmOn) {
            WindowDetector wd = house.checkWindowDetector();
            if (wd != null) {
              System.out.println("CentralUnit:  " + wd.getName() + " -> is open");
            }
          } else {
            System.out.println("no alarm active");
          }
          break;
        case 3:
          house.breakRandomWindow();
          if (alarmOn) {
            WindowDetector wd = house.checkWindowDetector();
            if (wd != null) {
              System.out.println("CentralUnit:  " + wd.getName() + " -> is broken");
              sirens.triggerSirens();
            } else {
              System.out.println("no window detected");
            }
          } else {
            System.out.println("no alarm active");
          }
          break;
        case 4:
          house.openRandomDoor();
          if (alarmOn) {
            DoorDetector dd = house.checkDoorDetector();
            if (dd != null) {
              System.out.println("CentralUnit:  " + dd.getName() + " -> is open");
            }
          } else {
            System.out.println("no alarm active");
          }
          break;
        case 5:
          house.breakRandomDoor();
          if (alarmOn) {
            DoorAlarm da = house.checkDoorAlarm();
            if (da != null) {
              System.out.println("CentralUnit:  " + da.getName() + " -> is broken");
              sirens.triggerSirens();
            }
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
          SmokeDetector sd = house.checkSmokeDetector();
          if (sd != null) {
            System.out.println("CentralUnit:  " + sd.getName() + " -> smoke detected");
            sirens.triggerSirens();
            sd.sprinklerSystem();
          }
          break;
        case 8:
          house.triggerMotionDetector();
          if (alarmOn) {
            MotionDetector md = house.checkMotionDetector();
            if (md != null) {
              System.out.println(md.getName() + " -> motion detected");
            }
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
          house.resetAlarms();
          System.out.println("Alarm has been reset.");
          break;
        case 11:
          System.out.println("Exiting program");
          break;
        default:
          System.out.println("Invalid number. Input number between 1-10.");
      }
    } while (choice != 11);
  }

  // Getters and Setters
  public static boolean isAlarmOn() {
    return alarmOn;
  }
}
