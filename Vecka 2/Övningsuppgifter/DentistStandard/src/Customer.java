public class Customer {
  private String name;
  private int age;
  private boolean hasToothAche;

  public Customer() {
  }

  public Customer(String name, int age, boolean hasToothAche) {
    this.name = name;
    this.age = age;
    this.hasToothAche = hasToothAche;
  }

  // Methods
  /*Reserved for methods*/

  // Setters and Getters
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

  @Override
  public String toString() {
    return "Customer{" +
        "name='" + name + '\'' +
        ", age=" + age +
        ", hasToothAche=" + hasToothAche +
        '}';
  }
}
