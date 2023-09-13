public class Customer {
  private String name;
  private int age;
  boolean hasToothAche;

  public Customer() {
    // default values
    this("N/A", 0, false);
  }

  public Customer(String name, int age, boolean hasToothAche) {
    this.name = name;
    this.age = age;
    this.hasToothAche = hasToothAche;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public boolean isHasToothAche() {
    return hasToothAche;
  }

  public void setHasToothAche(boolean hasToothAche) {
    this.hasToothAche = hasToothAche;
  }
}
