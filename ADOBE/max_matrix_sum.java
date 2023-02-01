package ADOBE;
import java.util.*;
public class max_matrix_sum {
    public long maxMatrixSum(int[][] matrix) {
        long absTotal = 0, negative = 0, min = Long.MAX_VALUE;
        for (int r = 0; r < matrix.length; ++r) {
            for (int c = 0; c < matrix.length; ++c) {
                if (matrix[r][c] < 0) {
                    // System.out.println("neg="+negative);
                    negative++;
                }
                absTotal += Math.abs(matrix[r][c]);
                min = Math.min(min, Math.abs(matrix[r][c]));
                // System.out.println("abs="+absTotal);
                // System.out.println("min="+mi);
                // System.out.println();
            }
        } 
        return absTotal - (negative % 2 == 0 ? 0 : 2 * min);
    }
}
