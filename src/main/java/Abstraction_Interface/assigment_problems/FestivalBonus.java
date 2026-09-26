import java.util.Scanner;

class Employee {

    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public double calculateBonus() {
        return 0;
    }
}

class FullTime extends Employee {

    FullTime(String name, double salary) {
        super(name, salary);
    }

    public double calculateBonus() {
        return salary * 0.10;
    }
}

class PartTime extends Employee {

    PartTime(String name, double salary) {
        super(name, salary);
    }

    public double calculateBonus() {
        return salary * 0.05;
    }
}

class Intern extends Employee {

    Intern(String name, double salary) {
        super(name, salary);
    }

    public double calculateBonus() {
        return 2000;
    }
}

public class FestivalBonus {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        double total = 0;

        for (int i = 0; i < N; i++) {

            String type = sc.next();
            String name = sc.next();
            double salary = sc.nextDouble();

            Employee employee;

            if (type.equals("FULLTIME")) {
                employee = new FullTime(name, salary);
            }
            else if (type.equals("PARTTIME")) {
                employee = new PartTime(name, salary);
            }
            else {
                employee = new Intern(name, salary);
            }

            double bonus = employee.calculateBonus();

            System.out.println(name + ": " + String.format("%.2f", bonus));

            total = total + bonus;
        }

        System.out.println("Total Bonus: " + String.format("%.2f", total));

        sc.close();
    }
}