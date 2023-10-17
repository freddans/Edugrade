package alarmsystem;

import java.util.Random;
import java.util.Scanner;

public class Menu {
  private CentralUnit centralUnit;
  private boolean alarmOn;

  // Constructor
  public Menu() {
    this.centralUnit = new CentralUnit();
  }

  public void start() {
    Scanner sc = new Scanner(System.in);
    int choice;

    do {
      System.out.println("Alarmsystem Menu");
      System.out.println("1. Toggle Alarm on/off. Alarmstatus: " + isAlarmOn());
      System.out.println("2. Open random window");
      System.out.println("3. Break random window");
      System.out.println("4. Open random door");
      System.out.println("5. Break random door");
      System.out.println("6. Trigger random smoke detector");
      System.out.println("7. Trigger random motion detector");
      System.out.println("8. Trigger random disaster");
      System.out.println("9. Reset Alarms");
      System.out.println("10. Secret Documents on/off. Status: " + centralUnit.getDetectorList().get(4).isSecretDocuments());
      System.out.println("11. Exit program");

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
          centralUnit.openRandomWindow();
          if (alarmOn) {
            centralUnit.checkWindowDetector();
          } else {
            System.out.println("Alarm is off");
          }
          break;
        case 3:
          centralUnit.breakRandomWindow();
          if (alarmOn) {
            centralUnit.checkWindowDetector();
          } else {
            System.out.println("Alarm is off");
          }
          break;
        case 4:
          centralUnit.openRandomDoor();
          if (alarmOn) {
            centralUnit.checkDoorDetector();
          } else {
            System.out.println("Alarm is off");
          }
          break;
        case 5:
          centralUnit.breakRandomDoor();
          if (alarmOn) {
            centralUnit.checkDoorAlarm();
          } else {
            System.out.println("Alarm is off");
          }
          break;
        case 6:
          centralUnit.triggerRandomSmokeDetector();
          centralUnit.checkSmokeDetector();
          break;
        case 7:
          centralUnit.triggerRandomMotionDetector();
          if (alarmOn) {
            centralUnit.checkMotionDetector();
          } else {
            System.out.println("Alarm is off");
          }
          break;
        case 8:
          if (alarmOn) {
            Random random = new Random();
            int randomNr = random.nextInt(4) + 1;

            if (randomNr == 1) {
              centralUnit.breakRandomWindow();
              if (alarmOn) {
                centralUnit.checkWindowDetector();
              }
            } else if (randomNr == 2) {
              centralUnit.breakRandomDoor();
              if (alarmOn) {
                centralUnit.checkDoorAlarm();
              }
            } else if (randomNr == 3) {
              centralUnit.triggerRandomSmokeDetector();
              centralUnit.checkSmokeDetector();
            } else {
              centralUnit.triggerBackYardMotionDetector();
              if (alarmOn) {
                centralUnit.checkBackYardMotionDetector();
              }
            }
          }
          break;
        case 9:
          centralUnit.resetAlarms();
          break;
        case 10:
          centralUnit.toggleSecretDocuments();
          break;
        case 11:
          System.out.println("Exiting program");
          break;
        default:
          System.out.println("Input 1-11");
      }
    } while (choice != 11);
  }

  // Getters and Setters
  public boolean isAlarmOn() {
    return alarmOn;
  }
}
