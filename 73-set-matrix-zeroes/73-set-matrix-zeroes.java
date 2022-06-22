class Solution {
    public void setZeroes(int[][] matrix) {
        
        int[] v = new int[matrix.length];
        int[] h = new int[matrix[0].length];
        
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j] == 0){
                    v[i] = -1;
                    h[j] = -1;
                }
            }
        }
        
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(v[i]==-1 || h[j] == -1){
                    matrix[i][j] = 0;
                }
            }
        }
        
    }
}