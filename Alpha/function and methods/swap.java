public class swap {
    public static int swap(int a, int b){
        int c=a;
        a=20;
        b=10;
        int prod=a*b;
         System.out.println("a after swap : "+a);
        System.out.println("b after swap : "+b);
        System.out.println("product : "+a*b);
        return prod;
    }
    public static void main(String[] args) {
        int a=10;
        int prod;
        int b=20;
        System.out.println("a before swap : "+a);
        System.out.println("b before swap : "+b);
        prod=swap(a,b);
        System.out.println(prod);
       
    }
}
