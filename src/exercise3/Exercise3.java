package exercise3;


import java.util.Arrays;

public class Exercise3 {
    public static void main(String[] args){
        int [][] arr=new int[5][];
        int idx=1;
        for (int i=0;i<arr.length;i++)
        {
            int [] tempArray=new int[i+1];
            for (int j=0;j<tempArray.length;j++){
                tempArray[j]=idx;
                idx++;
            }
            arr[i]=tempArray;
        }
        for (int [] a:arr){
            System.out.println(Arrays.toString(a));
        }
    }

}
