//Search for element in 2D array(matrix).

import java.util.Arrays;

public class Q2 {
    public static void main(String[] args) {
        int matrix[][]={
                        {10, 20, 30},
                        {12, 16, 18},
                        {34, 38, 40}
                    };
        System.out.println(Arrays.toString(search(matrix, 38)));
    }
    static int[] search(int mat[][],int target){
        int r = 0;
        int c = mat.length - 1;
        while (r < mat.length && c >= 0) {
            if (mat[r][c] == target) {
                return new int[]{r, c};
            }if (mat[r][c] < target) {
                r++;
            }else {
                c--;
            }
        }
        return new int []{-1,-1};
    }
}
