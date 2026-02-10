import java.io.*;
import java.util.*;
public class Factorial1D
{
        public static void main(String args[])
        {
System.out.println("Enter a number:");
         Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();


          int fact = 1;
         for(int i=2; i<=n; i++) 
             fact = fact*i;
          System.out.println("Factorial of "+n+"is:"+fact);
           }
}