public class JumpingProb {
    public static void main(String[] args) {
        int arr[] = {3, 3, 0, 2, 2, 3};
        int store[] = new int[arr.length + 1];
        store[arr.length] = 1;
        System.out.println(findNumberOfWays(arr, arr.length - 1, store));
    }
    private static int findNumberOfWays(int[] arr, int i, int [] store) {
        if(store[i]!=0){
            return store[i];
        }

        if(arr[i]==0){
          return store[i]=0;
        } else {
            int diff = arr.length - i;
            if(diff > arr[i]){
                diff=arr[i];
            }
            int j = i;
            while(j<=diff) {
                store[i] = findNumberOfWays(arr, j+1, store);
            }
        }
        return 0;
    }
}
