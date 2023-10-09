public class Main {
  public static void main(String[] args) {
    // object
    House house = new House();
    CentralUnit centralUnit = new CentralUnit(house);

    centralUnit.menu();
  }
}