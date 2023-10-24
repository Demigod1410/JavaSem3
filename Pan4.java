import java.util.Scanner;

class Pan4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter your number: ");
        int a = sc.nextInt();
        int remainder;
        int reverse = 0;
        int og_num = a;
        
        while (a > 0) {
            remainder = a % 10;
            reverse = reverse * 10 + remainder;
            a /= 10;
        }

        if (og_num == reverse) { 
         System.out.println("This is a palindrome.");
        } else {
            System.out.println("This is not a palindrome.");
        }
        
        
    }
}
