class Solution {
    public void setZeroes(int[][] matrix) {
        
        int[] v = new int[matrix.length];
        int[] h = new int[matrix[0].length];
        
        Arrays.fill(v,-1);
        Arrays.fill(h,-1);
        
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(matrix[i][j]==0){
                    v[i]=0;
                    h[j]=0;
                }
            }
        }
        
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(v[i]==0 || h[j]==0){
                    matrix[i][j]=0;
                }
            }
        }
        
        
        
    }
}