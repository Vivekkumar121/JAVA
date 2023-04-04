import java.util.Scanner;

public class third {
    public static void main(String[] args) {
        int i, j;
        for (i = 0; i < 6; i++) {
            for (j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        Scanner objScanner = new Scanner(System.in);
        System.out.println("enter the value of c");
        int c=objScanner.nextInt();
        while(c>0){
            for ( i = 0; i < c; i++){
                System.out.print(i);
                System.out.print(" ");

            }break;
        }
    }
}
