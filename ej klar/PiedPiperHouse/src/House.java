import org.w3c.dom.ls.LSOutput;

import java.util.Random;
import java.util.Scanner;

public class House {
  private String owner;
  private Garage garage;
  private Livingroom livingroom;
  private Kitchen kitchen;
  private Bedroom bedroom;
  private Bedroom bedroom1;
  private Bedroom bedroom2;
  private Bedroom bedroom3;
  private Bedroom bedroom4;
  private Bedroom bedroom5;
  private Hallway hallway;
  private Backyard backyard;
  private Alarmsystem alarmSystem;

  // Constructors
  public House() {
    this.owner = "Erlich Bachman";
    this.garage = new Garage();
    this.livingroom = new Livingroom();
    this.kitchen = new Kitchen();
    this.bedroom1 = new Bedroom("Erlich Bachman", 2, 1, true, false, true, true, true);
    this.bedroom2 = new Bedroom("Jian Yang", 1, 1, true, true, true, true, true);
    this.bedroom3 = new Bedroom("Richard Hendricks", 1, 1, true, false, true, true, true);
    this.bedroom4 = new Bedroom("Bertram Gilfoyle", 2, 1, true, false, true, true, true);
    this.bedroom5 = new Bedroom("Dinesh Chugtai", 1, 1, true, false, true, true, true);
    this.hallway = new Hallway();
    this.backyard = new Backyard();
    this.alarmSystem = new Alarmsystem();
  }

  public House(Garage garage, Livingroom livingroom, Kitchen kitchen, Bedroom bedroom, Hallway hallway, Backyard backyard, Alarmsystem alarmSystem) {
    this.owner = "Erlich Bachman";
    this.garage = garage;
    this.livingroom = livingroom;
    this.kitchen = kitchen;
    this.bedroom = bedroom;
    this.hallway = hallway;
    this.backyard = backyard;
    this.alarmSystem = alarmSystem;
  }

  // Methods

  // Turn on/off the Alarm
  public void alarmOn() {
    alarmSystem.setAlarmOn(true);
  }

  public void alarmOff() {
    alarmSystem.setAlarmOn(false);
  }

  // Break random window
  public void breakRandomWindow() {
    // 12st fönster. randomizer 1-12
    if (alarmSystem.isAlarmOn()) {
      Random random = new Random();
      int randomNr = random.nextInt(12) + 1; // Generate random number between 1-12.

      if (randomNr == 1) {
        garage.brokenWindow();
        alarmSystem.sirens();

      } else if (randomNr == 2) {
        System.out.println(livingroom.getClass().getSimpleName() + " -> Livingroom window by the workstation has been broken!");
        alarmSystem.sirens();

      } else if (randomNr == 3) {
        System.out.println(livingroom.getClass().getSimpleName() + " -> Livingroom window by the open space has been broken!");
        alarmSystem.sirens();

      } else if (randomNr == 4) {
        System.out.println(kitchen.getClass().getSimpleName() + " -> Kitchen window has been broken!");
        alarmSystem.sirens();

      } else if (randomNr == 5 || randomNr == 6) {
        bedroom1.brokenWindow();
        alarmSystem.sirens();

      } else if (randomNr == 7) {
        bedroom2.brokenWindow();
        alarmSystem.sirens();

      } else if (randomNr == 8) {
        bedroom3.brokenWindow();
        alarmSystem.sirens();

      } else if (randomNr == 9 || randomNr == 10) {
        bedroom4.brokenWindow();
        alarmSystem.sirens();

      } else if (randomNr == 11) {
        bedroom5.brokenWindow();
        alarmSystem.sirens();

      } else if (randomNr == 12) {
        System.out.println(hallway.getClass().getSimpleName() + " -> Window broken in the Hallway");
        alarmSystem.sirens();

      }
    } else {
      System.out.println("Alarm is off, you are not getting alerts.");
    }
  }

