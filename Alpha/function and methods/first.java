///it is a block of code which can be used anytime anywhere in the program
import java.util.*;

import javax.sql.rowset.spi.SyncResolver;
public class first{
    private static Scanner sc;
    public static void main(String[] args) {
        System.out.println("oye print");
        program();
        dusra();
    }
    public static void program(){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int sum=a+b;
        System.out.println(sum);
    }
    private static int dusra(){
        int[] intarr = {1,2,3,4,5,6,7};
        int sum=0;
        for(int i=0;i<7;){
            System.out.print(intarr[i]+" ");
            sum+=intarr[i];
            i++;
        }System.out.println();
        System.out.println("the sum of array is : "+sum);
        System.out.println("this is to find the number is in array or not ? Enter number : ");
        Scanner sc = new Scanner(System.in);
        int z = sc.nextInt();
        for(int i=0;i<7;i++){
        if(z==intarr[i]){
             System.out.println("element found");
             return 0;
        }
    }System.out.println("not found");

return 0;
    }}