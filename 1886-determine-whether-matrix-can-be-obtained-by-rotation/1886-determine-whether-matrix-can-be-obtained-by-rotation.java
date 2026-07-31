class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        for(int k = 0; k < 4 ; k ++) {
            boolean ans = true;

            for(int i = 0 ; i < mat.length; i++) {
                for(int j = 0; j < mat.length ; j++) {
                    if(mat[i][j] != target[i][j]) {
                        ans = false;
                        break;
                    }
                }
                if (!ans) {
                    break;
                }
            }

            if(ans) {
                return true;
            }
            int[][] arr = new int[mat.length][mat.length];
            for(int i = 0; i < mat.length; i++) {
                for(int j = 0 ; j < mat.length ; j++) {
                    arr[j][mat.length - 1 - i] = mat[i][j];
                }
            }
            mat = arr;
        }
        return false;
    }
}