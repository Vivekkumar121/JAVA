class first {
    first(){
        System.out.println("a ki non parameterised ");
    }
    public void first(int a,int b){
        System.out.println("b ki parameterised ");
    }
    void sum(int a, int b){
        System.out.println(a+b);
    }
   
}
class second extends first {
    second(){
        System.out.println("b ki non parameterised ");
    }
    second(int a,int b){    
        System.out.println("b ki parameterised ");
    }
    void sum(int a,int b){
        System.out.println(a-b);
    }
    
}
public class firstt {
    public static void main(String[] args) {
        first ab = new second();
        ab.first(2,3);
        ab.sum(4,5);
    }
    
}