import java.util.Scanner;

class Root3
{
  public static void main (String [] arg)
  {
   Scanner sc = new Scanner (System.in) {
    System.out.print("Please enter your first number: ");
  float a = sc.nextFloat();
  System.out.print("Please enter your secound number: ");
  float b = sc.nextFloat ();
System.out.print("Please enter your third number: ");
  float c = sc.nextFloat ();

float d= (b*b)-(4*a*c);
   if (d<0){
   System.out.println("No real roots");
   }
   else if (d==0){
   float root= -b/(2*a);
   System.out.println ("One real root:" + root);
   }
   else{
   float r1= (-b + Math.sqrt(d)) / (2*a);
   float r2 = (-b - Math.sqrt(d)) / (2*a);
   System.out.print ("Two real roots: " +r1+r2);
               }
           }
      }
   
