package none;

public class CheckSmallestLengthMaxSUm
{
    public static void main(String[] args) {
        int arr []= new int[]{2};
        int k =1;
        System.out.println(findSmallestLength(arr,k));
    }

    private static int findSmallestLength(int[] arr, int K) {

            int length = 0;
        if (arr.length > 0) {
            int i = 0;
            int j = 0;
            int windowSum = 0;  //2,3,-4,5,5,6,5  (7)
            while (j < arr.length) {
                windowSum = windowSum + arr[j];
                if (windowSum > K) {
                    while (i <= j) {
                        if ((windowSum - arr[i]) > K) {
                           windowSum = windowSum-arr[i];
                            i++;
                        } else {
                            length = (j - i) + 1;
                            i++;
                            j=i;
                            break;
                        }
                    }
                } else if (windowSum < 0) {
                    windowSum = 0;
                    j++;
                    i = j;
                } else {
                    j++;
                }
            }
        }
            return length;
    }
}
