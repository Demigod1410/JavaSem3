import java.util.Scanner;

class Comb4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter your first number: ");
        int a = sc.nextInt();
        System.out.print("Please enter your second number: "); 
        int b = sc.nextInt();
        System.out.print("Please enter your third number: ");
        int c = sc.nextInt();
        System.out.println("All possible combinations of the digits are:");

        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                for (int k = 1; k <= 3; k++) {
                    System.out.println(a * i + "" + b * j + "" + c * k);
                }
            }
        }