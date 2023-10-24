import java.util.Scanner;

public class Train {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalSeats = 8;
        int seat = sc.nextInt();
        int compartment = (seat - 1) / totalSeats + 1;
        System.out.println("Your compartment is = " + compartment);
        if (seat > 8) {
            int seatInCompartment = (seat - 1) % 8 + 1;
            switch (seatInCompartment) {
                case 1:
                    System.out.println("Lower");
                    break;
                case 2:
                    System.out.println("Middle");
                    break;
                case 3:
                    System.out.println("Upper");
                    break;
                case 4:
                    System.out.println("Lower");
                    break;
                case 5:
                    System.out.println("Middle");
                    break;
                case 6:
                    System.out.println("Upper");
                    break;
                case 7:
                    System.out.println("Side Lower");
                    break;
                case 8:
                    System.out.println("Side Upper");
                    break;
                default:
                    System.out.println("Enter a valid input");
            }
        }
    }
}
