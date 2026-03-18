package RECURSION.Pattern;

public class Triangle {
    public static void main(String argu[]){
        triangle(5,0);
        // triangle(5,0) means 5rows and 5 columns are printing

    }
    static void triangle(int row,int col){
        if(row==0){
            return;
        }
        if(col<row){
            System.out.print("*");
            triangle(row,col+1);
        }
        else{
            System.out.println();
            triangle(row-1,0);
        }
    }
}
