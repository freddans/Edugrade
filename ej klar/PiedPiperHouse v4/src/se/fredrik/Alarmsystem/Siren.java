package se.fredrik.Alarmsystem;

public class Siren extends Detector {


  public void information() {
    if (isSmoke()) {
      startSiren();
      startSiren();
    } else if ( (isAlarm() && isDoorBroken() || (isAlarm() && isWindowBroken()) )) {
      startSiren();
      startSiren();
    }
  }

  public void startSiren() {
    System.out.println("TJUUUUUUUT!");
  }
}
