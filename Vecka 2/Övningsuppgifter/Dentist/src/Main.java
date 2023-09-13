

public class Main {
  public static void main(String[] args) {
    // Create object
    Dentist theDentist = new Dentist();

    // output empty dentist object with default values
    theDentist.displayInfo();
    System.out.println();

    // setting info on empty constructor
    theDentist.setName("Anders");
    theDentist.setExamYear("1981");
    theDentist.setPersonalNumber("19490503-4321");
    theDentist.setGentle(true);

    // output empty object with added info
    theDentist.displayInfo();
    System.out.println();

    // Create object with "full constructor"
    Dentist dennis = new Dentist("Dennis", "1998", true, "19690304-1234");

    // output full constructor
    dennis.displayInfo();

    System.out.println();

    // Create object Customer
    Customer customer1 = new Customer("Niklas", 5, false);
    Customer customer2 = new Customer("Rasmus", 8, true);
    Customer customer3 = new Customer("Arnold", 20, true);

    // Add customers to list
    dennis.getCustomers().add(customer1);
    dennis.getCustomers().add(customer2);
    dennis.addCustomer(customer3);

    // Output list
    for (int i = 0; i < dennis.getCustomers().size(); i++) {
      System.out.println(dennis.getCustomers().get(i).getName());
    }

    System.out.println();

    // Output numbers of customers positively
    dennis.getNumberOfCustomers(true);
    System.out.println(dennis.getNumberOfCustomers());

    System.out.println();

    // Output numbers of customers negative
    dennis.getNumberOfCustomers(false);
    System.out.println(dennis.getNumberOfCustomers());




  }
}