package programs;
import java.util.*;
public class arraysum {
public static void main(String[] args) {
    Scanner cvb = new Scanner(System.in);
    int n=cvb.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
        arr[i]=cvb.nextInt();
    }
    for(int i=0;i<n;i++){
        System.out.print(arr[i]+" ");
    }
    int sum=0;
    for(int i=0;i<n;i++){
        sum+=arr[i];
    }
    System.out.println("\nThe sum is : "+sum);
}
    
}
