package programs;
import java.util.Scanner;

public class gcd {
    public static void main(String[] args) {
        
    
    Scanner sc = new Scanner(System.in);
    int a= sc.nextInt();
    int b=sc.nextInt();
    int hcf=1;
// System.out.println(a);
// System.out.println(b);
    for(int i=1;i<a;i++){
        if(a%i==0 && b%i==0){
            hcf=i;
        }
    }
    

System.out.print("the hcf is "+hcf);
}}
