import java.util.Scanner;

public class fifth_pattern {
    public static void main(String[] args) {
        // Scanner objScanner= new Scanner(System.in);
        // int a=objScanner.nextInt();
        // int b=objScanner.nextInt();
        // System.out.println("the given value is "+a);
        
        // // for(int i=1;i<=4;i++){
        //     for(int j=4;j>=i;--j){
        //     System.out.print("* ");
        //     }System.out.println();
        //                                                   //   Hollow Rectangle
//         // } 
//     }
// } 
         int m=4, n=4;                                                 
        //     for(int i=1;i<=m;i++){
        //         for(int j=1;j<=n;j++){
        //             if(i==1 || i==m || j==1 ||j==n || (j==2 && i!=3) || (j==3 && i!=2)){
        //                 System.out.print("* ");
        //             }
        //             else System.out.print("  ");
        //         }
        //             System.out.print("\n");
        //     }
                                             //inverted pyramid
    //     for(int i=1;i<=m;i++){
    //         for(int j=1;j<=m-i;j++){
                
    //             System.out.print(" ");
    //          }
    //          for(int j=1;j<=i;j++){
    //           System.out.print("+");
    //     }System.out.println();
    // }                                                     pyramid
    // for(int i=1;i<=7;i++){
    //     for(int j=1;j<=i;j++){
    //         System.out.print(j+" ");
    //     }System.out.println();
    // },       
                                                //    Inverted half pyramid
        
        // m=7;
        // for(int i=m;i>=1;--i){
        //     for(int j=1;j<=i;j++){
        //         System.out.print(j+" ");
        //     }
        //     System.out.println();
        // }
    //        n=1;                                              //ffloy's Triangle
    //     for(int i=1;i<=5;i++){
           
    //         for(int j=1;j<=i;j++){
    //             System.out.print(n+" ");
    //         n++;
    //     }System.out.println();
    // }
                                                                  //0-1 Triangle
        int q=1,s=0;
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                if((i+j)%2==0){
                    System.out.print("1 ");
                }
                else if((i+j)!=0){
                    System.out.print("0 ");
                }
               
            } System.out.println();
        }
        }
    
    }


