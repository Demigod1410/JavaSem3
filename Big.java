import java.util.Scanner;

class big
{
public static void main (String [] arg)
{ 
  Scanner sc = new Scanner (System.in);
  System.out.print("Please enter your first number: ");
  int a = sc.nextInt ();
  System.out.print("Please enter your secound number: ");
  int b = sc.nextInt ();
System.out.print("Please enter your third number: ");
  int c = sc.nextInt ();
 if ((a>b)&&(a>c))
    System.out.println ("the biggest number is: " + a);
 else if ((b>c)&&(b>a))
     System.out.println ("the biggest number is: " + b);
 else  
   System.out.println ("the biggest number is: " + c);
   }
  }
