import java.util.*;

import javax.sound.sampled.SourceDataLine;
import javax.sql.rowset.spi.SyncResolver;
public class second {
    public static void main(String args[]){
        // Scanner sc = new Scanner(System.in);
        // System.out.println("enter the balak age");
        // int age = sc.nextInt();
        // if(age>18){
        //     System.out.println("this is baalikk");
        // }
        // else {
        //     System.out.println("this is naballik");
            
        // }
        Scanner objScanner = new Scanner(System.in);
        // System.out.println("A kki value dijiye");
        // int a = sc.nextInt();
        // System.out.println("B ki value dijiye");
        // int b = sc.nextInt();
        System.out.println("enter the character");
        char a = objScanner.next().charAt(0);
        //fflush();
        // System.out.println("array print kro");
        // String name = sc.nextLine();
        // if(a==b){
        //     System.out.println("A jo h B ke barabar h");
        // }
        // else if(a>b){
        //     System.out.println("A jo h B se bada h ");
        // }
        // else {
        //     System.out.println("B jo h A se bada h ");
        // // }
        // if(a%2!=0){
        //     System.out.println("Bzinga");
        // }
        
        // System.out.println("ye rahi array");
    //System.out.println(name);
    System.out.println(a);
    switch(a){
        case '+' : System.out.println("Addition");
        break;
        case '-' : System.out.println("Subtraction");
        break;
        case '*' : System.out.println("Multiplication");
        break;
        case '/' : System.out.println("Division");
        break;
        default : System.out.println("Invalid");
    }
    }
    
}
