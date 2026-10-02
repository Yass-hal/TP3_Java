package exercise5;

import java.util.Arrays;

public class Exercise5 {
    public static int[][] addMatrix(int [][] arr1,int [][] arr2){
        int [][] result =new int[arr1.length][arr1[0].length];
        for (int i=0;i<arr1.length;i++){
            for (int j=0;j<arr1[i].length;j++){
                result[i][j]=arr1[i][j]+arr2[i][j];
            }
        }
        return result;
    }
    public static void main(String[] args){
        int [][] arr1={
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        int [][] arr2={
                {9, 8, 7},
                {6, 5, 4},
                {3, 2, 1}};
        int [][] result= Exercise5.addMatrix(arr1,arr2);
        for (int [] a :result){
            System.out.println(Arrays.toString(a));
        }

    }

}
