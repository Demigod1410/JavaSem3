import java.util.Scanner;

class Prime4 {
    public static void main(String[] args) {
        int i, m = 0, flag = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter your number: ");
        int a = sc.nextInt();
        m = a / 2; 
        if (a == 0 || a == 1) {
            System.out.println(a + " is not a prime number");  
        } else {
            for (i = 2; i <= m; i++) {
                if (a % i == 0) {
                    System.out.println(a + " is not a prime number");  
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                System.out.println(a + " is a prime number");  
            }
        }
    }
}
