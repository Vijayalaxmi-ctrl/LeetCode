class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        for(int i = 0; i < matrix.length ; i++) {
            int ind = binarySearch(matrix[i],target);
            if(ind != -1) {
                return true;
            }
        }
        return false;
    }

    public int binarySearch(int[] mat, int k) {
        int low = 0;
        int high = mat.length-1;
        while(low <= high) {
            int mid = low + (high - low)/2;
            if(mat[mid] == k) {
                return mid;
            }else if(mat[mid] < k) {
                low = mid +1;
            }else {
                high = mid  - 1;
            }
        }
        return -1;
    }
}