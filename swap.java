import java.util.*;

class swap
{
public static void main (String[]arg)
{
Scanner sc= new Scanner(System.in);
System.out.print("please enter first number: ");
int a = sc.nextInt();
System.out.print("PLease enter second number: ");
int b = sc.nextInt();
a= a+b;
b= a-b;
a= a-b;
System.out.println ("a="+ a);
System.out.println ("b="+ b);
}

}