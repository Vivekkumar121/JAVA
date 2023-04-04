import java.util.Scanner;

public class factorial {
    public static int multi(int a){
        int z=1;
        for(int i=1;i<=a;i++){
            z*=i;
        }
        return z;
    }
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the number to get the Factorial : ");
        // int a=sc.nextInt();
        // int x=multi(a);
        // System.out.println("the product is "+x);
        System.out.println(multi(6));
    }
}
