import java.util.Scanner;

class Months {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();

        switch (m) {
            case 1:
                System.out.print("Jan");
                break;

            case 2:
                System.out.print("Feb");
                break;

            case 3:
                System.out.print("Mar");
                break;

            case 4:
                System.out.print("Apr");
                break;

            case 5:
                System.out.print("May");
                break;

            case 6:
                System.out.print("Jun");
                break;

            case 7:
                System.out.print("Jul");
                break;

            case 8:
                System.out.print("Aug");
                break;

            case 9:
                System.out.print("Sept");
                break;

            case 10:
                System.out.print("Oct");
                break;

            case 11:
                System.out.print("Nov");
                break;

            case 12:
                System.out.print("Dec");
                break;

            default:
                System.out.print("Enter a proper number");
        }
    }
}


   