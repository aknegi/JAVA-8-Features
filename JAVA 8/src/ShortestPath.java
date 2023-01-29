package none;

public class ShortestPath {
    public static void main(String[] args) {
        int arr[][]= {{1,3,1},{1,5,1},{4,2,1}};
        int i=2;
        int j=2;
        int arr2[][]= new int[3][3];
        System.out.println(  getMinPathSum(arr,i,j,arr2));;
    }

    private static int getMinPathSum(int[][] arr, int i,int j,int[][] arr2) {
        if (i == 0 && j == 0) {
            return arr[i][j];
        }
        if(arr2[i][j]!=0){
            return arr2[i][j];
        }
        if (i == 0 && j > 0 ) {
            return arr2[i][j] = arr[i][j] + getMinPathSum(arr, i, j-1,arr2);
        } else if (i > 0 && j == 0) {
            return  arr2[i][j] = arr[i][j] + getMinPathSum(arr, i - 1, j,arr2);
        } else {
            int top = arr[i][j] + getMinPathSum(arr, i - 1, j,arr2);
            int left = arr[i][j] +  getMinPathSum(arr , i, j - 1,arr2);
            return arr2[i][j] = top < left ? top : left;
        }
    }
}