  public void openRandomWindow() {
    // 12st fönster. randomizer 1-12
    if (alarmSystem.isAlarmOn()) {
      Random random = new Random();
      int randomNr = random.nextInt(12) + 1; // Generate random number between 1-12.

      if (randomNr == 1) {
        garage.openedWndow();
        alarmSystem.sirens();

      } else if (randomNr == 2) {
        System.out.println(livingroom.getClass().getSimpleName() + " -> Window has been opened by the workspace!");
        livingroom.openedWndow();
        alarmSystem.sirens();

      } else if (randomNr == 3) {
        System.out.println(livingroom.getClass().getSimpleName() + " -> Window has been opened by the open space!");
        livingroom.openedWndow();
        alarmSystem.sirens();

      } else if (randomNr == 4) {
        System.out.println(kitchen.getClass().getSimpleName() + " -> Window has been opened!");
        kitchen.openedWndow();
        alarmSystem.sirens();

      } else if (randomNr == 5 || randomNr == 6) {
        bedroom1.openedWndow();
        alarmSystem.sirens();

      } else if (randomNr == 7) {
        bedroom2.openedWndow();
        alarmSystem.sirens();

      } else if (randomNr == 8) {
        bedroom3.openedWndow();
        alarmSystem.sirens();

      } else if (randomNr == 9 || randomNr == 10) {
        bedroom4.openedWndow();
        alarmSystem.sirens();

      } else if (randomNr == 11) {
        bedroom5.openedWndow();
        alarmSystem.sirens();

      } else if (randomNr == 12) {
        System.out.println(hallway.getClass().getSimpleName() + " -> Window has been opened!");
        hallway.openedWndow();
        alarmSystem.sirens();

      }
    } else {
      System.out.println("Alarm is off, you are not getting alerts.");
    }
  }

  public void openRandomDoor() {
    if (alarmSystem.isAlarmOn()) {
      // Random number generator
      Random random = new Random();
      int randomNr = random.nextInt(7) + 1;
      if (randomNr == 1) {
        garage.openedDoor();

      } else if (randomNr == 2) {
        livingroom.openedDoor();

      } else if (randomNr == 3) {
        bedroom1.openedDoor();

      } else if (randomNr == 4 && bedroom2.isHasSecretDocuments()) {
        System.out.println(bedroom2.getName() + "'s door is LOCKED. Door was tried to be opened.");
      } else if (randomNr == 4 && !bedroom2.isHasSecretDocuments()) {
        bedroom2.openedDoor();
        //alarmSystem.sirens(); - inaktiverar då det inte är larmat om  det inte finns hemliga dokument

      } else if (randomNr == 5) {
        bedroom3.openedDoor();

      } else if (randomNr == 6) {
        bedroom4.openedDoor();

      } else if (randomNr == 7) {
        bedroom5.openedDoor();

      }
    } else {
      System.out.println("Alarm is off, you are not getting alerts.");
    }
  }

  public void breakRandomDoor() {
    // if alarm is on AND secret documents are true
    if (bedroom2.isHasSecretDocuments() && alarmSystem.isAlarmOn()) {
      // random number generator
      Random random = new Random();
      int randomNumber = random.nextInt(3) + 1;
      if (randomNumber == 1) {
        hallway.brokenDoor();
        alarmSystem.sirens();

      } else if (randomNumber == 2) {
        garage.brokenDoor();
        alarmSystem.sirens();

      } else if (randomNumber == 3) {
        bedroom2.brokenDoor();
        alarmSystem.sirens();
      }
    }
    // if alarm is on and secret documents are false
    else if (alarmSystem.isAlarmOn()) {
      Random random = new Random();
      int randomNumber = random.nextInt(2) + 1;
      if (randomNumber == 1) {
        hallway.brokenDoor();
        alarmSystem.sirens();

      } else if (randomNumber == 2) {
        garage.brokenDoor();
        alarmSystem.sirens();
      }
    } else if (!alarmSystem.isAlarmOn()) {
      System.out.println("Alarm is off, you are not getting alerts.");
    }
  }

  // Test random motionsensor
  public void testRandomMotionSensor() {
    if (alarmSystem.isAlarmOn()) {
      Random random = new Random();
      int randomNr = random.nextInt(3) + 1; // Generate random number between 1-12.
      if (randomNr == 1) {
        System.out.println(livingroom.getName() + " -> Motionsensor picked up motion.");
        alarmSystem.sirens();

      } else if (randomNr == 2) {
        System.out.println(hallway.getName() + " -> Motionsensor picked up motion.");
        alarmSystem.sirens();

      } else if (randomNr == 3) {
        System.out.println(backyard.getName() + " -> Motionsensor picked up motion.");
        alarmSystem.sirens();
      }
    } else {
      System.out.println("Alarm is off, you are not getting alerts.");
    }
  }

