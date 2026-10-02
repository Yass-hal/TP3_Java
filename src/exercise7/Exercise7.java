package exercise7;

public class Exercise7 {
    public static double stdev(int [] arr){
        int numberOfElements=arr.length;
        int sum=0;
        for (int e:arr){
            sum+=e;
        }
        double average=(double)sum/numberOfElements;
        double sumOfdifferences=0;
        for (int e:arr){
            sumOfdifferences+=Math.pow((e-average),2);
        }
        double result=sumOfdifferences/(numberOfElements-1);

        return Math.sqrt(result);
    }
    public static void main(String[] args){
        int [] arr={1, -2, 4, -4, 9, -6, 16, -8, 25, -10};
        System.out.println(Exercise7.stdev(arr));
    }


}
