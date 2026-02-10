import java.util.*;
class slidingwindow {
public static void main(String[] args){
Scanner sc=new Scanner(System.in);

System.out.println("enter the size of the array");
int n=sc.nextInt();
int[] nums=new int[n];

System.out.println("enter the elements of array");
for(int i=0;i<n;i++){
nums[i]=sc.nextInt();
}

System.out.println("enter window size");
int k=sc.nextInt();
int[] result=new int[n-k+1];

for(int i=0;i<=n-k;i++){
int max=nums[i];
for(int j=i+1;j<i+k;j++){
if(nums[j]>max){
max=nums[j];
}
}
result[i]=max;
}

System.out.println("The final result is :");
for(int i=0;i<result.length;i++){
  System.out.println(result[i] + " ");
}
}
}	