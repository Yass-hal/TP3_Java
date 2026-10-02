package exercise2;
import exercise1.Exercise1;

public class Exercise2 {
    public static void reverse(int [] arr){
        Exercise1.printArray(arr);
        for (int i=0;i<(arr.length)/2;i++){
            int temp=arr[i];
            arr[i]=arr[arr.length-i-1];
            arr[arr.length-i-1]=temp;
        }
        System.out.println("After reversing");
        Exercise1.printArray(arr);
    }
    public static void main (String [] args){
        int [] arr={1,2,3,4,5};
        Exercise2.reverse(arr);
    }
}