  // Smokedetectors, number of rooms: 9
  public void startRandomFire() {
    Random random = new Random();
    int randomNr = random.nextInt(9) + 1;
    if (randomNr == 1) {
      System.out.println(garage.getClass().getSimpleName() + " -> Smokedetector picks up smoke.");
      alarmSystem.setSmokeAlarmOn(true);
      alarmSystem.sirens();
      garage.startSprinklerSystem();

    } else if (randomNr == 2) {
      System.out.println(livingroom.getClass().getSimpleName() + " -> Smokedetector picks up smoke.");
      alarmSystem.setSmokeAlarmOn(true);
      alarmSystem.sirens();
      livingroom.startSprinklerSystem();

    } else if (randomNr == 3) {
      System.out.println(kitchen.getClass().getSimpleName() + " -> Smokedetector picks up smoke.");
      alarmSystem.setSmokeAlarmOn(true);
      alarmSystem.sirens();
      kitchen.startSprinklerSystem();

    } else if (randomNr == 4) {
      System.out.println(bedroom1.getClass().getSimpleName() + " -> " + bedroom1.getName() + " Smokedetector picks up smoke.");
      alarmSystem.setSmokeAlarmOn(true);
      alarmSystem.sirens();
      bedroom1.startSprinklerSystem();

    } else if (randomNr == 5) {
      System.out.println(bedroom2.getClass().getSimpleName() + " -> " + bedroom2.getName() + " Smokedetector picks up smoke.");
      alarmSystem.setSmokeAlarmOn(true);
      alarmSystem.sirens();
      bedroom2.startSprinklerSystem();

    } else if (randomNr == 6) {
      System.out.println(bedroom3.getClass().getSimpleName() + " -> " + bedroom3.getName() + " Smokedetector picks up smoke.");
      alarmSystem.setSmokeAlarmOn(true);
      alarmSystem.sirens();
      bedroom3.startSprinklerSystem();

    } else if (randomNr == 7) {
      System.out.println(bedroom4.getClass().getSimpleName() + " -> " + bedroom4.getName() + " Smokedetector picks up smoke.");
      alarmSystem.setSmokeAlarmOn(true);
      alarmSystem.sirens();
      bedroom4.startSprinklerSystem();

    } else if (randomNr == 8) {
      System.out.println(bedroom5.getClass().getSimpleName() + " -> " + bedroom5.getName() + " Smokedetector picks up smoke.");
      alarmSystem.setSmokeAlarmOn(true);
      alarmSystem.sirens();
      bedroom5.startSprinklerSystem();

    } else if (randomNr == 9) {
      System.out.println(hallway.getClass().getSimpleName() + " -> Smokedetector picks up smoke.");
      alarmSystem.setSmokeAlarmOn(true);
      alarmSystem.sirens();
      hallway.startSprinklerSystem();
    }
  }

  public void randomIssue() {
    Random random = new Random();
    int randomNr = random.nextInt(4) + 1;
    if (randomNr == 1) {
      startRandomFire();
    } else if (randomNr == 2) {
      breakRandomDoor();
    } else if (randomNr == 3) {
      breakRandomWindow();
    } else if (randomNr == 4) {
      testRandomMotionSensor();
    }
  }

  // Menu
  public void menu() {
    Scanner sc = new Scanner(System.in);
    int input;

    do {
      System.out.println("Menu");
      System.out.println("1: Turn Alarm on/off. Alarm is currently: " + alarmSystem.alarmStatus());
      System.out.println("2: Simulate random issue (fire, break-in & motionsensors)");
      System.out.println("3: Start random fire");
      System.out.println("4: Break random door");
      System.out.println("5: Break random window");
      System.out.println("6: Set off random motionsensor");
      System.out.println("7: Open random door");
      System.out.println("8: Open random window");
      System.out.println("9: Add/Remove secret documents to bedroom2. Status: " + bedroom2.secretDocumentsStatus());
      System.out.println("10: Exit program");

      System.out.print("Input number: ");
      input = sc.nextInt();

      switch (input) {
        case 1:
          if (alarmSystem.isAlarmOn()) {
            alarmOff();
          } else {
            alarmOn();
          }
          break;
        case 2:
          randomIssue();
          break;
        case 3:
          startRandomFire();
          break;
        case 4:
          breakRandomDoor();
          break;
        case 5:
          breakRandomWindow();
          break;
        case 6:
          testRandomMotionSensor();
          break;
        case 7:
          openRandomDoor();
          break;
        case 8:
          openRandomWindow();
          break;
        case 9:
          if (bedroom2.isHasSecretDocuments()) {
            bedroom2.setHasSecretDocuments(false);
          } else {
            bedroom2.setHasSecretDocuments(true);
          }
          break;
        case 10:
          System.out.println("Exiting program.");
          break;
        default:
          System.out.println("Invalid input. Enter valid option 1-10.");
      }
    } while (input != 10);
  }

  // Setters and Getters
  public String getOwner() {
    return owner;
  }

  @Override
  public String toString() {
    return "House{" +
        "owner='" + owner + '\'' +
        ", garage=" + garage +
        ", livingroom=" + livingroom +
        ", kitchen=" + kitchen +
        ", bedroom=" + bedroom +
        ", bedroom1=" + bedroom1 +
        ", bedroom2=" + bedroom2 +
        ", bedroom3=" + bedroom3 +
        ", bedroom4=" + bedroom4 +
        ", bedroom5=" + bedroom5 +
        ", hallway=" + hallway +
        ", backyard=" + backyard +
        ", alarmSystem=" + alarmSystem +
        '}';
  }
}
