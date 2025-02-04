package Algorithms;

public class KadaneAlgorithm {

    public long maxSubArray(int[] arr, int n   ) {
        long sum = 0;
        long max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            sum += arr[i];

            if(sum > max) {
                max = sum;
            }
            if(sum<0){
                sum = 0;
            }

        }
        return max;

    }
    public static void main(String[] args) {

        KadaneAlgorithm ka = new KadaneAlgorithm();
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(ka.maxSubArray(arr, arr.length));
    }
}
