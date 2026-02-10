import java.util.*;
public class adjustedsum{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("enter the size of the array");
int n=sc.nextInt();
System.out.println("Enter the elements of the array");
int[] adsum=new int[n];
int sum=0;
for(int i=0;i<n;i++){
adsum[i]=sc.nextInt();

}
for(int i=0;i<n;i++){
if(adsum[i]%2==0){
sum=sum+adsum[i];
}
else{
sum=sum-adsum[i];
}
}

System.out.println("The final adjusted sum is :"+sum);
}
} 

