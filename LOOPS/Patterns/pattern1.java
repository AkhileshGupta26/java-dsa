public class pattern1 {
    public static void main(String argu[]){
        int n=5;
        pattern1(n);
        pattern2(n);
        pattern3(n);
        pattern4(n);
        revpattern2(n);
        revpattern3(n);

    }
    static void pattern1(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
     static void pattern2(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern3(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j  );
            }
            System.out.println();
        }
    }
    static void pattern4(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i );
            }
            System.out.println();
        }
    }
    static void revpattern2(int n){
        for(int i=n;i>=0;i--){
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void revpattern3(int n){
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(j  );
            }
            System.out.println();
        }



}
