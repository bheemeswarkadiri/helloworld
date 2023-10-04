import java.util.*;
public class HCF{
public static void main(String args[]){
Scanner hr = new Scanner(System.in);
System.out.println("Enter n1 and n2 :");
int num1=hr.nextInt();
int num2=hr.nextInt();
int hcf;
while(num1!=num2)
{
  if(num1>num2)
    {
      num1-=num2;
    }
  else
   {
      num2=num2-num1;
   }
}
System.out.println("The HCF is:"+num1);
hr.close();
}
}