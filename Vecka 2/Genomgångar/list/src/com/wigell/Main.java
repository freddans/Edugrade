package com.wigell;

public class Main {
  public static void main(String[] args) {
    //create object
    Person person = new Person(); // empty constructor
    person.setName("Fredrik"); // set name

    // create multiple objects ( 5 different cats )
    Cat cat = new Cat("Tyra", "Black-Brown", 4);
    Cat cat1 = new Cat("Tiger", "Grey", 2);
    Cat cat2 = new Cat("Tiffany", "Black-Grey", 2);
    Cat cat3 = new Cat("Jens", "Black", 5);
    Cat cat4 = new Cat("Jerry", "Cream", 1);

    // adding cats into list in Person-class
    /*person.cats.add(cat);
    person.cats.add(cat1);
    person.cats.add(null);
    person.cats.add(cat3);
    person.cats.add(cat4);*/

    // adding cats into list in person-class but in specific index
    person.cats.add(cat);
    person.cats.add(0, cat4); // tvingar in cat4 på index 0
    person.cats.add(cat1); // index 2
    person.cats.add(cat2); // index 3
    person.cats.add(cat3); // idnex 4


    // loop through list
    for (int i = 0; i < person.cats.size(); i++) {
      System.out.println(person.cats.get(i).getName() + ", " + person.cats.get(i).getAge());
    }
  }
}