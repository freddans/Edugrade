import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    // var
    int count = 0;
    String name;
    int age;
    double salary;
    int annualSalaryIncrease;
    double totalSalary = 0;

    // Scanner
    Scanner sc = new Scanner(System.in);

    // print to input in scanner on same line.
    System.out.print("Ange ditt namn: "); name = sc.nextLine();
    System.out.print("Ange din ålder: "); age = sc.nextInt();
    System.out.print("Ange din lön: "); salary = sc.nextDouble();

    System.out.println("-----------Sammanfattning-----------");

    System.out.println(name + ", " + age + " år.");
    System.out.println("Lön " + salary);

    System.out.print("Ange den årliga löneökningen: "); annualSalaryIncrease = sc.nextInt();

    // add salary into variable totalSalary.
    totalSalary += salary;

    while(totalSalary < 50_000) {
      count++; // count years
      age++; // count age
      totalSalary += annualSalaryIncrease; // add annualSalary
    }

    // once totalSalary is >= 50_000 output:
    System.out.println("Efter " + count + " år har " + name + " nått/passerat 50000 kr");
    System.out.println("Lönen ligger nu på " + totalSalary + " kr och " + name + " har nått en ålder av " + age + " år");
  }
}