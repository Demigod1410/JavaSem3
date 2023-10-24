import java.util.Scanner;

class Marks3
{
public static void main (String [] arg)
{ 
  Scanner sc = new Scanner (System.in);
  System.out.print("Please enter your grades of the first subject: ");
  double a = sc.nextDouble ();
  System.out.print("Please enter your grades of the secound subject: ");
  double b = sc.nextDouble ();
  System.out.print("Please enter your grades of the third subject: ");
  double c = sc.nextDouble ();
  
  double d= a+b+c/3;
  
 if ((d<=100)&&(d>=85)) {
 System.out.println("Your grade is O");
 }
 else if ((d<=84)&&(d>=75){
 System.out.println("Your grade is A+");
}
else if ((d<=74)&&(d>=65)){
 System.out.println("Your grade is A");
 }
 else if ((d<=64)&&(d>=55)){
 System.out.println("Your grade is B+");
 }
else if ((d<=54)&&(d>=45)){
 System.out.println("Your grade is B");
 }
 else if ((d<=44)&&(d>=40)){
 System.out.println("Your grade is C+");
 }
 else if ((d<=39)&&(d>=35)){
 System.out.println("Your grade is C");
 }
  else (d<35){
 System.out.println("Your grade is Fail");
 }
    } 
      }
         }


