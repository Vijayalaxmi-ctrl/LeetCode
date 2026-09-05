class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int low = 0;
        int high = n -1;
        while(low <= high) {
            int mid = low + (high - low)/2;
            int row = maxElem(mat,m,n,mid);
            int left = -1;
            int right = -1;
            if(mid - 1 >= 0) {
                left = mat[row][mid-1];
            }
            if(mid + 1 < n) {
                right = mat[row][mid+1];
            }

            if(mat[row][mid] > left && mat[row][mid] > right) {
                return new int[] {row,mid};
            } else if ( mat[row][mid] < left){
                
                    high = mid - 1;
                
             }else {
                low = mid + 1;
             }

        }
        return new int[] {-1,-1};
    }

    public int maxElem(int[][] mat, int m , int n , int col) {
        int max = -1;
        int ind = -1;
        for(int i = 0; i < mat.length ; i++) {
            if(mat[i][col] > max) {
                max = mat[i][col] ;
                ind = i;
            }
        }
        return ind;
    }
}