import java.util.Scanner;

public class fourth {
    public static void main(String[] args){
        Scanner objScanner=new Scanner(System.in);
        System.out.println("Enter the value ");
        int a=objScanner.nextInt();
        int z=1;
                                                 //factorial
        for(int i=1;i<=a;i++){
           
            z=z*i;
            //System.out.print(" ");
        }                                          
        System.out.println("the factorial is "+z);
        // do{
        //     System.out.print("first ");
        //     a--;
        // } while(a>0);
        z=0;                                  //first of n natural numbers
        for(int i=1;i<=a;i++){
            z+=i;
        }
        System.out.println("the sum of n natural numbers is "+z);
        z=0;
        for(int i=1;i<11;i++){
            z=i*a;
            System.out.println(a+" * "+i+" = "+z);
            //System.out.println(z);
        }
        //System.out.println(z);
    }
}
