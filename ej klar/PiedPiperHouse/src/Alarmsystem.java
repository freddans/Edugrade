import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Random;

public class Alarmsystem {
  private boolean alarmOn;
  private boolean smokeAlarmOn;

  public Alarmsystem() {
    this.alarmOn = false;
    this.smokeAlarmOn = false;
  }

  // Methods

  // sirens
  public void sirens() {
    sirenOne();
    sirenTwo();
  }
  public void sirenOne() {
    if (alarmOn || smokeAlarmOn) {
      System.out.println(getClass().getSimpleName() + " Siren #1: TUUUUUUUUUUT!");
      smokeAlarmOn = false;
    }
  }
  public void sirenTwo() {
    if (alarmOn || smokeAlarmOn) {
      System.out.println(getClass().getSimpleName() + " Siren #2: TUUUUUUUUUUT!");
      smokeAlarmOn = false;
    }
  }

  // Status of Alarm
  public String alarmStatus() {
    if (alarmOn) {
      return "On";
    } else {
      return "Off";
    }
  }

  // Getters and Setters
  public boolean isAlarmOn() {
    return alarmOn;
  }

  public void setAlarmOn(boolean alarmOn) {
    this.alarmOn = alarmOn;
    if (alarmOn) {
      System.out.println("Alarm has been turned on!");
    } else {
      System.out.println("Alarm has been turned off!");
    }
  }

  public boolean isSmokeAlarmOn() {
    return smokeAlarmOn;
  }

  public void setSmokeAlarmOn(boolean smokeAlarmOn) {
    this.smokeAlarmOn = smokeAlarmOn;
  }
}
