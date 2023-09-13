import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Dentist {

  // var
  private String name;
  private String examYear;
  private boolean customerBoolean;
  private boolean isGentle;
  private String personalNumber;
  private int age;
  private int birthYear;
  private String yearPart;
  private List<Customer> customers = new ArrayList<>();


  public Dentist() {
    this("Not provided", "No history found", false, "Not provided");
  }

  public Dentist(String name, String examYear, boolean isGentle, String personalNumber) {
    this.name = name;
    this.examYear = examYear;
    this.isGentle = isGentle;
    this.personalNumber = personalNumber;
  }

  public void addCustomer(Customer givenName) {
    customers.add(givenName);
    System.out.println("Added new customer");
  }

  public int getNumberOfCustomers() {
    if (customerBoolean) {
      return customers.size();
    } else {
      return customers.size() * -1;
    }
  }

  public boolean getNumberOfCustomers(boolean customerBoolean) {
    return this.customerBoolean = customerBoolean;
  }

  public List<Customer> getCustomers() {
    return customers;
  }

  public void setCustomers(List<Customer> customers) {
    this.customers = customers;
  }

  public void displayInfo() {
    System.out.println("+++ Information +++");
    System.out.println("Name of Dentist: " + getName());
    System.out.println("Exam Year: " + getExamYear());
    //System.out.println("Dentist Personal number: " + getPersonalNumber());
    System.out.println("Is gentle: " + isDentistGentle());
    System.out.println("Age of Dentist: " + getAge() + " years old");
    System.out.println("--- Information ---");
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

  public String isDentistGentle() {
    if (isGentle) {
      return "Yes";
    } else {
      return "No";
    }
  }

  // automatically set age depending on inputed year
  public int getAge() {
    if (this.personalNumber.contains("Not provided")) {
      return 0;
    } else {
      // deletes the dash (-) before the last 4 digits to get correct amount of digits.
      String deleteDashPersonalNumber = this.personalNumber.replace("-", "");

      if (deleteDashPersonalNumber.length() == 12) { // if 12 digits
        yearPart = deleteDashPersonalNumber.substring(0, 4); // save the first 4
        this.birthYear = Integer.parseInt(yearPart); // parse first 4 from String to int

        this.age = (LocalDate.now().getYear() - this.birthYear); // current year - birthyear saved into age.
        return this.age; // return age
      }
      else {
        return 0;
      }
    }
  }

//  public String getPersonalNumber() {
//
//    if (this.personalNumber.contains("Not provided")) {
//      return "Not provided";
//    } else {
//      // instead of sending back the personalnumber we output message: "*CLASSIFIED*".
//      return "*CLASSIFIED*";
//    }
//  }

  public void setPersonalNumber(String personalNumber) {
    this.personalNumber = personalNumber;
  }
}
