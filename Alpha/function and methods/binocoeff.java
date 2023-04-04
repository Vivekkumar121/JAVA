public class binocoeff {       //  nCr
    public static int fact(int a){
      int j=1;
      for(int i=1;i<=a;i++){
        j*=i;
      }
      return j;
    }
    public static void main(String[] args) {
        int z=fact(5);
        int x=fact(2);
        int c=fact(3);
        int bino=z/(x*c);
        System.out.println(bino);

    }
}
