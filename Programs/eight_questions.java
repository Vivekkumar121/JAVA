import java.util.Scanner;

public class eight_questions {
    public static void average(int a, int b, int c){                       //average of three numbers
        int d=(a+b+c)/3;
        System.out.println(d);
        return;
    }                                   
    public static void sumOfOdd(int a){                                  //sum of odd number 
        int sum=0;
        for(int i=0;i<=a;i++){
            if(i%2!=0){
                sum+=i;
            }
        }
        System.out.println("the sum of odd numbers is "+sum);
        return;
    }
    public static void greater(int a, int b){                               // greaterr of two number
        if(a>b){
            System.out.println(a);
            return;
        }
        else System.out.println(b);
        return;
    }
    public static int circumference(int a){
        int c=2*a;
        c*=22;
        c/=7;
        // System.out.println(c);
        return c;
    }
    public static void vote(int a){
        if(a>18){
            System.out.println("eligible to vote");
            return;
        }
        else System.out.println("Not eligible to vote");
        return;
    }


public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int [] v = {10,+23,-12};
    System.out.print("the average is : ");
    average(a,b,c);
    sumOfOdd(a);System.out.print("greater among a and b is : ");
    greater(a,b);
    int x=circumference(a);
    System.out.println("thr circumference is : "+x);
    vote(a);
    }
}
