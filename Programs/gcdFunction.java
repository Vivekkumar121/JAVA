package programs;
import java.util.*;
public class gcdFunction {

    public static void main(String[] args) {
        // int a;
        // int b;
        // int c;
        function();
    }
    public static void function(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values of a,b, and c : ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if(a>b && a>c){
            System.out.println("A is greater than all");
        }
        else if (b>a && b>c){
            System.out.println("B is greater of them all");
        }
        else {
            System.out.println("C is greater");
        }
    }
}

