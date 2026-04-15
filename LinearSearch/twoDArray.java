package LinearSearch;

import java.util.Arrays;

public class twoDArray {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3,4,5,6},
                {7,8,9,10},
                {11,12,13,14,15}
        };

        int target = 15;

        int[] ans = range(arr, target);
        System.out.println(Arrays.toString(ans));
        System.out.println(max(arr));
    }

    public static int[] range(int[][] arr, int target) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                if (arr[i][j] == target) {
                    return new int[]{i, j};
                }
            }
        }

        return new int[]{-1,-1}; 
    }
    
    public static int max(int arr[][]) 
    {
    	int maxx = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                if (arr[i][j] > maxx) 
                {
                	maxx = arr[i][j];
                }
            }
        }
        return maxx;
  
    }
    
}