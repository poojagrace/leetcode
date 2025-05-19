public class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int oldRows = mat.length;
        int oldCols = mat[0].length;

        
        int totalElements = oldRows * oldCols;

        
        if (totalElements != r * c) {
            return mat; 
        }

        
        int[][] newMatrix = new int[r][c];

        
        for (int i = 0; i < totalElements; i++) {
            
            int oldRow = i / oldCols;
            int oldCol = i % oldCols;

            
            int newRow = i / c;
            int newCol = i % c;

            
            newMatrix[newRow][newCol] = mat[oldRow][oldCol];
        }

        return newMatrix;
    }
}
