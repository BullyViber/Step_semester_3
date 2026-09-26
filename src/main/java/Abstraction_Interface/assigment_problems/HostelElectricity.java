import java.util.Scanner;

class Room {

    public double calculateBill(int units) {
        return 0;
    }
}

class SingleRoom extends Room {

    public double calculateBill(int units) {
        return units * 8;
    }
}

class SharedRoom extends Room {

    int occupants;

    SharedRoom(int occupants) {
        this.occupants = occupants;
    }

    public double calculateBill(int units) {
        return (units * 6) / occupants;
    }
}

class ACRoom extends Room {

    public double calculateBill(int units) {
        return (units * 10) + 200;
    }
}

public class HostelElectricity {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        double total = 0;

        for (int i = 0; i < N; i++) {

            String type = sc.next();
            int units = sc.nextInt();

            Room room;

            if (type.equals("SINGLE")) {
                room = new SingleRoom();
            }
            else if (type.equals("SHARED")) {
                int occupants = sc.nextInt();
                room = new SharedRoom(occupants);
            }
            else {
                room = new ACRoom();
            }

            double bill = room.calculateBill(units);

            System.out.println(type + ": " + String.format("%.2f", bill));

            total = total + bill;
        }

        System.out.println("Total: " + String.format("%.2f", total));

        sc.close();
    }
}