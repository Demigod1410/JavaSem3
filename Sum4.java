import java.util.Scanner;

class Sum4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the number: "); 

        int num = sc.nextInt();

        int sum = 0;
        while (num != 0) { 
               int digit = num % 10;
            sum += digit;
            num /= 10;
        }
        System.out.println("Sum of digits is: " + sum); 
        
        
    }
}