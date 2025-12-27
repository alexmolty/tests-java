package demo;

public class DemoAppl {

    public static int sumArray(int[] arr) {
        if (arr == null) return 0;
        int sum = 0;
        for (int i : arr) {
            sum += i ;
        }
        return sum;
    }

    public static double average(int[]arr){
        if (arr == null || arr.length == 0) return 0;
        int sum = sumArray(arr);
        return (double)sum/arr.length;
    }

    public static double averageBug(int[]arr){
        int sum = 0;
        for (int i = 1; i < arr.length; i++) {
            sum += arr[i];
        }
        return (double)sum/arr.length;
    }

    public static int maxValue(int[]arr){
        if (arr.length == 0) return 0;
        int max = arr[0];
        for (int i : arr) {
            if (i > max) max = i;
        }
        return max;
    }
}
