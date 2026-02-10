import java.io.*;
import java.util.*;
public class OddEvencount1A
{
public static void main(String[] args)
{
  int even=0,odd=0;
scanner sc = new scanner(system.in);
ystem.out.println("Enter 5 numbers");
for(int i=0;i<5;i++){
num = sc.nextInt();
if(num %2==0)
  even++;
else
   odd++;
 }

System.out.println("even numbers="+even);  
System.out.println("odd numbers="+odd);  
}
}      