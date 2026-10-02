package exercise1;
public class Exercise1 {
    public static void printArray(int [] arr){
        for (int i =0;i<arr.length;i++){
            System.out.println("Element "+i+" contents "+arr[i]);
        }
    }
    public static int[] sortIntegers(int [] arr){
        int [] newArr= new int [arr.length];
        for (int i =0;i<arr.length;i++){
            newArr[i]=arr[i];
        }
        for (int i =0;i<newArr.length-1;i++)
        {
            int maxIdx =i;

            for (int j=i+1;j<newArr.length;j++)
            {
                if (newArr[j]> newArr[maxIdx])
                {
                    maxIdx =j;
                }
            }
            if (i != maxIdx){
                int temp=newArr[i];
                newArr[i]=newArr[maxIdx];
                newArr[maxIdx]=temp;
            }
        }
        return newArr;
    }
    public static void main(String [] args){
        int [] arr= {106,26,81,5,15};
        Exercise1.printArray(arr);
        int [] newarr=Exercise1.sortIntegers(arr);
        System.out.println("Sorted array");
        Exercise1.printArray(newarr);
        System.out.println(13/2);

    }
}


