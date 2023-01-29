package none;

import netscape.javascript.JSObject;

import java.util.HashMap;
import java.util.Map;

public class LargestSum {
    public static void main(String[] args) {
        int arr[]= {-2,4};
        Map<String, String> m= new HashMap<>();

        System.out.println(getLargestSum(arr));
    }

    private static int getLargestSum(int[] arr) {
        int maxSum = 0;
        if(arr.length>0){
            int j=1;
            int max = arr[0];
            maxSum = arr[0];
            int n = arr.length;
            while (j < n) {
                if (max > 0) {
                    if (arr[j] + max > 0) {
                        max = arr[j] + max;
                    } else {
                        max = 0;
                    }
                } else if (arr[j] > max) {
                    max = arr[j];
                }
                if (maxSum < max) {
                    maxSum = max;
                }
                j++;
            }
        }
        return  maxSum;
    }
}
