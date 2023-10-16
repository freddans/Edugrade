package alarmsystem;

import alarmsystem.detectors.parts.*;

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
            WindowDetector wd = centralUnit.checkWindowDetector();
            if (wd != null) {
              wd.notification();
            }
          } else {
            System.out.println("Alarm is off");
          }
          break;
        case 3:
          centralUnit.breakRandomWindow();
          if (alarmOn) {
            WindowDetector wd = centralUnit.checkWindowDetector();
            if (wd != null) {
              wd.broken();

            }
          } else {
            System.out.println("Alarm is off");
          }
          break;
        case 4:
          centralUnit.openRandomDoor();
          if (alarmOn) {
            DoorDetector dd = centralUnit.checkDoorDetector();
            if (dd != null) {
              dd.notification();
            }
          } else {
            System.out.println("Alarm is off");
          }
          break;
        case 5:
          centralUnit.breakRandomDoor();
          if (alarmOn) {
            DoorAlarm da = centralUnit.checkDoorAlarm();
            if (da != null) {
              da.notification();
            }
          } else {
            System.out.println("Alarm is off");
          }
          break;
        case 6:
          centralUnit.triggerRandomSmokeDetector();
          SmokeDetector sd = centralUnit.checkSmokeDetector();
          if (sd != null) {
            sd.notification();
          }
          break;
        case 7:
          centralUnit.triggerRandomMotionDetector();
          if (alarmOn) {
            MotionDetector md = centralUnit.checkMotionDetector();
            if (md != null) {
              md.notification();
            }
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
                WindowDetector wd = centralUnit.checkWindowDetector();
                if (wd != null) {
                  wd.broken();
                }
              }
            } else if (randomNr == 2) {
              centralUnit.breakRandomDoor();
              if (alarmOn) {
                DoorAlarm da = centralUnit.checkDoorAlarm();
                if (da != null) {
                  da.notification();
                }
              }
            } else if (randomNr == 3) {
              centralUnit.triggerRandomSmokeDetector();
              SmokeDetector sd2 = centralUnit.checkSmokeDetector();
              if (sd2 != null) {
                sd2.notification();
              }
            } else {
              centralUnit.triggerBackYardMotionDetector();
              if (centralUnit.checkBackYardMotionDetector()) {
                centralUnit.detectorList.get(9).getMotionDetectorList().get(0).notification();

              }
            }
          }
          break;
        case 9:
          centralUnit.resetAlarms();
          break;
        case 10:
          if (centralUnit.getDetectorList().get(4).isSecretDocuments()) {
            centralUnit.getDetectorList().get(4).setSecretDocuments(false);
            centralUnit.getDetectorList().get(4).removeDoorAlarm("Jian Yangs Door");
          } else {
            centralUnit.getDetectorList().get(4).setSecretDocuments(true);
            centralUnit.getDetectorList().get(4).addDoorAlarm("Jian Yangs Door");
          }
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
