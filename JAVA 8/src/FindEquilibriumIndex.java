package none;

public class FindEquilibriumIndex {
    public static void main(String[] args) {
        int arr []=  new int[]{2, -2, 1};
        System.out.println(getEquilibriumindex(arr));
    }

    private static int getEquilibriumindex(int[] arr) {
        int sum = 0;
        int i=0;
        int left =0;
        int right=0; //  -7, 1, 5, 2, -4, 3, 0
        for (int j = 0; j < arr.length; j++) {
            sum += arr[j];
        }
        while (i < arr.length) {
            right = sum - (arr[i] + left);
            if (right == left) {
                return i;
            } else {
                left += arr[i];
            }
            i++;
        }
        return -1;
    }
}
