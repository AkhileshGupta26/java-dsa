package RECURSION.Introduction;

public class nto1 {
    public static void main(String argu[]){
        fun(5);
        funrev(5);
        funboth(5);
        sum1N(5);
        //  Work of f(n) = print n to 1
        // Work of f(n-1) = print n-1 to 1
    }
    static void fun(int n){
        if(n==0){
            return ;// not return n , no value is returned   
        }
        // When n == 0, the function does not return any value (as it's void). Instead, 
        // it simply exits the current call, ensuring no further recursion occurs.
        System.out.println(n);// Updation
        fun(n-1);

    }
    static void funrev(int n){
        if(n==0){
            return ;// not return n , no value is returned   
        }
        
        fun(n-1);
        System.out.println(n);
    }

    static void funboth(int n){
        if(n==0){
            return ;// not return n , no value is returned   
        }
        System.out.println(n);
        funboth(n-1);
        System.out.println(n);
    }
    static int sum1N(int n){
        if(n==0){
            return 0;
        }
        else{
            return n + sum1N(n-1);
        }
    }
    
    
}
