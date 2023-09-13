import java.util.ArrayList;
import java.util.List;

public class Dentist {
  private String name;
  private String examYear;
  private boolean isGentle;
  private String personalNumber;
  private boolean positiveOrNegative;

  // List
  List<Customer> customerList = new ArrayList<>();

  // Constructors
  public Dentist() {
  }

  public Dentist(String name, String examYear, boolean isGentle, String personalNumber) {
    this.name = name;
    this.examYear = examYear;
    this.isGentle = isGentle;
    this.personalNumber = personalNumber;
  }

  // Methods
  public void customerAdd(Customer variableName) {
    customerList.add(variableName);
    System.out.println("*Added new customer*");
  }

  public boolean getNumbersOfCustomers(boolean positiveOrNegative) {
    this.positiveOrNegative = positiveOrNegative;
    return this.positiveOrNegative;
  }

  public int getNumbersOfCustomers() {
    if (this.positiveOrNegative) {
      return (customerList.size() * -1);
    } else {
      return customerList.size();
    }
  }

  // Setters and Getters
  public List<Customer> getCustomerList() {
    return customerList;
  }

  public void setCustomerList(List<Customer> customerList) {
    this.customerList = customerList;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getExamYear() {
    return examYear;
  }

  public void setExamYear(String examYear) {
    this.examYear = examYear;
  }

  public boolean isGentle() {
    return isGentle;
  }

  public void setGentle(boolean gentle) {
    isGentle = gentle;
  }

  public void setPersonalNumber(String personalNumber) {
    this.personalNumber = personalNumber;
  }

  @Override
  public String toString() {
    return "Dentist{" +
        "name='" + name + '\'' +
        ", examYear='" + examYear + '\'' +
        ", isGentle=" + isGentle +
        '}';
  }
}
