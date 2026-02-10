import java.io.*;
import java.util.*;
 publuc class prime1C
{
public static void main(string[] args)
{
   int num, flag=1;
scanner sc = new Scanner(System.in);
num=sc.nextInt();
   for(int i=2;i<=num-1;i++)
{
   if(num%i==0)
   flag=0;
}
if(flag==0)
System.out.println("Not Prime");
else
system.out.println("Prime");
}
}             