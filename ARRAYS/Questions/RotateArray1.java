package Questions;

public class RotateArray1 {
    public static void main(String[] args) {
        System.out.println("Rotate Array");

        // Rotate an array by 1 to left
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        System.out.println("Original Array:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
        rotatedArray(arr);
        System.out.println("Array after rotation:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static void rotatedArray(int[] arr){
        int temp=arr[0];
        for(int i=1;i<=arr.length-1;i++){
            arr[i-1]=arr[i];
        }
        arr[arr.length-1]=temp;
    }
    
}
