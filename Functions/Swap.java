package Functions;

public class Swap {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        System.out.println("Before swap: a="+a+" b="+b);
        int temp=a;
        a=b;
        b=temp;
        System.out.println(a+" "+b);
        swap(a, b);
        System.out.println(a+" "+b);
    }
    static void swap(int a,int b){

        int temp=a;
        a=b;
        b=temp;
        System.out.println("After swap: a="+a+" b="+b);
    }
    
}
