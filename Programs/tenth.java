import java.util.Scanner;

import javax.sql.rowset.spi.SyncResolver;
public class tenth {
    public static void main(String[] args){
        int i;
        Scanner sc = new Scanner(System.in);

       // int size=sc.nextInt();
        int array[]= new int[6];
        // for(i=0;i<5;i++){
        //     // int arr[]=sc.nextInt[5];
        //     System.out.println(array[i]);
        // }
       
        int[] marks=new int[3];
        marks[0]=23;
        marks[1]=43;
        marks[2]=32;

        System.out.println("the marks of "+marks[1]);

        for(i=0;i<3;i++){
            System.out.print(marks[i]+" ");
        }
        System.out.println();
        for(i=0;i<5;i++){
            array[i]=sc.nextInt();
        }
         for(i=0;i<5;i++){
            System.out.print(array[i]+" ");
        }System.out.println();
        int max=5;
        for(i=0;i<5;i++){
            if(max == array[i])
            System.out.print("found at index "+i);
            else 
            System.out.println("value not found");
        }
        //function to add two number 
    }
}
