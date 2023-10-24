import java.util.Scanner;
class Vote1
{
public static void main (String [] arg) 
{
Scanner sc = new Scanner (System.in);
System.out.print ("Please enter your age: ");
       int a = sc.nextInt ();
if (a >= 18)
   System.out.println("You are allowed to vote");
   else if (a < 18)
    System.out.println("You aren't allowed to vote");
    }
   }
         
