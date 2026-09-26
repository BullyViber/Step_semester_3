import java.util.Scanner;

class Vehicle {

    public double calculateCharge(int hours) {
        return 0;
    }
}

class Bike extends Vehicle {

    public double calculateCharge(int hours) {
        return hours * 10;
    }
}

class Car extends Vehicle {

    public double calculateCharge(int hours) {
        if (hours == 1) {
            return 30;
        }

        return 30 + (hours - 1) * 20;
    }
}

class Truck extends Vehicle {

    public double calculateCharge(int hours) {
        double charge = hours * 50;

        if (charge < 100) {
            charge = 100;
        }

        return charge;
    }
}

public class CampusParking {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        double total = 0;

        for (int i = 0; i < N; i++) {

            String type = sc.next();
            int hours = sc.nextInt();

            Vehicle vehicle;

            if (type.equals("BIKE")) {
                vehicle = new Bike();
            }
            else if (type.equals("CAR")) {
                vehicle = new Car();
            }
            else {
                vehicle = new Truck();
            }

            double charge = vehicle.calculateCharge(hours);

            System.out.println(type + ": " + String.format("%.2f", charge));

            total = total + charge;
        }

        System.out.println("Total: " + String.format("%.2f", total));

        sc.close();
    }
}