import java.util.*;
public class ifelseif
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter your 'a' value:");
int a = sc.nextInt();
System.out.println("Enter your 'b' value:");
int b= sc.nextInt();
if(a>b)
   {
    System.out.println("a is greater than b");
    }
else if(a<b)
   {
    System.out.println("a is lesser than b");
   }
else
   {
    System.out.println("a is equal to b");
    }
sc.close();
}
}



