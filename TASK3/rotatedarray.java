import java.util.*;
public class rotatedarray{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("enter the size of the array");
int n=sc.nextInt();
System.out.println("Enter the elements of the array");
int[] arr=new int[n];
for(int i=0;i<n;i++){
arr[i]=sc.nextInt();
}
int k;
System.out.println("enter the positions to rotate");
k=sc.nextInt();
int[] rarr=new int[n];
for(int i=0;i<n;i++){
rarr[(i+k)%n]=arr[i];
}
int maxdiff=0;
for(int i=0;i<n-1;i++){
int diff=Math.abs(rarr[i]-rarr[i+1]);
maxdiff= (diff>maxdiff?diff:maxdiff);
}

System.out.println("Maximum absolute difference is:"+maxdiff);
}
}

