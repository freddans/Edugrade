public class Main {
  public static void main(String[] args) {
    // Create Dentist object
    Dentist dentist1 = new Dentist("Anders Andersson", "1995", true, "19550201-1234");
    Dentist dentist2 = new Dentist();

    System.out.println("Output of Dentists");
    System.out.println(dentist1);
    System.out.println(dentist2);

    // giving values to dentist2
    dentist2.setName("Hans Hansson");
    dentist2.setExamYear("1990");
    dentist2.setGentle(false);
    dentist2.setPersonalNumber("19010203-1234");
    System.out.println(); // radbrytning

    // print both dentists again
    System.out.println("Output of Dentists again");
    System.out.println(dentist1);
    System.out.println(dentist2);

    System.out.println(); // radbrytning

    // Create Customer object
    Customer customer1 = new Customer("Anton Antonsson", 28, false);
    Customer customer2 = new Customer();

    System.out.println("Output of Customers");
    System.out.println(customer1);
    System.out.println(customer2);
    System.out.println(); // radbrytning

    // Give customer 2 a name, age and hasToothAche
    customer2.setName("Jan Jansson");
    customer2.setAge(52);
    customer2.setHasToothAche(true);

    System.out.println("Output of Customers again");
    System.out.println(customer1);
    System.out.println(customer2); // check values
    System.out.println(); // radbrytning

    // Add customers into dentist1's list
    dentist1.getCustomerList().add(customer1);
    dentist1.getCustomerList().add(customer2);

    // loop through dentist1's list and print names.
    System.out.println("Customerlist of " + dentist1.getName() + ":");
    for (int i = 0; i < dentist1.getCustomerList().size(); i++) {
      System.out.println(dentist1.getCustomerList().get(i).getName());
    }

    System.out.println(); // radbrytning

    // Create a third customer and add to list through new method in Dentist class.
    Customer customer3 = new Customer("Karl Karlsson", 25, false); // Creating object
    dentist1.customerAdd(customer3);

    // Running forloop again to see if Karl Karlsson appears
    System.out.println("Customerlist of " + dentist1.getName() + ":");
    for (int i = 0; i < dentist1.getCustomerList().size(); i++) {
      System.out.println((i+1) + ": " + dentist1.getCustomerList().get(i).getName());
    }
    System.out.println(); // radbrytning

    // Skriv ut hur många som finns i dentist1's lista
    System.out.println("Antal kunder: "+ dentist1.customerList.size());
    System.out.println(); // radbrytning

    System.out.println("getNumberOfCustomers set to true");
    dentist1.getNumbersOfCustomers(true); // expect negative respond
    System.out.println("Antal kunder: "+ dentist1.getNumbersOfCustomers());
    System.out.println(); // radbrytning

    System.out.println("getNumbersOfCustomers set to false");
    dentist1.getNumbersOfCustomers(false); // expect postive respond
    System.out.println("Antal kunder: "+ dentist1.getNumbersOfCustomers());
  }
}