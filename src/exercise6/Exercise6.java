package exercise6;
import exercise1.Exercise1;


public class Exercise6 {
    public static int median(int [] arr){
        int [] sortedArr=Exercise1.sortIntegers(arr);
        return sortedArr[sortedArr.length/2];
    }
    public static void main(String[] args){
        int [] test={5, 2, 4, 17, 55, 4, 3, 26, 18, 2, 17};
        int [] test2={42, 37, 1, 97, 1, 2, 7, 42, 3, 25, 89, 15, 10, 29, 27};
        System.out.println("Test1");
        System.out.println(Exercise6.median(test));
        System.out.println("Test2");
        System.out.println(Exercise6.median(test2));
    }

}
