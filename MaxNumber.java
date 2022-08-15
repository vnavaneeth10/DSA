package DSA;
import java.util.Arrays;

public class MaxNumber {
    public static void main(String[] args) {
        
    
    int[][] arr = {
        {22,3,4,1},
        {12,23,35,17},
        {77,89,65,90},
        {18,12}
    };
    int target = 1;
    int[] ans = search (arr, target);//format of return value {row, col}
    System.out.println(Arrays.toString(ans));

    System.out.println(max(arr));
    
    System.out.println(Integer.MIN_VALUE);
}
static int[] search(int[][] arr, int target) {
    for (int row = 0; row < arr.length;row++){
        for (int col = 0; col<arr[row].length; col++){
             if(arr[row][col] == target) {
                return new int[]{row, col};
             }
        }
    }
    return new int[]{-1,-1};
}

static int max (int[][] arr) {
    int max = Integer.MIN_VALUE;
    for(int[] ints : arr) {
        for(int element : ints) {
            if(element > max) {
                max =element;
            }
        }
    }
    return max;
}
}

