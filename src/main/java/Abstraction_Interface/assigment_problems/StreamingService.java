import java.util.Scanner;
import java.time.LocalDate;

class Plan {

    public LocalDate calculateRenewalDate(LocalDate startDate) {
        return startDate;
    }
}

class Basic extends Plan {

    public LocalDate calculateRenewalDate(LocalDate startDate) {
        return startDate.plusDays(30);
    }
}

class Standard extends Plan {

    public LocalDate calculateRenewalDate(LocalDate startDate) {
        return startDate.plusDays(90);
    }
}

class Premium extends Plan {

    public LocalDate calculateRenewalDate(LocalDate startDate) {
        return startDate.plusDays(365);
    }
}

public class StreamingService {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {

            String type = sc.next();
            String name = sc.next();
            String date = sc.next();

            LocalDate startDate = LocalDate.parse(date);

            Plan plan;

            if (type.equals("BASIC")) {
                plan = new Basic();
            }
            else if (type.equals("STANDARD")) {
                plan = new Standard();
            }
            else {
                plan = new Premium();
            }

            LocalDate renewalDate = plan.calculateRenewalDate(startDate);

            System.out.println(name + ": " + renewalDate);
        }

        sc.close();
    }
}