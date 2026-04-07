import java.util.*;

public class SpiralMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int r = sc.nextInt();
        int c = sc.nextInt();
        
        int[][] mat = new int[r][c];
        
        // Input
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        
        int top = 0, bottom = r - 1;
        int left = 0, right = c - 1;
        
        StringBuilder result = new StringBuilder();
        
        while (top <= bottom && left <= right) {
            
            // Top row
            for (int i = left; i <= right; i++) {
                result.append(mat[top][i]).append(" ");
            }
            top++;
            
            // Right column
            for (int i = top; i <= bottom; i++) {
                result.append(mat[i][right]).append(" ");
            }
            right--;
            
            // Bottom row
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    result.append(mat[bottom][i]).append(" ");
                }
                bottom--;
            }
            
            // Left column
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    result.append(mat[i][left]).append(" ");
                }
                left++;
            }
        }
        
        // Print without trailing space
        System.out.print(result.toString().trim());
    }
}
