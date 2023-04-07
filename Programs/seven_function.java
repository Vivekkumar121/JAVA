import java.util.*;

import javax.sound.sampled.SourceDataLine;
public class seven_function{
    public static void printMyName(String name){                        //print number
        System.out.println("mera name hai : "+name+" maje hia bhai mere to");
    return;
    }
   
    public static int addNumbers(int a, int b){                          //addTwoNumbers
        int c=a+b;
        int d=a*b;
        // System.out.print(a);
        return d;
    }
    public static void factorial(int a){                     //factorial of a number
        int q=1;
        int k;
        if(a<0){
            System.out.println("Invalid Number");
            return;
        }
        for(int i=1;i<=a;i++){
            q=i*q;
        }
        System.out.println(q);
        return;
    }
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int a = sc.nextInt();
        int b = sc.nextInt();
        printMyName(name);
        int e = addNumbers(a,b);
        System.out.println("the sum is : "+e);
        factorial(a);
    }
}

