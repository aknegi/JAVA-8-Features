package none;

import java.math.BigDecimal;
import java.util.Arrays;

public class PatternCheck {
    public static void main(String[] args) {
        String str = "ABCDABDCE";
        String pattern = "ABCD";
        BigDecimal s = new BigDecimal("".toString());
        char patternArray[] = pattern.toCharArray();
        //printPatternMatcher(str,pattern,patternArray);}
    }
    private static void printPatternMatcher(String str, String pattern, char[]patternArray) {
        char arr[]= new char[pattern.length()];
        int i=0;
        int j=0;
        int k=0;
        while(k<str.length()){
            if (pattern.contains(String.valueOf(str.charAt(k)))) {
                if ((k - i) < arr.length &&j<arr.length) {
                    arr[j] = str.charAt(k);
                    j++;
                    k++;
                } else if (Arrays.equals(arr, patternArray)) {
                    for (int l = 0; l < arr.length; l++) {
                        System.out.print(arr[l] + " ");
                        arr[l] = 0;
                    }
                    System.out.println();
                    i++;
                    k = i;
                    j=0;
                } else {
                    i++;
                    k = i;
                    j=0;
                }

            } else {
                k = k + 1;
                i = k;
            }
        }
    }
}